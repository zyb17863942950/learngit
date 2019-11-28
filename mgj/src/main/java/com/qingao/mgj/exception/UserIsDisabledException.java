package com.qingao.mgj.exception;

public class UserIsDisabledException extends Exception{

	@Override
	public void printStackTrace() {
		System.out.println("该用户禁止登陆");
	}
}
