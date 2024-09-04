package com.savindu.kfcsrilanka.dao;

import java.sql.SQLException;
import java.util.List;

import com.savindu.kfcsrilanka.model.Product;

public interface ProductManager {
	
	public boolean addProduct(Product product) throws SQLException;
	public boolean editProduct(Product product) throws SQLException;
	public boolean deleteProduct(int productCode);
	public Product fetchSingleProduct(int productCode);
	public List<Product> fetchAllProduct();

}
