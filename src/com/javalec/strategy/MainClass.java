package com.javalec.strategy;

public class MainClass {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		SuperRobot sr = new SuperRobot();
		sr.actionFly();
		sr.actionKnife();
		sr.actionMissile();
		sr.actionRun();
		sr.actionWalk();
		sr.shape();
		System.out.println("---------------------");

		StandardRobot st = new StandardRobot();
		st.actionFly();
		st.actionKnife();
		st.actionMissile();
		st.actionRun();
		st.actionWalk();
		st.shape();
		System.out.println("---------------------");

		LowRobot lr = new LowRobot();
		lr.actionFly();
		lr.actionKnife();
		lr.actionMissile();
		lr.actionRun();
		lr.actionWalk();
		lr.shape();
		System.out.println("---------------------");

	}

}
