package com.mng.docker.SpringBootDocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello docker Welcome to my world!!";
		
	}
}
