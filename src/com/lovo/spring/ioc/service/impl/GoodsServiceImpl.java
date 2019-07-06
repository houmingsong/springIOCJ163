package com.lovo.spring.ioc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.spring.ioc.dao.IGoodsDao;
import com.lovo.spring.ioc.service.IGoodsService;

@Service(value = "goodsService")
public class GoodsServiceImpl implements IGoodsService {
	@Autowired
	private IGoodsDao goodsDao;

	@Override
	public void updateGoods(String goodsName, int goodsNum) {
		goodsDao.updateGoods(goodsName, goodsNum);

	}

	@Override
	public void savaOrder(String goodsName, int goodsNum) {
		goodsDao.savaOrder(goodsName, goodsNum);

	}

	@Override
	public void sell(String goodsName, int goodsNum) {
		this.savaOrder(goodsName, goodsNum);
		this.updateGoods(goodsName, goodsNum);
	}

}
