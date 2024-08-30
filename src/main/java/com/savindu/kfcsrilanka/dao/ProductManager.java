package com.savindu.kfcsrilanka.dao;

import java.util.List;

import com.savindu.kfcsrilanka.model.Product;

public interface ProductManager {
	
	public boolean addProduct(Product product);
	public boolean editProduct(Product product);
	public boolean deleteProduct(int productCode);
	public Product fetchSingleProduct(int productCode);
	public List<Product> fetchAllProduct();

}
