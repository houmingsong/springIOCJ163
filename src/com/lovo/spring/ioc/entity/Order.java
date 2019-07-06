package com.lovo.spring.ioc.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Order implements RowMapper<Order> {

	private String orderId; // id
	private String orderNum; // 订单号
	private String goodsName;// 商品名字
	private int goodsNum;// 商品数量

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
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

	@Override
	public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
		Order o=new Order();
		o.setOrderId(rs.getString("orderId"));
		o.setGoodsNum(rs.getInt("goodsNum"));
		o.setOrderNum(rs.getString("orderNum"));
		o.setGoodsName(rs.getString("goodsName"));
		return o;
	}

}
