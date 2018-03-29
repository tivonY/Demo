package com.tivon.server.aop2;

public class UserDao implements IUserDao{

	@Override
	public void login() {
	      System.out.println("user login");
	}

}
