package com.tivon.server.aop2;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class LoginHelper implements MethodBeforeAdvice, AfterReturningAdvice{

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
        System.out.println("--- afterReturning ---"); 
	}

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
        System.out.println("--- before ---");
	}

    
}
