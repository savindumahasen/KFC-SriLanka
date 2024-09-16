package com.savindu.kfcsrilanka.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.savindu.kfcsrilanka.model.Customer;
import com.savindu.kfcsrilanka.service.CustomerService;

/**
 * Servlet implementation class CustomerRegistrationController
 */
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String message = "";
	
	private CustomerService getCustomerService() {
		
		return CustomerService.getCustomerServiceObj();
	}
       



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action_type= request.getParameter("action_type");
		if(action_type.equals("login")) {
			customerLogin(request,response);
		}
		

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action_type= request.getParameter("action_type");
		if(action_type.equals("register")) {
			registerCustomer(request,response);
		}
		
	}
	private void registerCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		String confirmPasswod = request.getParameter("confirmpassword");
		Customer customer=new Customer();
		customer.setUserName(userName);
		customer.setPassword(password);
		customer.setConfirmPassword(confirmPasswod);
		try {
			if(getCustomerService().customerRegister(customer)) {
				RequestDispatcher rd= request.getRequestDispatcher("CustomerLogin.jsp");
				rd.forward(request, response);
				
			}else {
				message = "Customer Registration is not successfully completed !";
				request.setAttribute("feedbackmessage", message);
				RequestDispatcher rd=request.getRequestDispatcher("Customer-Registration.jsp");
				rd.forward(request,response);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			   message = e.getMessage();
			   request.setAttribute("feedbackmessage",message);
			   RequestDispatcher rd=request.getRequestDispatcher(message);
			   rd.forward(request, response);
		}
		
		
		
	}
	private void customerLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName =request.getParameter("username");
		String password=request.getParameter("password");
		String confirmPassword =request.getParameter("confirmpassword");
		Customer customer;
		try {
			customer = getCustomerService().fetchSingleCustomer(userName);
			if(customer.getUserName() !=null) {
				if((customer.getPassword()).equals(password) && (customer.getConfirmPassword().equals(confirmPassword))) {
					 if(password.equals(confirmPassword)) {
						  RequestDispatcher rd=request.getRequestDispatcher("Home.jsp");
						  rd.forward(request, response);
						 
					 }else {
						 message = "Your confirmpassword and password is not equal"; 	 
					 }
				}else {
					message= "Please check your password and confirmpassword";
				}
			}else {
				message = "User Cannot found! Please register first";
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			 message = e.getMessage();
		}
		 request.setAttribute("feedbackmessage", message);
		 RequestDispatcher rd= request.getRequestDispatcher("CustomerLogin.jsp");
		 rd.forward(request, response);
		
	}
	

}
