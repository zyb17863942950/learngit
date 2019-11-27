package com.qingao.mgj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication(scanBasePackages = "com.qingao.mgj")
@MapperScan(value = "com.qingao.mgj.mapper")
@EnableScheduling
public class App {
	/*
	 * 主界面上的定时任务器
	 * 
	 * @Scheduled(fixedRate=5000)
	public void abc(){
		System.out.println("尝试一下定时任务");
		
		
	}*/
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

}
