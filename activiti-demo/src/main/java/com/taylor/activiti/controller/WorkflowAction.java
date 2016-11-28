package com.taylor.activiti.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taylor.activiti.common.BaseVo;
import com.taylor.activiti.common.WorkflowVo;
import com.taylor.activiti.service.WorkflowService;


@Controller
@RequestMapping("/workflow")
public class WorkflowAction{

	private final static Logger LOG = Logger.getLogger(WorkflowAction.class);
	
	@Autowired
	private WorkflowService workflowService;

	
	/**
	 * @notes: 进入流程部署页面
	 * @author: kuta.li
	 * @date: 2015-8-25-下午2:33:37
	 */
	@RequestMapping(value = "/new_deploy_ui")
    public String newDeployUI(HttpServletRequest request, HttpServletResponse response){
	    return "/WEB-INF/workflow/process_new_deploy.jsp";
    }
	
	
	/**
	 * @notes:启动流程 
	 * @param workflowVo
	 * @author: kuta.li
	 * @date: 2015-8-26-下午1:45:28
	 */
	@RequestMapping(value="/start_process")
	@ResponseBody
	public BaseVo startProcess(WorkflowVo workflowVo, HttpServletRequest request, HttpServletResponse response){
	    BaseVo baseVo = new BaseVo();
	    try {
	        baseVo = workflowService.startProcess(workflowVo);
        } catch (Exception e) {
            baseVo.setResultCode(500);
            baseVo.setMessage("发起流程失败！！！");
            LOG.error("WorkflowAction.startProcess() error", e);
        }
	    return baseVo;
	}
	
}
