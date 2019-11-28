package com.qingao.mgj.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qingao.mgj.pojo.Store;
import com.qingao.mgj.service.AppService;


@RestController
@RequestMapping("/regeditcontroller")
public class RegeditController {
	
	@Autowired
	AppService appService;
	
	
	@RequestMapping("validisok")
	public Object validIsOk(String keycode,HttpSession session){
		
		String keycode_app=(String)session.getAttribute("keycode");
		return keycode_app.equals(keycode);
	}
	
	
	@RequestMapping("lognameisok")
	public Object lognameIsOk(String stlogname){
		
		return !appService.storeNameAlreadyUsed(stlogname);
	}
	
	
	
	
	@RequestMapping("doregedit")
	public Object doRegedit(Store store){
		
		return appService.doRegedit(store);
	}
}
