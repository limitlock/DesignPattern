package com.javalec.strategy;

public abstract class Robot {

	/**
	 * 
	 * 스트레티지 패턴이란, 추상화를 이용하여 어떠한 기능의 표준을 만드는 것으로 필요에 따라, 
	 * 이러한 표준을 이용하여 적절하게 변경하여 사용한다.
	 * 자주 사용되거나 사용할 기능들을 부품화하여 재사용성 올리고 일정한 틀을 제공하여 결함이 발생할 확률을 줄이는데 사용될 수 있다.
	 * 
	 */
	
	public Robot() {
		// TODO 자동 생성된 생성자 스텁
	}

	
	
	
	//공통된 속성은 어디에서든지 사용가능하게 public 일반 메소드로 선언한다.
	public void actionWalk() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("걸을 수 있습니다.");
	}

	public void actionRun() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("달릴 수 있습니다.");
	}

	public void shape() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("로봇입니다. 외형은 팔, 다리, 몸통, 머리가 있습니다.");
	}

	//필요에 따라, 변경될 필요가 있는 것은 abstract 추상 메소드로 선언한다.
	public abstract void actionFly();

	public abstract void actionMissile();

	public abstract void actionKnife();

}
