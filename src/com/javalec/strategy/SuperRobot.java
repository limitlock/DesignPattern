package com.javalec.strategy;

public class SuperRobot extends Robot {
	public SuperRobot() {
		// TODO 자동 생성된 생성자 스텁
		System.out.println("[슈퍼로봇]");
	}

	@Override
	public void actionFly() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("날수 있습니다.");

	}

	@Override
	public void actionMissile() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("미사일을 쏠 수 있습니다.");

	}

	@Override
	public void actionKnife() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("레이저검이 있습니다.");

	}

}
