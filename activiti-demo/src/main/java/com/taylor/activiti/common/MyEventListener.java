package com.taylor.activiti.common;

import org.activiti.engine.delegate.event.ActivitiEvent;
import org.activiti.engine.delegate.event.ActivitiEventListener;

public class MyEventListener implements ActivitiEventListener  {

	@Override
	public boolean isFailOnException() {
		System.out.println("流程失败");
		return false;
	}

	@Override
	public void onEvent(ActivitiEvent arg0) {
		System.out.println("哈哈");
		System.out.println(arg0.getExecutionId());
	}

}
