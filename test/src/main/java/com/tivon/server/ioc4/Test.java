package com.tivon.server.ioc4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.tivon.server.aop2.IUserDao;

public class Test {
	
	public static void main(String[] args) {
//		http://www.importnew.com/14751.html
		
//	    <!--IOC ①实现类实例化-->
//	    <bean id="geli" class="com.tivon.server.ioc4.LiuDeHua"/>
//	    <!--②通过geli-ref建立依赖关系-->
//	    <bean id="moAttack" class="com.tivon.server.ioc4.MoAttack">
//	    		<property name="geli" ref="geli"/>  
//	    </bean>

        ApplicationContext appCtx = new FileSystemXmlApplicationContext("application.xml"); 
        MoAttack moAttack = (MoAttack) appCtx.getBean("moAttack");
        moAttack.cityGateAsk();
	}

}
