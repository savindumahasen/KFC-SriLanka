package com.savindu.kfcsrilanka.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.savindu.kfcsrilanka.model.Admin;
import com.savindu.kfcsrilanka.service.AdminService;

public class AdminLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String message ="";
	public AdminService getAdminService() {
		return AdminService.getAdminService();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action_type = request.getParameter("action_type");
			if(action_type.equals("login")) {
			   login(request,response);
			}
		}

	
	
	private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 clearMessage();
		 String userName = request.getParameter("username");
		 System.out.println(userName);
		 String password= request.getParameter("password");
		 System.out.println(password);
		 
		try {
			Admin admin = getAdminService().fetchSingleAdmin(userName);
			System.out.println(admin);
			 if(admin.getUserName()!=null) {
				 if((admin.getPassword()).equals(password)) {
					 RequestDispatcher rd= request.getRequestDispatcher("add-product.jsp");
					 rd.forward(request, response);
				 }else {
					 message = "Login is not successfull";
				     request.setAttribute("feedbackmessage", message);
					 RequestDispatcher rd= request.getRequestDispatcher("AdminLogin.jsp");
					 rd.forward(request,response);
					 
				 }
		} 
		}catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			message= e.getMessage();
		}
		request.setAttribute("feedbackmessage",message);
		RequestDispatcher rd= request.getRequestDispatcher("AdminLogin.jsp");
		rd.forward(request, response);
		
		 }
		 
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	private void clearMessage() {
		message="";
	}

}
