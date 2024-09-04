package com.savindu.kfcsrilanka.dao;

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

	@Override
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProduct(int productCode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product fetchSingleProduct(int productCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> fetchAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

}
