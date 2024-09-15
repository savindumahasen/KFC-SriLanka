package com.savindu.kfcsrilanka.service;

import java.sql.SQLException;

import com.savindu.kfcsrilanka.dao.AdminLogin;
import com.savindu.kfcsrilanka.dao.AdminLoginImp;
import com.savindu.kfcsrilanka.model.Admin;

public class AdminService {
	
	private static AdminService adminServiceObj;
	
	
	private AdminService() {
		
	}
	private AdminLogin getAdminDao() {
		return new AdminLoginImp();
	}
	
	public synchronized static AdminService getAdminService() {
		if(adminServiceObj.equals("null")) {
			adminServiceObj= new AdminService();
		}
		return adminServiceObj;
		
	}
	
	public Admin fetchSingleAdmin(String userName) throws ClassNotFoundException, SQLException {
		
		return getAdminDao().fetchSingleAdmin(userName);
	}

}
