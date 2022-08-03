package com.microservices.limitsservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.limitsservice.config.LimitsConfiguration;
import com.microservices.limitsservice.model.Limits;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	LimitsConfiguration limitsConfiguration;
	
	@GetMapping("/limits")
	public Limits retreiveLimitsFromConfiguration() {
		
		return new Limits(limitsConfiguration.getMinimum(), limitsConfiguration.getMaximum());
	}

}
