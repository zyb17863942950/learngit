package com.qingao.mgj.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qingao.mgj.mapper.Store_GoodsinfoMapper;

@Service
public class AppService {
	
	@Autowired
	Store_GoodsinfoMapper store_GoodsinfoMapper;
	
	public Map getStore_goodsinfo(Integer gimgid){
		
		return store_GoodsinfoMapper.getStoreGoodsinfo(gimgid);
	}
	
}
