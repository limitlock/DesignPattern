package com.javalec.strategy;

public class LowRobot extends Robot {

	public LowRobot() {
		// TODO 자동 생성된 생성자 스텁
		System.out.println("[깡통로봇]");
	}

	@Override
	public void actionFly() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("날수 없습니다.");
	}

	@Override
	public void actionMissile() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("미사일을 쏠 수 없습니다..");
	}

	@Override
	public void actionKnife() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("검이 없습니다.");
	}

}
