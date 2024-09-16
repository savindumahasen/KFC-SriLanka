package com.savindu.kfcsrilanka.dao;

import java.sql.SQLException;

import com.savindu.kfcsrilanka.model.Customer;

public interface CustomerRegister {
	
	public boolean customerRegistration(Customer customer) throws SQLException, ClassNotFoundException;
	public Customer fetchSingleCustomer(String userName) throws SQLException, ClassNotFoundException;

}
