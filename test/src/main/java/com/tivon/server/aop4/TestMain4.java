package com.tivon.server.aop4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.tivon.server.aop2.IUserDao;

public class TestMain4 {

//	<!-- 定义被代理者 -->
//	<bean id="userDao" class="com.tivon.server.aop.UserDao"></bean>
//	<bean id="myAspect" class="com.tivon.server.aop3.LoginHelper"></bean>
//
//	<aop:config>
//		<aop:pointcut id="loginHelpers" expression="execution(* *.login(..))" />
//		<aop:aspect ref="myAspect">
//			<aop:before pointcut-ref="loginHelpers" method="beforeLogin" />
//			<aop:after pointcut-ref="loginHelpers" method="afterLogin" />
//		</aop:aspect>
//	</aop:config>
	public static void main(String[] args) {
        ApplicationContext appCtx = new FileSystemXmlApplicationContext("application.xml"); 
		IUserDao userDao = (IUserDao) appCtx.getBean("userDao");
		userDao.login();
	}
}
