package com.mng.docker.SpringBootDocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello Docker Welcome to my world";
		
	}
}
