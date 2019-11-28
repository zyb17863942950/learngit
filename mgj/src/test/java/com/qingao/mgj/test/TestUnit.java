package com.qingao.mgj.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qingao.mgj.controller.RegeditController;
import com.qingao.mgj.controller.Store_GoodsinfoController;
import com.qingao.mgj.mapper.Store_GoodsinfoMapper;
import com.qingao.mgj.mapper.Store_OrderinfoMapper;
import com.qingao.mgj.pojo.Store;
import com.qingao.mgj.service.AppService;

import org.mybatis.spring.annotation.MapperScan;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootApplication(scanBasePackages="com.qingao.mgj")
@MapperScan(value="com.qingao.mgj.mapper")
public class TestUnit {
	@Autowired
	Store_OrderinfoMapper store1;
	
	@Autowired
	RegeditController regeditController;
	 
	 
	
	@Test
	public void test(){
		Store dd=new Store();
		dd.setStid(1);
		dd.setStlogname("西子梦纱");
		dd.setStpassword("444");
		  /* regeditController.doRegedit(dd);
		   
		System.out.println("成功");*/
		
	}
	
	 
}
