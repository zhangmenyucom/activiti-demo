package com.taylor.activiti.service.impl;

import org.springframework.stereotype.Service;

import com.taylor.activiti.entity.Order;
import com.taylor.activiti.service.OrderService;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
	@Override
	public String saveOrder(Order order) {
		System.out.println("orderType" + order.getOrderType());
		System.out.println("orderId" + order.getOrderId());
		System.out.println("orderPayType" + order.getOrderPayType());
		return "这是saveOrder返回的值";
	}
}
