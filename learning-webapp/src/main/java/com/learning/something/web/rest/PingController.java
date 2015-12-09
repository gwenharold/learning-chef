package com.learning.something.web.rest;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.learning.something.services.PingService;

@Controller
@RequestMapping("/rest/ping")
public class PingController {

	
	private PingService pingService;
	
	@Resource
	public void setPingService(PingService pingService) {
		this.pingService = pingService;
	}
	
	@RequestMapping(method = GET)
	@ResponseBody
	public String ping() {
		return pingService.ping();
	}
}
