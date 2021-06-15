package com.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect // AOP에서 Aspect 사용 선언 어노테이션
public class MyAspect {

	@Before("execution(* work())") // 특정 패키지, 클래스의 메소드를 지정
	public void before() {
		System.out.println("AOP Before 메소드 호출 : 출근한다. ");
	}

	@After("execution(* work())")
	public void after() {
		System.out.println("AOP After 메소드 호출 : 퇴근한다. ");

	}


}
