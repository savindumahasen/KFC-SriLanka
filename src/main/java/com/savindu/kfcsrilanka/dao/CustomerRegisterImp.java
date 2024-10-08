package com.savindu.kfcsrilanka.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.savindu.kfcsrilanka.dao.dbUtils.DbDriverManager;
import com.savindu.kfcsrilanka.dao.dbUtils.DbDriverManagerFactory;
import com.savindu.kfcsrilanka.model.Customer;

public class CustomerRegisterImp implements CustomerRegister {
	
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		DbDriverManagerFactory driverFactory =new DbDriverManagerFactory();
		DbDriverManager driverManager =driverFactory.getDbDriver("MySQL");
		Connection connection = driverManager.getConnection();
		return connection;
	
	}

	public boolean customerRegistration(Customer customer) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Connection connection = getConnection();
		String query= "INSERT INTO customer (UserName,Password,ConfirmPassword) VALUES (?,?,?)";
		PreparedStatement ps =connection.prepareStatement(query);
		ps.setString(1, customer.getUserName());
		ps.setString(2, customer.getPassword());
		ps.setString(3, customer.getConfirmPassword());
		boolean result=false;
		if(ps.executeUpdate()>0) {
			result=true;
		}
		ps.close();
		connection.close();
		return result;
	}

	public Customer fetchSingleCustomer(String userName) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Connection connection =getConnection();
		String query = "SELECT * FROM customer WHERE UserName=?";
		PreparedStatement ps =connection.prepareStatement(query);
		ps.setString(1, userName);
		ResultSet result=ps.executeQuery(); 
		Customer customer=new Customer();
		while(result.next()) {
			customer.setUserName(result.getString("UserName"));
			customer.setPassword(result.getString("Password"));
			customer.setConfirmPassword(result.getString("ConfirmPassword"));
			
			
		}
		ps.close();
		connection.close();
		return customer;
	}

}
