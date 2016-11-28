package com.taylor.activiti.service.impl;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

/**
 * @author Michael.Wang
 * @date 2016/10/10
 */
@Service("returnServiceDelegate")
public class ReturnServiceDelegate  implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("send message ok");
        execution.setVariable("message","ok");
    }
}
