package com.integle.order.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.integle.order.models.Order;

@Mapper
public interface OrderMapper {

	//查询全部订单
	@Select("select * from integle_e_order limit 10")
	public List<Order> findAll() ;

	//根据编号查询订单
	@Select("select * from integle_e_order where order_num=#{orderNum}")
	public Order findOne(String orderNum);

	@Select("select count(id) from integle_e_order")
	public int count();

}
