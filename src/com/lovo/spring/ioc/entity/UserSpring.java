package com.lovo.spring.ioc.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * 用户实体
 * @author Administrator
 *
 */
public class UserSpring implements RowMapper<UserSpring>{
    private String id;
	private String userName;
	private String password;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	
	public UserSpring mapRow(ResultSet rs, int rowNum) throws SQLException {
		//手动输入需要绑定的值
		UserSpring user=new UserSpring();
		user.setId(rs.getString("id"));
		user.setPassword(rs.getString("password"));
		user.setUserName(rs.getString("userName"));
		return user;
	}
	
	
}
