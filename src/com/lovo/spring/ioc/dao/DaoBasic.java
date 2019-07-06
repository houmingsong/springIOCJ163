package com.lovo.spring.ioc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DaoBasic {

	private String jdbcUrl;
	private String jdbcPass;
	private String jdbcDriver;
	private String jdbcUser;
	/**
	 * 
	 * @return 获得数据库连接
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public Connection getConnection() throws ClassNotFoundException, SQLException{
		Connection conn=null;
		Class.forName(jdbcDriver);
		conn=DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPass);
		return conn;
	}
	
	
	public String getJdbcUrl() {
		return jdbcUrl;
	}
	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}
	public String getJdbcPass() {
		return jdbcPass;
	}
	public void setJdbcPass(String jdbcPass) {
		this.jdbcPass = jdbcPass;
	}
	public String getJdbcDriver() {
		return jdbcDriver;
	}
	public void setJdbcDriver(String jdbcDriver) {
		this.jdbcDriver = jdbcDriver;
	}
	public String getJdbcUser() {
		return jdbcUser;
	}
	public void setJdbcUser(String jdbcUser) {
		this.jdbcUser = jdbcUser;
	}
	
	
	
	
}
