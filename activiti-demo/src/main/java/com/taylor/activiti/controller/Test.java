package com.taylor.activiti.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.taylor.activiti.entity.TestEntity;
import com.taylor.activiti.service.TestService;

@Controller
@RequestMapping("/test")
public class Test {

	@Autowired
	private TestService testService;

	@RequestMapping("/test")
	public String test(HttpServletRequest request, HttpServletResponse response, ModelMap map, TestEntity searchBean) {

		TestEntity result = testService.findTestEntity(searchBean);
		map.addAttribute("testBean", result);
		map.addAttribute("message", "恭喜您成功了！！！！");
		return "test";
	}

}
