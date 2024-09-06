package com.savindu.kfcsrilanka.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.savindu.kfcsrilanka.model.Product;

public class ProductManagerImp implements ProductManager {
	/*
	 * 1. Import packages
	 * 2. Load the drivers
	 * 3. Establish the connection
	 * 4. Prepared the statement
	 * 5. Execute the query
	 * 6. Process the results
	 * 7. Close the statement and connection
	 */
	private Connection getConnection() {
		
		return null;
	}

	@Override
	public boolean addProduct(Product product) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = getConnection();
		//String query = "INSERT INTO product(name,price) VALUES ("+product.getProductName()+","+product.getProductPrice()+")";
		//Statement st= connection.createStatement();
		/* 	if (st.executeUpdate(query)>0) {
			result=true;
		*/
		String query = "INSERT INTO product_kfc(name,price) VALUES (?,?)";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1,  product.getProductName());
		ps.setDouble(2, product.getProductPrice());

		boolean result=false;
		if(ps.executeUpdate()>0) {
			result=true;
	    }
		ps.close();
		connection.close();
		return false;
	}

	@Override
	public boolean editProduct(Product product) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection =getConnection();
		String query = "UPDATE product_kfc SET name=?, price=? WHERE product_code =?";
		PreparedStatement ps =connection.prepareStatement(query);
		ps.setString(1, product.getProductName());
		ps.setDouble(2,product.getProductPrice());
		ps.setInt(3,product.getProductCode());
		boolean result =false;
		if (ps.executeUpdate()>0) {
			result=true;
		}
		
		ps.close();
		connection.close();
		return result;
		
		
		
		
	}

	@Override
	public boolean deleteProduct(int productCode) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection =getConnection();
		String query = "DELETE FROM product_kfc WHERE product_code=?";
		PreparedStatement ps= connection.prepareStatement(query);
		ps.setInt(0, productCode);
		boolean result =false;
		if (ps.executeUpdate()>0) {
			result =true;
		}
		
		return result;
	}

	@Override
	public Product fetchSingleProduct(int productCode) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = getConnection();
		String query = "SELECT * FROM product_kfc WHERE product_code=?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, productCode);
		ResultSet result =ps.executeQuery();
		Product product = new Product();
		while(result.next()) {
			product.setProductCode(result.getInt("product_code"));
			product.setProductName(result.getString("name"));
			product.setProductPrice(result.getDouble("price"));
		}
		
		ps.close();
		connection.close();
		return product;
	}

	@Override
	public List<Product> fetchAllProduct() throws SQLException {
		// TODO Auto-generated method stub
		Connection connection =getConnection();
		String query = "SELECT * FROM product_kfc";
		Statement st = connection.createStatement();
		List<Product> productList = new ArrayList<Product>();
		ResultSet result = st.executeQuery(query);
		while (result.next()) {
			Product product = new Product();
			product.setProductCode(result.getInt("product_code"));
			product.setProductName(result.getString("name"));
			product.setProductPrice(result.getDouble("price"));
			productList.add(product);
		}
		st.close();
		connection.close();
	
		
		return productList;
	}

}
