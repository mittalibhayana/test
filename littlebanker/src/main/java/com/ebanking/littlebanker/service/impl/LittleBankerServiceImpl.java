package com.ebanking.littlebanker.service.impl;

import org.springframework.stereotype.Service;

import com.ebanking.littlebanker.service.LittleBankerService;
@Service
public class LittleBankerServiceImpl implements LittleBankerService{

	@Override
	public String getMessage() {
		return "hello";
	}

}
