package com.qingao.mgj.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qingao.mgj.service.AppService;

@RestController
@RequestMapping("/storegoodsinfocontroller")
public class Store_GoodsinfoController {

	@Autowired
	AppService appService;
	
	
	/**
	 * 
	 * @param gimgid1 商品的编号
	 * @param gdname1 商品的名称
	 * @param price1 商品的价格
	 * @return
	 * 此方法用于前端接收输入商品信息以及价格和名称时，输入返回界面提交，页面返回时true，则可跳转至提交成功页面
	 */
	@RequestMapping("getstoregoodsinfos")
	public boolean getStore_Goodsinfos(Integer gimgid1, String gdname1,Integer price1){
		Map store_goodsinfo = appService.getStore_goodsinfo(gimgid1);
		Set keySet = store_goodsinfo.keySet();
		 List list=new ArrayList();
		 for (Object object : keySet) {
			list.add(object);
		}
		 if(store_goodsinfo.get(list.get(0))==price1){
			 return true;
		 }else if(store_goodsinfo.get(list.get(1))==gimgid1){
			 return true;
		 }else if(store_goodsinfo.get(list.get(2)).equals(gdname1)){
			 return true;
		 }
		 
		return false;
	}
}
