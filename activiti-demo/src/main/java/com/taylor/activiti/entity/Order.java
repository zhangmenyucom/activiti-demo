package com.taylor.activiti.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Order implements Serializable {
	private static final long serialVersionUID = -2474277511269699227L;
	private Integer orderId;
	private Integer orderType;
	private Integer orderPayType;
}
