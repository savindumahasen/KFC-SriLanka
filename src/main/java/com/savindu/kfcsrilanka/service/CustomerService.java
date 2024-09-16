package com.savindu.kfcsrilanka.service;

import java.sql.SQLException;

import com.savindu.kfcsrilanka.dao.CustomerRegister;
import com.savindu.kfcsrilanka.dao.CustomerRegisterImp;
import com.savindu.kfcsrilanka.model.Customer;

public class CustomerService {
	
	private static CustomerService customerServiceObj;
	
	
	private CustomerService() {
		
	}
	
	private CustomerRegister getCustomerRegisterDao() {
		
		return new CustomerRegisterImp();
	}
	public synchronized static CustomerService getCustomerServiceObj() {
		if(customerServiceObj==null) {
			customerServiceObj = new CustomerService();
		}
		
		return customerServiceObj;
		
	}
	public boolean customerRegister(Customer customer) throws SQLException, ClassNotFoundException {
		
		return getCustomerRegisterDao().customerRegistration(customer);
		
	}

}
