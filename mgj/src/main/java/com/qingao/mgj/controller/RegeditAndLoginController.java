package com.qingao.mgj.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qingao.mgj.exception.LogNameIsNotExistException;
import com.qingao.mgj.exception.PasswordErrorException;
import com.qingao.mgj.pojo.Store;
import com.qingao.mgj.service.AppService;


@RestController
@RequestMapping("/regeditcontroller")
public class RegeditAndLoginController {
	
	@Autowired
	AppService appService;
	
	
	
	@RequestMapping("logout")
	public Object logout(HttpSession session){
		if(session.getAttribute("store")!=null){
			session.removeAttribute("store");
			
		}
			return true;
	}
	
	@RequestMapping("useronline")
	public Object isUserOnline(HttpSession session){
		
		return session.getAttribute("store");
	}
	
	
	
	/**
	 * 
	 * @param stlogname
	 * @param stpassword
	 * @param session
	 * @return  状态没有被禁用，只有用户不存在以及密码错误两个状态
	 */
	@RequestMapping("login")
	public Object login(String stlogname,String stpassword,HttpSession session){
		
		try {
			Store store = appService.login(stlogname, stpassword);
			session.setAttribute("store", store);
			return 1;
		} catch (LogNameIsNotExistException e) {
			// TODO Auto-generated catch block
			return 2;
		}  catch (PasswordErrorException e) {
			// TODO Auto-generated catch block
			return 3;
		}
	}
	
	
	
	/**
	 * 
	 * @param keycode   验证码中设置的传入参数
	 * @param session
	 * 
	 * @return
	 */
	@RequestMapping("validisok")
	public Object validIsOk(String keycode,HttpSession session){
		
		String keycode_app=(String)session.getAttribute("keycode");
		return keycode_app.equals(keycode);
	}
	
	/**
	 * 
	 * 
	 * @param stlogname   商店用户的登录名称
	 * 					作用是查看是否用户名称可用
	 * @return
	 */
	@RequestMapping("lognameisok")
	public Object lognameIsOk(String stlogname){
		
		return !appService.storeNameAlreadyUsed(stlogname);
	}
	
	
	
	/**
	 * 
	 * @param store 数据库中添加新的表，store，bid 商品用户注册以及图片滚动的价格竞标表单，
	 *       CREATE TABLE store(stid INT PRIMARY KEY AUTO_INCREMENT, stlogname VARCHAR(20), 
	 *       stpassword VARCHAR(100), salt VARCHAR(100));
	 * 
	 *     CREATE TABLE bid(bid INTEGER PRIMARY KEY, stid INT, bprice INT);
	 * 
	 * @return
	 */
	@RequestMapping("doregedit")
	public Object doRegedit(Store store){
		
		return appService.doRegedit(store);
	}
}
