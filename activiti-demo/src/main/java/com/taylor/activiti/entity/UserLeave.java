package com.taylor.activiti.entity;

import java.io.Serializable;
import java.util.Date;

public class UserLeave implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = -7235572684378754997L;

    private Integer id;

    private String userCode;

    private Integer status;
    
    private String roleName;
    
    private String departmentName;
    
    private String leadName;

    private String reason;

    private Integer leaveType;

    private Integer leaveHours;

    private Date leaveFromTime;

    private Date leaveToTime;

    private String leaveProcessId;

    private Date doTime;

    private Date endTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Integer getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(Integer leaveType) {
        this.leaveType = leaveType;
    }

    public Integer getLeaveHours() {
        return leaveHours;
    }

    public void setLeaveHours(Integer leaveHours) {
        this.leaveHours = leaveHours;
    }

    public Date getLeaveFromTime() {
        return leaveFromTime;
    }

    public void setLeaveFromTime(Date leaveFromTime) {
        this.leaveFromTime = leaveFromTime;
    }

    public Date getLeaveToTime() {
        return leaveToTime;
    }

    public void setLeaveToTime(Date leaveToTime) {
        this.leaveToTime = leaveToTime;
    }

    public String getLeaveProcessId() {
        return leaveProcessId;
    }

    public void setLeaveProcessId(String leaveProcessId) {
        this.leaveProcessId = leaveProcessId;
    }

    public Date getDoTime() {
        return doTime;
    }

    public void setDoTime(Date doTime) {
        this.doTime = doTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getLeadName() {
        return leadName;
    }

    public void setLeadName(String leadName) {
        this.leadName = leadName;
    }

}