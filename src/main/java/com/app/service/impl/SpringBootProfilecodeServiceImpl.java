package com.app.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.SpringBootProfilecodeService;

@Component
@Profile("default")
public class SpringBootProfilecodeServiceImpl implements SpringBootProfilecodeService {

	@Override
	public void notifaction() {
	
	
		System.out.println("Comman for all");
		
	}

}
