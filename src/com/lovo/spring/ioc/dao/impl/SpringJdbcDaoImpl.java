package com.lovo.spring.ioc.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lovo.spring.ioc.dao.ISpringJdbcDao;
import com.lovo.spring.ioc.entity.UserSpring;

@Repository(value = "springJdbcDao")
public class SpringJdbcDaoImpl implements ISpringJdbcDao {

	// 注入springjdbc模板
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void savaUser(UserSpring user) {
		String sql = "insert into user(id,userName,password)values(?,?,?)";

		jdbcTemplate.update(sql, new String[] { user.getId(), user.getUserName(), user.getPassword() });
	}

	@Override
	public void delUser(String id) {
		String sql = "delete from user where id=?";
		jdbcTemplate.update(sql, new String[] { id });
	}

	@Override
	public void updateUser(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<UserSpring> getListUser(String userName) {
		String sql = "select * from user where userName=?";
		List<UserSpring> list = jdbcTemplate.query(sql, new Object[] { "赵云" }, new UserSpring());
		return list;
	}

}
