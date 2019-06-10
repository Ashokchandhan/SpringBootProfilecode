package com.app.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.SpringBootProfilecodeService;

@Component
@Profile("dml")
public class DmlSpringBootProfilecodeServiceImpl implements SpringBootProfilecodeService{

	@Override
	public void notifaction() {
		System.out.println("Only for Dml user");
		
	}




}