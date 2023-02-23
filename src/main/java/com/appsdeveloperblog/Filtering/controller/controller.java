package com.appsdeveloperblog.Filtering.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class controller {
	private static final Logger log = LoggerFactory.getLogger(controller.class);
	
	@GetMapping("/filter/**")
	public String getMessage(){
		log.info("messageController - inside getmessage mehtod");
		return "welcome Abhi";
		
	}
	
//	@GetMapping("/**")
//	public String getMessage1(){
//		log.info("messageController - inside getmessage mehtod");
//		return "welcome Abhi";
//		
//	}
}
