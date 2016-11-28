package com.taylor.activiti.controller;

import javax.servlet.http.HttpServletRequest;

import org.activiti.engine.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taylor.activiti.common.BaseVo;
import com.taylor.activiti.manager.OrderManager;

@Controller
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderManager orderManager;
	
	@RequestMapping("/create_order")
	@ResponseBody
	public BaseVo createOrder(HttpServletRequest request) {
		String result=orderManager.createOrder();
		BaseVo baseVo = new BaseVo();
		baseVo.setMessage("创建成功"+result);
		baseVo.setResultCode(200);
		return baseVo;
	}

}
