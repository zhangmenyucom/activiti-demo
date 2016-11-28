package com.taylor.activiti.manager.impl;

import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.HistoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taylor.activiti.common.Constants;
import com.taylor.activiti.entity.Order;
import com.taylor.activiti.manager.OrderManager;

@Service
public class OrderManagerImpl implements OrderManager {

	@Autowired
	private RuntimeService runtimeService;

	@Autowired
	private HistoryService historyService;

	@Override
	public String createOrder() {
		Order order = new Order();
		order.setOrderId(123);
		order.setOrderType(1);
		order.setOrderPayType(2);
		Map<String, Object> varibleMap = new HashMap<>();
		varibleMap.put("order", order);
		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey(Constants.PROCESS_KEY_CREATE_ORDER, OrderManagerImpl.class.getName() + ".createOrder", varibleMap);
	    return  (String) historyService.createHistoricVariableInstanceQuery().processInstanceId(processInstance.getId()).variableName("message").singleResult().getValue();
	}

}
