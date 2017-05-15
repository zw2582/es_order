package com.integle.order.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integle.order.mapper.OrderMapper;
import com.integle.order.mapper.OrderRepository;
import com.integle.order.models.Order;
import com.integle.order.models.confirmData;
import com.integle.order.models.sendData;
import com.integle.order.service.OrderService;
import com.integle.order.util.Utils;

@Service
public class OrderServiceImpl implements OrderService{
	
	//注入mapper接口代理对象
	@Autowired
	private OrderRepository or;

	@Override
	public String insert(Order order) {
		//判断订单是否为null
		if(order == null) {
			throw new NullPointerException("order id null");
		}
		//组装数据
		order.setOrder_num(Utils.getOrderNum("O"));
		long time = System.currentTimeMillis();
		order.setCreate_time(time);
		order.setUpdate_time(time);
		order.setStatus(1);
		//新增订单
		order = or.insert(order);
		return order.getOrder_num();
	}

	@Override
	public int update(Order data, Order query) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Order query) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean confirm(String orderNum, confirmData data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean send(String orderNum, sendData data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean revice(String orderNum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cancel(String orderNum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean restore(String orderNum) {
		// TODO Auto-generated method stub
		return false;
	}

}
