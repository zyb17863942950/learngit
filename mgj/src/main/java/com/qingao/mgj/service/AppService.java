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
import com.qingao.mgj.mapper.GoodscollectionMapper;
import com.qingao.mgj.mapper.StoreMapper;
import com.qingao.mgj.mapper.Store_GoodsCollectionMapper;
import com.qingao.mgj.mapper.Store_GoodsinfoMapper;
import com.qingao.mgj.mapper.Store_OrderinfoMapper;
import com.qingao.mgj.pojo.GoodscollectionKey;
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
	
	@Autowired
	GoodscollectionMapper goodscollectionMapper;
	
	@Autowired
	Store_GoodsCollectionMapper store_GoodsCollectionMapper;

	
	/**
	 * 			验证提交的商品货物信息是否正确相当于商家提交货物信息进入数据库
	 * @param gimgid
	 * @return
	 */
	public Map getStore_goodsinfo(Integer gimgid) {

		return store_GoodsinfoMapper.getStoreGoodsinfo(gimgid);
	}
	
	
	/**
	 * 		获取商品订单信息
	 * @param stid
	 * @return
	 */
	public List<Map> getStoreOrderinfo(Integer stid) {


		return  store_OrderinfoMapper.getStoreOrderinfo(stid);

	}
	
	
	/**
	 *   登录验证    能否成功登录
	 * @param stlogname
	 * @param stpassword
	 * @return
	 * @throws PasswordErrorException
	 * @throws LogNameIsNotExistException
	 */
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
	
	
	/**
	 *    验证用户名是否可用
	 *    
	 * @param stlogname
	 * @return
	 */
	public boolean storeNameAlreadyUsed(String stlogname){
		StoreExample example=new StoreExample();
		example.createCriteria().andStlognameEqualTo(stlogname);
		return storeMapper.countByExample(example)==1;
		
	}
	
	
	/**
	 *    注册提交数据，用户名以及登录名，将相关信息存入数据库中
	 * @param store
	 * @return
	 */
	@Transactional
	public boolean doRegedit(Store store){
		String  pwd_source=store.getStpassword();   
		String salt=UUID.randomUUID().toString();
		store.setStpassword(new Md5Hash(pwd_source,salt).toString());
		store.setSalt(salt);
		return storeMapper.insert(store)==1;
	}
	
	/**
	 *       插入用户编号以及商品编号信息，同时传入前端某件商品的收藏总量
	 *       
	 *       返回为0，表示插入数据没有成功，返回不为0的数代表着商品的收藏数目
	 * @param areainfo
	 * @return
	 */
	@Transactional
	public Integer doInsert_Goodscollection(GoodscollectionKey goodscollection,Integer gdid){
		
		int insert = goodscollectionMapper.insert(goodscollection);
		
		if(insert==1){
			
		return	store_GoodsCollectionMapper.getGoodsCollectionCount(gdid);
			 
		}
		 return 0;
		
		
	}
	
	
	

}
