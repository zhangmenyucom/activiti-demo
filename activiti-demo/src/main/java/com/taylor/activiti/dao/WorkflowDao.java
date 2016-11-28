package com.taylor.activiti.dao;

import java.util.List;

import com.taylor.activiti.common.WorkflowVo;


/**
 * @notes:工作流DAO 
 * @author:xiaolu.zhang
 * @date: 2015-8-25-上午11:36:22
 */
public interface WorkflowDao {

    /**
     * @notes: 流程定义分页查询
     * @param workflowVo
     * @author:xiaolu.zhang
     * @date: 2015-8-25-下午1:55:30
     */
    List<WorkflowVo> queryProcessDefinitionPage(WorkflowVo workflowVo);

    /**
     * @notes:流程定义总记录数 
     * @param workflowVo
     * @author:xiaolu.zhang
     * @date: 2015-8-25-下午2:17:53
     */
    Integer countProcessDefinition(WorkflowVo workflowVo);

    /**
     * @notes:流程总记录数 
     * @param workflowVo
     * @author:xiaolu.zhang
     * @date: 2015-11-08-上午9:20:53
     */
    Integer countProcess(WorkflowVo workflowVo);

    /**
     * @notes: 流程分页查询
     * @param workflowVo
     * @author:xiaolu.zhang
     * @date: 2015-11-08-上午9:21:13
     */
    List<WorkflowVo> queryProcessPage(WorkflowVo workflowVo);

    /**
     * @notes: 查询我的任务总数
     * @param workflowVo
     * @author:xiaolu.zhang
     * @date: 2015-11-08-下午6:15:35
     */
    Integer countMyTask(WorkflowVo workflowVo);

    /**
     * @notes:查询我的任务分页 
     * @param workflowVo
     * @author:xiaolu.zhang
     * @date: 2015-11-08-下午6:18:06
     */
    List<WorkflowVo> queryMyTaskPage(WorkflowVo workflowVo);

    /**
     * @notes:查询我启动的流程 
     * @param workflowVo
     * @author:xiaolu.zhang
     * @date: 2015-8-28-下午4:27:49
     */
    List<WorkflowVo> queryMyStartProcessPage(WorkflowVo workflowVo);

    /**
     * @notes: 查询我发起的流程总记录数
     * @param workflowVo
     * @author:xiaolu.zhang
     * @date: 2015-8-28-下午6:27:43
     */
    Integer countMyStartProcess(WorkflowVo workflowVo);

    /**
     * @notes: 查询我处理的任务总数
     * @param workflowVo
     * @author:xiaolu.zhang
     * @date: 2015-9-9-下午1:39:34
     */
    Integer countMyDealTask(WorkflowVo workflowVo);

    /**
     * @notes:分页查询我处理的任务 
     * @param workflowVo
     * @author:xiaolu.zhang
     * @date: 2015-9-9-下午1:39:57
     */
    List<WorkflowVo> queryMyDealTaskPage(WorkflowVo workflowVo);

}
