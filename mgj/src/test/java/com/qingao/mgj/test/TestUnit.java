package com.qingao.mgj.test;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootApplication(scanBasePackages="com.qingao.mgj")
@MapperScan(value="com.qingao.mgj.mapper")
public class TestUnit {
	
	@Test
	public void test(){
		
		System.out.println("看看什么效果");
		
	}
	
	 
}
