package com.qingao.mgj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TimerControllerService {
	
	@Autowired
	AppService appServer;
	 
	@Scheduled(fixedRate=2000)
	public void sayHi(){
		
		System.out.println("你好");
	}
	@Scheduled(fixedRate=5000)
	public void eat(){
		
		System.out.println("验证一下定时器的应用");
	} 
}
