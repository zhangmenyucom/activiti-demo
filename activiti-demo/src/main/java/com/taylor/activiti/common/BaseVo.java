package com.taylor.activiti.common;

import lombok.Data;

@Data
public class BaseVo{
    private Integer resultCode;
    
    private String message;
    
    private Object data;
}
