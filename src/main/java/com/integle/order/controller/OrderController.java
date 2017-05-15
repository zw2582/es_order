package com.integle.order.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.integle.order.models.Order;
import com.integle.order.models.OrderProduct;
import com.integle.order.service.OrderService;
import com.integle.order.service.SearchService;
import com.mongodb.util.JSON;


@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderSer;
	
	@Autowired
	private SearchService serarchSer;
	
	@Value("${shop_url}")
	String shop_url;
	
	@GetMapping("/order/{orderNum}")
	public Order findOne(@PathVariable String orderNum) {
		Order order = serarchSer.findOne(orderNum);
		return order;
	}
	
	@GetMapping("/order")
	public List<Order> findAll() {
		return serarchSer.findAll();
	}
	
	@GetMapping("/order/_count")
	public int count() {
		return serarchSer.count();
	}
	
	@PostMapping("/order")
	public String add(@Valid @RequestBody Order order) {
		String order_num = orderSer.insert(order);
		return order_num;
	}

}
