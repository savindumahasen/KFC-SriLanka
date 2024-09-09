package com.savindu.kfcsrilanka.dao.dbUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbDriverManagerMySqlImp implements DbDriverManager {

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/kfc";
		String userName = "root";
        String password = "";
		Connection connection = DriverManager.getConnection(url,userName, password);
		
		
		
		return connection;
	}

}
