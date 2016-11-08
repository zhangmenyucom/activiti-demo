package com.taylor.activiti.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "test")
public class TestEntity {

	@Id
	private Integer id;

	private String name;

}
