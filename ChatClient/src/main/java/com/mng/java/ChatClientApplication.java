package com.mng.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RibbonClient(name="hello-service", configuration=RibbonConfiguration.class)
@RestController
@RequestMapping("client")
public class ChatClientApplication {
	
	@Autowired
	public RestTemplate restTemplate;
	
	@RequestMapping("chat")
	public String getChat() {
		String url = "http://hello-service/chatApp/chat";
		return restTemplate.getForObject(url, String.class); 
	}

	public static void main(String[] args) {
		SpringApplication.run(ChatClientApplication.class, args);
	}
	
	@LoadBalanced
	@Bean
	public RestTemplate template()
	{
	  return new RestTemplate();
	}
	
}
