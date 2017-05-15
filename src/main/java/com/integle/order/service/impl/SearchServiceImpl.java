package com.integle.order.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integle.order.mapper.OrderRepository;
import com.integle.order.models.Order;
import com.integle.order.service.SearchService;

@Service
public class SearchServiceImpl implements SearchService {
	
	@Autowired
	private OrderRepository or;

	@Override
	public List<Order> findAll() {
		List<Order> orders = or.findAll();
		return orders;
	}

	@Override
	public Order findOne(String orderNum) {
		return null;
	}

	@Override
	public int count() {
		return 0;
	}

}
