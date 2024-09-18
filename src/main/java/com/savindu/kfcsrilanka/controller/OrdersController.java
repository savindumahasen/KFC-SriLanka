package com.savindu.kfcsrilanka.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OrdersController
 */
public class OrdersController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    String message = "";

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		clearMessage();
		String action_type =request.getParameter("action_type");
		if(action_type.equals("order")) {
			RequestDispatcher rd= request.getRequestDispatcher("Orders.jsp");
			rd.forward(request, response);
		}else if(action_type.equals("order_now")){
			String accountNumber = request.getParameter("accountnumber");
			String confirmAccountNumber = request.getParameter("confirmaccountnumber");
			if(accountNumber.equals(confirmAccountNumber)) {
				if(accountNumber.length() >=12) {
				 message = "Order is successfully confirmed!";
			     request.setAttribute("feedbackmessage",message);
			     RequestDispatcher rd=request.getRequestDispatcher("Orders.jsp");
			     rd.forward(request, response);
				}
			    else {
			    	message = "Your Account Number should have 12 numbers";
			    	request.setAttribute("feedbackmessage",message);
					RequestDispatcher rd=request.getRequestDispatcher("Orders.jsp");
					rd.forward(request, response);
			    	
			     }
			}else {
				message = "Your Account Number and Confirm Account Numer is not equal";
			    request.setAttribute("feedbackmessage",message);
			    RequestDispatcher rd=request.getRequestDispatcher("Orders.jsp");
			    rd.forward(request, response);
			}
			}
			
		}
	 private void clearMessage() {
		 message="";
	 }

}
