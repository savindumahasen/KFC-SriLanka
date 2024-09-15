package com.savindu.kfcsrilanka.dao;

import java.sql.SQLException;

import com.savindu.kfcsrilanka.model.Admin;

public interface AdminLogin {
	public Admin fetchSingleAdmin(String userName) throws SQLException, ClassNotFoundException;

}
