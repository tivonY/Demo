package com.tivon.server.aop3;

import com.tivon.server.aop2.IUserDao;

public class UserDao implements IUserDao{

	@Override
	public void login() {
	      System.out.println("user login");
	}

}
