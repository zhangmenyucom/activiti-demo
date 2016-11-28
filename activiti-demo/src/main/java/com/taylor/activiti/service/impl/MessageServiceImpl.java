package com.taylor.activiti.service.impl;

import org.springframework.stereotype.Service;

import com.taylor.activiti.service.MessageService;

@Service("messageService")
public class MessageServiceImpl implements MessageService {

	@Override
	public String send(Integer orderId, String message) {
		System.out.println("message" + orderId + "already created" + message);
		return "发信成功";

	}

}
