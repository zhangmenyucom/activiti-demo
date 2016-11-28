package com.taylor.activiti.service;

import java.io.File;
import java.util.List;

import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Comment;
import org.activiti.engine.task.Task;

import com.github.pagehelper.PageInfo;
import com.taylor.activiti.common.BaseVo;
import com.taylor.activiti.common.WorkflowVo;

/**
 * @notes: 工作流service接口
 * @author: xiaolu.zhang
 * @date: 2015-8-24-下午6:07:19
 */
public interface WorkflowService{

    /**
     * @notes: 部署新流程
     * @param deployFile
     * @param deployName
     * @author: xiaolu.zhang
     * @date: 2015-8-25-上午9:40:22
     */
    BaseVo saveNewDeploye(File deployFile, String deployName);

    /**
     * @notes: 删除流程定义
     * @param deployId  //流程部署id
     * @author: xiaolu.zhang
     * @date: 2015-8-25-下午6:27:27
     */
    BaseVo deleteProcessDefinition(String deployId);
    /**
     * @notes:启动流程 
     * @param workflowVo
     * @author: xiaolu.zhang
     * @date: 2015-8-26-下午1:45:46
     */
    BaseVo startProcess(WorkflowVo workflowVo);

    /**
     * @notes: 任务列表分页查询
     * @param userCode  用户编号
     * @param workflowVo    工作流vo
     * @author: xiaolu.zhang
     * @date: 2015-8-26-下午5:55:24
     */
    PageInfo<List<WorkflowVo>> queryMyTaskPage(WorkflowVo workflowVo);

    /**
     * @notes: 根据任务id查询流程定义对象
     * @param taskId 任务id
     * @author: xiaolu.zhang
     * @date: 2015-8-27-上午9:53:27
     */
    ProcessDefinition findProcessDefinitionByTaskId(String taskId);


    /**
     * @notes: 根据任务id查询流程实例
     * @param taskId    任务id
     * @author: xiaolu.zhang
     * @date: 2015-8-27-下午3:55:35
     */
    ProcessInstance findProcessInstanceByTaskId(String taskId);

    /**
     * @notes: 查询所有历史审核人的审核信息，帮助当前人完成审核，返回List<Comment>
     * @param taskId    任务id
     * @author: xiaolu.zhang
     * @date: 2015-8-27-下午6:00:05
     */
    List<Comment> findCommentByTaskId(String taskId);

    /**
     * @notes:处理流程 
     * @param workflowVo
     * @author: xiaolu.zhang
     * @date: 2015-8-27-下午6:41:16
     */
    BaseVo dealProcess(WorkflowVo workflowVo);

    /**
     * @notes: 根据任务id查询业务id
     * @param taskId
     * @author: xiaolu.zhang
     * @date: 2015-8-27-下午6:50:31
     */
    Integer findIdByTaskId(String taskId);

    /**
     * @notes: 查询我发起的流程
     * @param workflowVo
     * @author: xiaolu.zhang
     * @date: 2015-8-28-下午2:06:42
     */
    PageInfo<List<WorkflowVo>> queryMyStartProcess(WorkflowVo workflowVo);

    /**
     * @notes: 根据业务key查询流程历史批注信息
     * @param businessKey
     * @author: xiaolu.zhang
     * @date: 2015-8-31-上午10:31:27
     */
    List<Comment> findCommentByBusinessKey(String businessKey);

    /**
     * @notes: 中止流程
     * @param workflowVo
     * @author: xiaolu.zhang
     * @date: 2015-9-4-下午5:21:01
     */
    BaseVo abortPorcess(WorkflowVo workflowVo);

    /**
     * @notes: 根据流程实例ID查询task
     * @param procinstId    流程实例ID
     * @author: xiaolu.zhang
     * @date: 2015-9-6-上午11:03:44
     */
    Task findTaskByProcessInstanceId(String procinstId);

    /**
     * @notes: 查询我处理的任务
     * @param workflowVo
     * @author: xiaolu.zhang
     * @date: 2015-9-9-下午1:36:47
     */
    PageInfo<List<WorkflowVo>> queryMyDealTaskPage(WorkflowVo workflowVo);

}
