package com.integle.order.service;

import java.util.List;

import com.integle.order.models.Order;
import com.integle.order.models.confirmData;
import com.integle.order.models.sendData;

/**
 * 订单服务接口
 */
public interface OrderService {
	
	//新增订单
	public String insert(Order order);
	
	
	//修改订单
	public int update(Order data, Order query);
	
	//删除订单
	public int delete(Order query);
	
	//确认订单
	public boolean confirm(String orderNum, confirmData data);
	
	//订单发货
	public boolean send(String orderNum, sendData data);
	
	//确认收货
	public boolean revice(String orderNum);
	
	//订单取消
	public boolean cancel(String orderNum);
	
	//订单还原
	public boolean restore(String orderNum);

}
