package com.tivon.server.ioc3;

public class Director {

	public void direct() {
		
	   PhoneCall phoneCall = new AndroidPhone();  
       User user = new User();  
  
        //①调用属性Setter方法注入  
       user.setPhoneCall(phoneCall);   
       user.responseCall();
	}

}
