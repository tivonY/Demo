package com.tivon.server.ioc2;


public class User {
	
	public void testResponseCall() {

		PhoneCall call = new AndroidPhone();   
		call.responseCall(" i am android phone");
	}
}
