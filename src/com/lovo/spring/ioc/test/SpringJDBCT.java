package com.lovo.spring.ioc.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lovo.spring.ioc.dao.ISpringJdbcDao;
import com.lovo.spring.ioc.entity.UserSpring;
import com.lovo.spring.ioc.service.IGoodsService;
import com.lovo.spring.ioc.util.GetUUID;

public class SpringJDBCT {

	ClassPathXmlApplicationContext app = null;
	ISpringJdbcDao springJdbcDao = null;

	@Before
	public void before() {

		app = new ClassPathXmlApplicationContext("/resouse/jdbcSpring.xml");
		// springJdbcDao= (ISpringJdbcDao) app.getBean("springJdbcDao");
	}

	@Test
	public void savaUser() {
		UserSpring user = new UserSpring();
		user.setId(GetUUID.createUUID());
		user.setUserName("赵云");
		user.setPassword("19082");
		springJdbcDao.savaUser(user);
	}

	@Test
	public void del() {
		// b31aa1027f5741f691cb379218ec254c
		springJdbcDao.delUser("b31aa1027f5741f691cb379218ec254c");
	}

	@Test
	public void findList() {
		List<UserSpring> list = springJdbcDao.getListUser("赵云");
		for (UserSpring u : list) {
			System.out.println(u.getId());
		}
	}

	@Test
	public void sell() {
		IGoodsService gs = (IGoodsService) app.getBean("goodsService");
		gs.sell("java", 5);
	}

}
