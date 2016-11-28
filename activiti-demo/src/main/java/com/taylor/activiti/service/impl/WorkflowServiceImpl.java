package com.taylor.activiti.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipInputStream;

import org.activiti.engine.HistoryService;
import org.activiti.engine.IdentityService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.history.HistoricVariableInstance;
import org.activiti.engine.impl.RepositoryServiceImpl;
import org.activiti.engine.impl.identity.Authentication;
import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.activiti.engine.impl.persistence.entity.TaskEntity;
import org.activiti.engine.impl.pvm.PvmTransition;
import org.activiti.engine.impl.pvm.process.ActivityImpl;
import org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl;
import org.activiti.engine.impl.pvm.process.TransitionImpl;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Comment;
import org.activiti.engine.task.Task;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taylor.activiti.common.BaseVo;
import com.taylor.activiti.common.WorkflowVo;
import com.taylor.activiti.dao.WorkflowDao;
import com.taylor.activiti.entity.UserLeave;
import com.taylor.activiti.service.WorkflowService;

/**
 * @notes:工作流service实现
 * @author: kuta.li
 * @date: 2015-8-25-上午9:25:18
 */
@Service
public class WorkflowServiceImpl implements WorkflowService {

	private final static Logger LOG = Logger.getLogger(WorkflowServiceImpl.class);

	@Autowired
	private WorkflowDao workflowDao;

	@Autowired
	private RepositoryService repositoryService;

	@Autowired
	private RuntimeService runtimeService;

	@Autowired
	private TaskService taskService;

	@Autowired
	private HistoryService historyService;

	@Autowired
	private IdentityService identityService;

	/**
	 * @desc saveNewDeploye( 部署新流程)
	 * @param deployFile
	 * @param deployName
	 * @author xiaolu.zhang
	 * @date 2016年11月9日 下午3:38:50
	 */
	@Override
	public BaseVo saveNewDeploye(File deployFile, String deployName) {
		BaseVo baseVo = new BaseVo();
		try {
			ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(deployFile));
			repositoryService.createDeployment()// 创建部署对象
							.name(deployName)// 添加部署名称
							.addZipInputStream(zipInputStream)//
							.deploy();// 完成部署
			baseVo.setResultCode(200);
		} catch (Exception e) {
			baseVo.setResultCode(500);
			LOG.error("WorkflowServiceImpl.saveNewDeploye() error", e);
		}
		return baseVo;
	}

	@Override
	public BaseVo deleteProcessDefinition(String deployId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseVo startProcess(WorkflowVo workflowVo) {
		BaseVo baseVo = new BaseVo();
		Map<String, Object> varMap = new HashMap<String, Object>();
		varMap.put("dealUser", "01");
		runtimeService.startProcessInstanceByKey("leaveBillProcess", varMap);
		baseVo.setMessage("开启成功");
		baseVo.setResultCode(200);
		return baseVo;
	}

	@Override
	public PageInfo<List<WorkflowVo>> queryMyTaskPage(WorkflowVo workflowVo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProcessDefinition findProcessDefinitionByTaskId(String taskId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProcessInstance findProcessInstanceByTaskId(String taskId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> findCommentByTaskId(String taskId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseVo dealProcess(WorkflowVo workflowVo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer findIdByTaskId(String taskId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<List<WorkflowVo>> queryMyStartProcess(WorkflowVo workflowVo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> findCommentByBusinessKey(String businessKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseVo abortPorcess(WorkflowVo workflowVo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Task findTaskByProcessInstanceId(String procinstId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<List<WorkflowVo>> queryMyDealTaskPage(WorkflowVo workflowVo) {
		// TODO Auto-generated method stub
		return null;
	}
}
