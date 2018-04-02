package com.tivon.server.ioc4;

public class User implements ActorArrangable {

	private PhoneCall phoneCall;

	// ①实现接口方法
	public void inject(PhoneCall geli) {
		this.phoneCall = geli;
	}

	public void responseCall() {
		phoneCall.responseCall("墨者革离");
	}

	public PhoneCall getPhoneCall() {
		return phoneCall;
	}

	public void setPhoneCall(PhoneCall geli) {
		this.phoneCall = geli;
	}

}
