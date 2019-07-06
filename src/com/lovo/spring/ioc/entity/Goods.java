package com.lovo.spring.ioc.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Goods implements RowMapper<Goods>{

	private String goodsId;//ID
	private String goodsName;//商品名
	private int goodsNum;//商品数量
	
	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public int getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(int goodsNum) {
		this.goodsNum = goodsNum;
	}

	public Goods mapRow(ResultSet rs, int rowNum) throws SQLException {
		Goods g=new Goods();
		g.setGoodsId(rs.getString("goodsId"));
		g.setGoodsName(rs.getString("goodsName"));
		g.setGoodsNum(rs.getInt("goodsNum"));
		return g;
	}

}
