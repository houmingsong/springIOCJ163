package com.lovo.spring.ioc.service;

public interface IGoodsService {
	   /**
     * 修改商品数量
     * @param goodsName
     * @param goodsNum
     */
	public void updateGoods(String goodsName,int goodsNum);
	/**
	 * 添加订单
	 * @param goodsName
	 * @param goodsNum
	 */
	public void savaOrder(String goodsName,int goodsNum);
	/**
	 * 销售
	 * @param goodsName
	 * @param goodsNum
	 */
	public void sell(String goodsName,int goodsNum);
}
