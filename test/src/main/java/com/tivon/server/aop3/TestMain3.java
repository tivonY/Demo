package com.tivon.server.aop3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.tivon.server.aop2.IUserDao;

public class TestMain3 {

//	<bean class="org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator"/> 
//	<bean id="userDao" class="com.tivon.server.aop.UserDao"></bean>
//	<bean id="myAspect" class="com.tivon.server.aop2.MyAspect"></bean>
//	<aop:aspectj-autoproxy />
	public static void main(String[] args) {

		@SuppressWarnings("resource")  
        ApplicationContext appCtx = new FileSystemXmlApplicationContext("application.xml");  
        IUserDao userDao = (IUserDao)appCtx.getBean("userDao");  
        userDao.login();
	}

}
