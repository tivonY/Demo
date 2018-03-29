package com.tivon.server.aop4;

public class LoginHelper{

    public void beforeLogin(){  
        System.out.println("--- beforeLogin ---");  
    }  
      
    public void afterLogin(){  
        System.out.println("--- afterLogin ---");  
    }  
    
}
