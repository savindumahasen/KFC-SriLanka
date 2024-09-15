package com.savindu.kfcsrilanka.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.savindu.kfcsrilanka.dao.dbUtils.DbDriverManager;
import com.savindu.kfcsrilanka.dao.dbUtils.DbDriverManagerFactory;
import com.savindu.kfcsrilanka.model.Admin;


public class AdminLoginImp implements AdminLogin {
	
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		DbDriverManagerFactory driverFactory =new DbDriverManagerFactory();
		DbDriverManager driverManager =driverFactory.getDbDriver("MySQL");
		Connection connection = driverManager.getConnection();
		return connection;
		
	}

	public Admin fetchSingleAdmin(String userName) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Connection connection = getConnection();
		String query = "SELECT * FROM admin WHERE userName=?";
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setString(1,userName);
		ResultSet result =ps.executeQuery();
		Admin admin = new Admin();
		while(result.next()) {
			admin.setUserName(result.getString("UserName"));
			admin.setPassword(result.getString("Password"));
		}
		
		ps.close();
		connection.close();
		return admin;
	}

}
