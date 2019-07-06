package com.lovo.spring.ioc.dao;

import java.sql.SQLException;

import com.lovo.spring.ioc.entity.Student;
import com.lovo.spring.ioc.entity.User;

/**
 * 用户Dao
 * 
 * @author Administrator
 *
 */
public interface IUserDao {
	/**
	 * @param userName
	 *            学生名
	 * @return 学生对象
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public Student getStudent(String userName) throws ClassNotFoundException, SQLException;

	/**
	 * 保存用户
	 * 
	 * @param user
	 *            用户对象
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public int savaUser(User user) throws ClassNotFoundException, SQLException;

	/**
	 * 查询用户
	 * 
	 * @param userName
	 * @param password
	 * @return
	 * @throws Exception
	 */
	public User findUser(String userName, String password) throws Exception;
}
