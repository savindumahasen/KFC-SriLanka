package com.savindu.kfcsrilanka.service;
import java.util.List;

import com.savindu.kfcsrilanka.dao.ProductManager;
import com.savindu.kfcsrilanka.dao.ProductManagerImp;
import com.savindu.kfcsrilanka.model.Product;

public class ProductService {
	
	private static ProductService productServiceObj;
	
	
private ProductService() {
	
}

private ProductManager getProductManagerDAO() {
	
	return new ProductManagerImp();
}

public synchronized static ProductService ProductService() {
	if(productServiceObj== null) {
		productServiceObj=new ProductService();
		
	}
	return productServiceObj;
}
public boolean addProduct(Product product) {
	
	return getProductManagerDAO().addProduct(product);
}
public boolean editProduct(Product product) {
     return getProductManagerDAO().editProduct(product);	
}
public boolean deleteProduct(int productCode) {
	return getProductManagerDAO().deleteProduct(productCode);
}
public Product fetchSingleProduct(int productCode) {
	return getProductManagerDAO().fetchSingleProduct(productCode);
}
public List<Product> fetchAllProduct(){
	return getProductManagerDAO().fetchAllProduct();
}

}
