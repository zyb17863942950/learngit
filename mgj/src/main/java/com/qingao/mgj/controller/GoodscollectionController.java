package com.qingao.mgj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qingao.mgj.pojo.GoodscollectionKey;
import com.qingao.mgj.service.AppService;

@RestController
@RequestMapping("/goodscollectioncontroller")
public class GoodscollectionController {
	
	
	@Autowired
	AppService appService;
	
	
	@RequestMapping("goodscollectinocount")
	public Integer getgoodscollectioncount(Integer gdid,Integer userid){
		
		GoodscollectionKey goodscollection = new GoodscollectionKey();
		goodscollection.setGdid(gdid);
		goodscollection.setUserid(userid);
		
		return appService.doInsert_Goodscollection(goodscollection, gdid);
		
		
		
		 
	}
	
	
	
	
}
