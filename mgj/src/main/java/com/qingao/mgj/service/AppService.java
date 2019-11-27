package com.qingao.mgj.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qingao.mgj.mapper.Store_GoodsinfoMapper;
import com.qingao.mgj.mapper.Store_OrderinfoMapper;

@Service
public class AppService {

	@Autowired
	Store_GoodsinfoMapper store_GoodsinfoMapper;
	
	
	@Autowired
	Store_OrderinfoMapper store_OrderinfoMapper;
	

	public Map getStore_goodsinfo(Integer gimgid) {

		return store_GoodsinfoMapper.getStoreGoodsinfo(gimgid);
	}
	
	

	public List<Map> getStoreOrderinfo(Integer stid) {


		return  store_OrderinfoMapper.getStoreOrderinfo(stid);

	}

}
