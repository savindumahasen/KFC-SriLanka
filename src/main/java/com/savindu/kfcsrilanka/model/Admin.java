package com.savindu.kfcsrilanka.model;

public class Admin {
	private String userName;
	private String password;
	
	
	public Admin(String user_name, String password) {
		this.userName = user_name;
		this.password=password;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	

	
	

}
