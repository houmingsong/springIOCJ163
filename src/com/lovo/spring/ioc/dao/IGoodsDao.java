package com.lovo.spring.ioc.dao;

public interface IGoodsDao {
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
}
