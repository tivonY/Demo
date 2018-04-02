package com.tivon.server.ioc4;

public class Director {

	public void direct() {
		
		PhoneCall phoneCall = new AndroidPhone();
		User user = new User();
		
		user.inject(phoneCall);
		user.responseCall();
	}

}
