package com.savindu.kfcsrilanka.dao;

import java.sql.SQLException;
import java.util.List;

import com.savindu.kfcsrilanka.model.Product;

public interface ProductManager {
	
	public boolean addProduct(Product product) throws SQLException, ClassNotFoundException;
	public boolean editProduct(Product product) throws SQLException, ClassNotFoundException;
	public boolean deleteProduct(int productCode) throws SQLException, ClassNotFoundException;
	public Product fetchSingleProduct(int productCode) throws SQLException, ClassNotFoundException;
	public List<Product> fetchAllProduct() throws SQLException, ClassNotFoundException;

}
