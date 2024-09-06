package com.savindu.kfcsrilanka.dao.dbUtils;

import java.sql.Connection;
import java.sql.SQLException;

public interface DbDriverManager {
	public Connection getConnection() throws ClassNotFoundException, SQLException;

}
