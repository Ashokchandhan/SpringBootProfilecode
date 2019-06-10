package com.app.runner;

import java.security.Provider.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.service.SpringBootProfilecodeService;

@Component
public class AppRunner implements CommandLineRunner {

	@Autowired
	private SpringBootProfilecodeService service;
	public void run(String... args) throws Exception {
	
		
		service. notifaction();
	}

	
}
