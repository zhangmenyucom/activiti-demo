package com.taylor.activiti.service.impl;

import org.springframework.stereotype.Service;

import com.taylor.activiti.service.CouponService;

@Service("couponService")
public class CouponServiceImpl implements CouponService {

	@Override
	public void use(Integer orderId) {
		 System.out.println("the order"+ orderId+"has used a counpon");
	}

}
