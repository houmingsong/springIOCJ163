package com.lovo.spring.ioc.test;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lovo.spring.ioc.dao.IUserDao;
import com.lovo.spring.ioc.entity.User;
import com.lovo.spring.ioc.service.IUserService;
import com.lovo.spring.ioc.util.GetUUID;

public class MyBaitisT {
	ClassPathXmlApplicationContext app = null;

	@Before
	public void before() {

		app = new ClassPathXmlApplicationContext("/resouse/jdbcmybaits.xml");
	}

	@Test
	public void findUser() throws Exception {
		// 获得默认的工厂
		DefaultSqlSessionFactory factory = (DefaultSqlSessionFactory) app.getBean("factoryBean");

		// 获得session
		SqlSession session = factory.openSession();
		// 映射
		IUserDao userDao = session.getMapper(IUserDao.class);
		User user = userDao.findUser("赵云1", "123456");
		System.out.println(user.getId());
	}

	@Test
	public void findUser2() throws Exception {
		IUserService us = (IUserService) app.getBean("userService");
		User user = new User();
		user.setUserName("赵云1");
		user.setPassword("123456");
		user = us.findUser(user);
		System.out.println(user.getId());
	}

	@Test
	public void savaUser() throws ClassNotFoundException, SQLException {
		IUserService us = (IUserService) app.getBean("userService");
		User user = new User();
		user.setUserName("赵云");
		user.setPassword("123456");
		user.setId(GetUUID.createUUID());
		System.out.println(us.savaUser(user));
	}
}
