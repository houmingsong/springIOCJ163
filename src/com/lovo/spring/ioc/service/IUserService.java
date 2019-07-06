package com.lovo.spring.ioc.service;

import java.sql.SQLException;

import com.lovo.spring.ioc.entity.User;

public interface IUserService {
	/**
	 * 保存用户
	 * @param user 用户对象
	 * @return
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public boolean savaUser(User user) throws ClassNotFoundException, SQLException;
	
	public User findUser(User user) throws Exception;
}
