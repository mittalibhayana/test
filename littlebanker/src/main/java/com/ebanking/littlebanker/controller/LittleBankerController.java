package com.ebanking.littlebanker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebanking.littlebanker.service.LittleBankerService;
@RestController
public class LittleBankerController {

	
	@Autowired
	LittleBankerService service;
	
	@GetMapping("/bank")
	public String getMessage() {
		return service.getMessage();
	}
}
