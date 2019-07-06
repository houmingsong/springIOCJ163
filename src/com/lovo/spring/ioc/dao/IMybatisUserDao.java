package com.lovo.spring.ioc.dao;


import com.lovo.spring.ioc.entity.User;

/**
 * 用户Dao
 * @author Administrator
 *
 */
public interface IMybatisUserDao {

	/**
	 * 查询用户
	 * @param userName
	 * @param password
	 * @return
	 * @throws Exception 
	 */
	public User findUser(String userName,String password) throws Exception;
	/**
	 * 保存用户
	 * @param user 用户对象
	 * @return 保存的行数
	 */
	public int savaUser(User user);
}
