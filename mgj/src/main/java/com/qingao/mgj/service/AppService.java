package com.qingao.mgj.service;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.ibatis.session.RowBounds;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qingao.mgj.exception.LogNameIsNotExistException;
import com.qingao.mgj.exception.PasswordErrorException;
import com.qingao.mgj.mapper.StoreMapper;
import com.qingao.mgj.mapper.Store_GoodsinfoMapper;
import com.qingao.mgj.mapper.Store_OrderinfoMapper;
import com.qingao.mgj.pojo.Store;
import com.qingao.mgj.pojo.StoreExample;

@Service
public class AppService {

	@Autowired
	Store_GoodsinfoMapper store_GoodsinfoMapper;
	
	@Autowired
	Store_OrderinfoMapper store_OrderinfoMapper;
	
	@Autowired
	StoreMapper storeMapper;

	public Map getStore_goodsinfo(Integer gimgid) {

		return store_GoodsinfoMapper.getStoreGoodsinfo(gimgid);
	}
	
	

	public List<Map> getStoreOrderinfo(Integer stid) {


		return  store_OrderinfoMapper.getStoreOrderinfo(stid);

	}
	
	
public Store login(String stlogname,String stpassword) throws PasswordErrorException, LogNameIsNotExistException{
		
		StoreExample example = new StoreExample();
		example.createCriteria().andStlognameEqualTo(stlogname);
		List<Store> list=storeMapper.selectByExample(example);
		
		if(list==null||list.size()==0){
			
			 throw new LogNameIsNotExistException();
			}
		  Store store=list.get(0);
		    
		  String client_password=new Md5Hash(stpassword,store.getSalt()).toString();
		  
		  if(!client_password.equals(store.getStpassword())){
			  throw new PasswordErrorException();
		  }
		
		  return store;
	}
	
	
	
	public boolean storeNameAlreadyUsed(String stlogname){
		StoreExample example=new StoreExample();
		example.createCriteria().andStlognameEqualTo(stlogname);
		return storeMapper.countByExample(example)==1;
		
	}
	
	@Transactional
	public boolean doRegedit(Store store){
		String  pwd_source=store.getStpassword();   
		String salt=UUID.randomUUID().toString();
		store.setStpassword(new Md5Hash(pwd_source,salt).toString());
		store.setSalt(salt);
		return storeMapper.insert(store)==1;
	}
	
	
	
	
	

}
