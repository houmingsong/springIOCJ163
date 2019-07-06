package com.lovo.spring.ioc.test;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lovo.spring.ioc.dao.IUserDao;
import com.lovo.spring.ioc.entity.User;
import com.lovo.spring.ioc.service.IUserService;
import com.lovo.spring.ioc.util.GetUUID;

public class JDBCT {
	ClassPathXmlApplicationContext app = null;
	ClassPathXmlApplicationContext app2 = null;

	@Before
	public void before() {
		// 启动spring
		// app=new ClassPathXmlApplicationContext("/resouse/jdbc.xml");
		app2 = new ClassPathXmlApplicationContext("/resouse/jdbca.xml");
	}

	@Test
	public void userDao() {
		IUserDao ud = (IUserDao) app.getBean("userDao");
		try {
			ud.getStudent("");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void userDao2() {
		IUserDao ud = (IUserDao) app2.getBean("userDao");
		try {
			ud.getStudent("");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void savaUser() {
		IUserService s = (IUserService) app2.getBean("userService");
		User user = new User();
		user.setId(GetUUID.createUUID());
		user.setUserName("赵云");
		user.setPassword("123456");
		try {
			s.savaUser(user);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
