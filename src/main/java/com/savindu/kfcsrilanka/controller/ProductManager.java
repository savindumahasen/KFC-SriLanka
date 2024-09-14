package com.savindu.kfcsrilanka.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.savindu.kfcsrilanka.model.Product;
import com.savindu.kfcsrilanka.service.ProductService;

public class ProductManager extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private String message="";
	
	public ProductService getProductService() {
		return  ProductService.getproductService();
	}
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 String action_type= request.getParameter("action_type");
	 if(action_type.equals("single")) {
		 fetchSingleProduct(request,response);
		 
	 }else if (action_type.equals("all")) {
		 fetchAllProduct(request,response);
	 }
	 RequestDispatcher rd= request.getRequestDispatcher("add-product.jsp");
	 rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action_type =request.getParameter("action_type");
		if(action_type.equals("add")) {
			addProduct(request, response);
		}else if (action_type.equals("edit")){
			editProduct(request,response);
		}else if(action_type.equals("delete")) {
			deleteProduct(request, response);
		}
	}
	
	private void addProduct(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		Product product=new Product();
		product.setProductName(request.getParameter("productname"));
		product.setProductPrice(Double.parseDouble(request.getParameter("productprice")));
		
		try {
			if(getProductService().addProduct(product)) {
				message = "Product is successfully added";
				
			}else {
				message = "Product is not successfully added";
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			    message= "Operation failde! "+e.getMessage();
		}
		request.setAttribute("feedbackmessage",message);
		RequestDispatcher rd= request.getRequestDispatcher("add-product.jsp");
		rd.forward(request, response);
				
		}
		
	
	private void editProduct(HttpServletRequest request,HttpServletResponse response) {
       
   }
	private void deleteProduct(HttpServletRequest request,HttpServletResponse response) {
		
   }
	private void fetchSingleProduct(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		int productCode = Integer.parseInt(request.getParameter("productcode"));
		try {
			Product product = getProductService().fetchSingleProduct(productCode);
			if(product.getProductCode()>0) {
				request.setAttribute("product", product);
				RequestDispatcher rd= request.getRequestDispatcher("Update-product.jsp");
				rd.forward(request, response);
			}else {
				message =  "No Record found";
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			 message = e.getMessage();
		}
		request.setAttribute("feedbackmessage",message);
		RequestDispatcher rd= request.getRequestDispatcher("search-product.jsp");
		rd.forward(request, response);
		
		
		
	}
	private void fetchAllProduct(HttpServletRequest request,HttpServletResponse response) {
		
	}
}
