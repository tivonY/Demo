package com.tivon.server.ioc4;

public class AndroidPhone implements PhoneCall{

	public void responseCall(String mess){
		System.out.println(mess);
	}
}
