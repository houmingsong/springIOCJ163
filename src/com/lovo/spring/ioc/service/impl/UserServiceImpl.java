package com.lovo.spring.ioc.service.impl;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.spring.ioc.dao.IMybatisUserDao;
import com.lovo.spring.ioc.dao.IUserDao;
import com.lovo.spring.ioc.entity.User;
import com.lovo.spring.ioc.service.IUserService;

//@Service(value="userService")
public class UserServiceImpl implements IUserService {

	// @Autowired
	private IUserDao userDao;
	@Autowired
	private IMybatisUserDao MybatisUserDao;

	public boolean savaUser(User user) throws ClassNotFoundException, SQLException {
		boolean bl = false;
		// int count=userDao.savaUser(user);
		// if(count>0){
		// bl=true;
		// }
		// System.out.println("目标方法执行了");
		int i = MybatisUserDao.savaUser(user);
		if (i > 0) {
			bl = true;
		}
		return bl;
	}

	@Override
	public User findUser(User user) throws Exception {

		return MybatisUserDao.findUser(user.getUserName(), user.getPassword());
	}

}
