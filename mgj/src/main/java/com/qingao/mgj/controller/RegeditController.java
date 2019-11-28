package com.qingao.mgj.controller;

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
	
	@RequestMapping("doregedit")
	public Object doRegedit(Store store){
		
		return appService.doRegedit(store);
	}
}
