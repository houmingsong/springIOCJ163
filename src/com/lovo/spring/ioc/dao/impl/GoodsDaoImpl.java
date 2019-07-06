package com.lovo.spring.ioc.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lovo.spring.ioc.dao.IGoodsDao;
import com.lovo.spring.ioc.util.GetUUID;
@Repository(value="goodsDao")
public class GoodsDaoImpl implements IGoodsDao {
    
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void updateGoods(String goodsName, int goodsNum) {
	String sql="update goods set goodsNum=(goodsNum-?) where goodsName=? ";
	 int i=1/0;
		jdbcTemplate.update(sql, goodsNum,goodsName);
          
	}

	@Override
	public void savaOrder(String goodsName, int goodsNum) {
		String sql ="insert into g_order(orderId,orderNum,goodsName,goodsNum)values(?,?,?,?)";
		
		jdbcTemplate.update(sql,
		  new Object[]{GetUUID.createUUID(),"g"+System.currentTimeMillis(),goodsName,goodsNum});
	}

}
