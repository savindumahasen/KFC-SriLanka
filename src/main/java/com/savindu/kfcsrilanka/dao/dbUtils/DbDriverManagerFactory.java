package com.savindu.kfcsrilanka.dao.dbUtils;

public class DbDriverManagerFactory {
	
	public DbDriverManager getDbDriver(String databaseType) {
		if (databaseType.equals("MySQL")) {
			return new DbDriverManagerMySqlImp();
		}else {
		  return null;
		}
	}

}
