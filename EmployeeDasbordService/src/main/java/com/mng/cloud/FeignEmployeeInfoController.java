package com.mng.cloud;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class FeignEmployeeInfoController {
	
	 @Autowired
	 EmployeeServiceProxy proxyService;
	 
	 @RequestMapping("/dashboard/feign/{myself}")
	 public Employee findme(@PathVariable Long myself) {
	  return proxyService.findById(myself);
	 }
	 @RequestMapping("/dashboard/feign/peers")
	 public Collection < Employee > findPeers() {
	  return proxyService.findAll();
	 }

}
