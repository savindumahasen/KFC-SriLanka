package com.savindu.kfcsrilanka.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.savindu.kfcsrilanka.service.ProductService;

public class ProductManager extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	public ProductService getProductService() {
		return  ProductService.getproductService()
	}
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action_type ="";
		if(action_type.equals("add")) {
			addProduct(request, response);
		}else if (action_type.equals("edit")){
			editProduct(request,response);
		}else if(action_type.equals("delete")) {
			deleteProduct(request, response);
		}
	}
	
	private void addProduct(HttpServletRequest request,HttpServletResponse response) {
		
	}
	private void editProduct(HttpServletRequest request,HttpServletResponse response) {
       
   }
	private void deleteProduct(HttpServletRequest request,HttpServletResponse response) {
}
	private void fetchSingleProduct(HttpServletRequest request,HttpServletResponse response) {
		
	}
	private void fetchAllProduct(HttpServletRequest request,HttpServletResponse response) {
		
	}
}
