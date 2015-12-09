package com.learning.something.services.impl;

import org.springframework.stereotype.Service;

import com.learning.something.services.PingService;

@Service("pingService")
public class PingServiceImpl implements PingService {

	public String ping() {
		return "pong!";
	}
}
