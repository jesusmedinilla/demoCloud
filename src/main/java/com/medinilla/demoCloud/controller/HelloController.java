package com.medinilla.demoCloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    
	@RequestMapping(value="/", method=RequestMethod.GET)//, produces = MediaType.APPLICATION_JSON_VALUE)
	public Object hello() {
		return "Hello";
	}

    
}
