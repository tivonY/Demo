package com.tivon.server.aop2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestMain2 {
//	
//
//	<!-- 定义被代理者 -->
//<!-- 	<bean id="userDao" class="com.tivon.server.aop.UserDao"></bean> -->
//
//	<!-- 定义通知内容，也就是切入点执行前后需要做的事情 -->
//	<!-- <bean id="loginHelper" class="com.tivon.server.aop.LoginHelper"></bean> -->
//
//	<!-- 定义切入点位置 -->
//	<!-- <bean id="loginPointcut" class="org.springframework.aop.support.JdkRegexpMethodPointcut">
//		<property name="pattern" value=".*login"></property>
//	</bean> -->
//
//	<!-- 使切入点与通知相关联，完成切面配置 -->
//	<!-- <bean id="loginHelperAdvisor" class="org.springframework.aop.support.DefaultPointcutAdvisor">
//		<property name="advice" ref="loginHelper"></property>
//		<property name="pointcut" ref="loginPointcut"></property>
//	</bean> -->
//
//	<!-- 设置代理 -->
//	<!-- <bean id="proxy" class="org.springframework.aop.framework.ProxyFactoryBean">
//		代理的对象，有睡觉能力
//		<property name="target" ref="userDao"></property>
//		使用切面
//		<property name="interceptorNames" value="loginHelperAdvisor"></property>
//		代理接口，睡觉接口
//		<property name="proxyInterfaces" value="com.tivon.server.aop.IUserDao"></property>
//	</bean> -->
//	
	//https://blog.csdn.net/zhangliangzi/article/details/52334964
	public static void main(String[] args) {
        //AOP : Aspect Oriented Program
		
		
		//aspectjweaver
		//aspectjrt
		//spring-aop
		
		
		//如果是web项目，则使用注释的代码加载配置文件，这里是一般的Java项目，所以使用下面的方式  
        ApplicationContext appCtx = new FileSystemXmlApplicationContext("application.xml");  
        IUserDao userDao = (IUserDao)appCtx.getBean("proxy");  
        userDao.login();
        
	}
	
	
}
