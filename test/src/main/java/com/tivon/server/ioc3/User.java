package com.tivon.server.ioc3;

public class User {
	
	private PhoneCall phoneCall;

	public User() {
		
	}
	
	// ①注入革离的具体扮演者
	public User(PhoneCall geli) {
		this.phoneCall = geli;
	}

	public void responseCall() {
		phoneCall.responseCall("墨者革离！");
	}

	public void setPhoneCall(PhoneCall phoneCall) {
		this.phoneCall = phoneCall;
	}
}
