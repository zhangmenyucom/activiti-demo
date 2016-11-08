package com.taylor.activiti.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taylor.activiti.dao.TestDao;
import com.taylor.activiti.entity.TestEntity;
import com.taylor.activiti.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestDao testDao;
	
	@Override
	public TestEntity findTestEntity(TestEntity testEntity) {
		return testDao.selectOne(testEntity);
	}
}
