package com.integle.order.service;

import java.util.List;

import com.integle.order.models.Order;

public interface SearchService {
	//查询所有订单
	public List<Order> findAll();

	//根据编号查询订单
	public Order findOne(String orderNum);

	//获取总数
	public int count();
}
