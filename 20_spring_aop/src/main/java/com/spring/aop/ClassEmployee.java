package com.spring.aop;

// 테스트 목적의 클래스 3
public class ClassEmployee implements IPosition{

	@Override
	public void work() {
		System.out.println("직원의 일을 한다.");
		
	}

	@Override
	public void getWorkTime() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void normal(String title, int salary) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mistake() {
		// TODO Auto-generated method stub
		
	}

}
