package com.lovo.spring.ioc.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lovo.spring.ioc.dao.DaoBasic;
import com.lovo.spring.ioc.dao.IUserDao;
import com.lovo.spring.ioc.entity.Student;
import com.lovo.spring.ioc.entity.User;

//@Repository(value="userDao")
public class UserDaoImpl implements IUserDao {
	// 持有DAO的基础类
	@Autowired
	private DaoBasic daoBasic;

	public Student getStudent(String userName) throws ClassNotFoundException, SQLException {
		System.out.println(daoBasic.getConnection());
		return null;
	}

	public int savaUser(User user) throws ClassNotFoundException, SQLException {
		String sql = "insert into user(id,userName,password) values(?,?,?)";
		PreparedStatement pst = daoBasic.getConnection().prepareStatement(sql);
		pst.setString(1, user.getId());
		pst.setString(2, user.getUserName());
		pst.setString(3, user.getPassword());
		return pst.executeUpdate();
	}

	public DaoBasic getDaoBasic() {
		return daoBasic;
	}

	public void setDaoBasic(DaoBasic daoBasic) {
		this.daoBasic = daoBasic;
	}

	@Override
	public User findUser(String userName, String password) throws Exception {

		return null;
	}

}
