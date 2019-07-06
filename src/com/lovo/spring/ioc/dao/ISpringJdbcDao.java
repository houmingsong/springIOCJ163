package com.lovo.spring.ioc.dao;

import java.util.List;

import com.lovo.spring.ioc.entity.UserSpring;

public interface ISpringJdbcDao {
   /**
    * 保存用户
    * @param user
    */
	public void savaUser(UserSpring user);
	/**
	 * 删除用户
	 * @param id
	 */
	public void delUser(String id);
	/**
	 * 修改用户
	 * @param id
	 */
	public void updateUser(String id);
	/**
	 * 查询用户集合
	 * @param userName
	 * @return
	 */
	public List<UserSpring> getListUser(String userName);
}
