package com.tivon.server.aop3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect // 该类为切面
public class MyAspect {

	@Before(value = "execution(public * *(..))")
	public void mybefore() {

		System.out.println("前置增强");
	}

	// 后置增强
	@AfterReturning(value = "execution(public * *(..))")
	public void myafterReturning() {

		System.out.println("后置增强");
	}

	// 异常增强
	@AfterThrowing(value = "execution(public * *(..))")
	public void myafterThrowing() {

		System.out.println("异常增强");
	}

	// 环绕增强
	@Around(value = "execution(public * *(..))")
	public void myAround(ProceedingJoinPoint jp) {
		System.out.println("环绕前增强");
		try {
			jp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("环绕后增强");

	}

	// 最终增强
	@After(value = "execution(public * *(..))")
	public void myafterLogger() {
		System.out.println("最终增强");
	}
}
