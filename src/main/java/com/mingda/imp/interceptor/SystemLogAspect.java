package com.mingda.imp.interceptor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SystemLogAspect {
	
	
	@Pointcut("@annotation(com.mingda.imp.interceptor.SystemLogAnno)")
	public void serviceAspect() {
		System.out.println("333333333333333333333333333333333");
	}
	@Before("serviceAspect()")
	public void before01(JoinPoint joinPoint) {
		System.out.println("1111111111111111111111111111111111");
		System.out.println(joinPoint.getTarget().toString());
		System.out.println(joinPoint.getTarget().toString());
		System.out.println("2222222222222222222222222222222222");
	}
	@After("serviceAspect()")
	public void after01(JoinPoint joinPoint) {
		System.out.println("1111111111111111111111111111111111");
		System.out.println(joinPoint.getTarget().toString());
		System.out.println(joinPoint.getTarget().toString());
		System.out.println("2222222222222222222222222222222222");
	}
}
