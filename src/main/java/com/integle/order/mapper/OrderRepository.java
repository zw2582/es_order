package com.integle.order.mapper;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import com.integle.order.models.Order;

public interface OrderRepository extends MongoRepository<Order, String> {

}
