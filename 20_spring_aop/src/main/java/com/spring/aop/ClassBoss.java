package com.spring.aop;

// 테스트 목적의 클래스 1
public class ClassBoss implements IPosition{

	@Override
	public void work() {
		System.out.println("사장의 일을 한다.");
		
	}

	@Override
	public void getWorkTime() {

		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void normal(String title, int salary) {

		System.out.println("직급 : " + title);
		System.out.println("급여 : " + salary);
	}

	@Override
	public void mistake() {
		// TODO Auto-generated method stub
		
	}

}
