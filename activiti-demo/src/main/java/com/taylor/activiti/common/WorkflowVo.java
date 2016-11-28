package com.taylor.activiti.common;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.taylor.activiti.entity.UserLeave;

@Data
@EqualsAndHashCode(callSuper=false)
public class WorkflowVo extends BaseVo implements Serializable{

    private static final long serialVersionUID = 7152004296187231063L;
    
    private UserLeave UserLeave;
    
    //分页字段
    private Integer currPage;                       //当前页码
    private Integer pageSize;                       //分页大小
    private Integer offset;                             //开始位置
    
    //查询条件
    private String userCode;                        //用户编号
    private Integer completeStatus;                //完成类型：0=未完成，1=已完成
    private String startUserCode;                  //发起流程人
    private String leaderUserCode;              //领导编号
    
    //任务处理数据
    private String outcome;                          //处理结果               
    private String dealComment;                 //处理评论

    //数据库字段
    private String procdefId;                      //流程定义id
    private String procdefKey;                   //流程定义key
    private Integer procdefVersion;             //流程定义版本号
    private String deployId;                       //流程部署id
    private Date deployTime;                      //流程部署时间
    private String deployName;                  //流程部署名称
    private String procdDgrmResourceName;      //流程图片名称
    private Date taskCreateTime;                //任务创建时间
    private String taskId;                            //任务id
    private String taskName;                       //任务名称
    private String businessKey;                   //业务key
    private Date procinstStartTime;             //流程实例开始时间
    private Date procinstEndTime;               //流程实例结束时间
    private String procinstId;                        //流程实例id
    private Date taskDealTime;                      //流程处理时间
    private String procStartUserCode;           //流程发起人
}
