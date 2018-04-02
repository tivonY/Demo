package com.tivon.server.ioc2;

public class AndroidPhone implements PhoneCall{

	public void responseCall(String mess){
		System.out.println(mess);
	}
}
