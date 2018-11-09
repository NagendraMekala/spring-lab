package com.mng.java;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/chatApp")
public class ChatBootApplication {
	
	@Value("${server.port}")
	private String port;

	public static void main(String[] args) {
		SpringApplication.run(ChatBootApplication.class, args);
	}
	
	// http://localhost:8686/chatApp/chat
	@RequestMapping("/chat")
	public String chatNow() {
		return "application running upon port: "+port;
	}
}
