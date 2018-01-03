package com.javalec.strategy;

import com.javalec.robotex.inter.FlyYes;
import com.javalec.robotex.inter.IFly;
import com.javalec.robotex.inter.IKnife;
import com.javalec.robotex.inter.IMissile;

public class SuperRobot extends Robot {

	/**
	 * 이런식으로 처음부터 생성자를 할당하여 값을 설정할 수 있다.
	 */
	// IFly fly = new FlyYes();
	// IMissile missile = new MissileYes();
	// IKnife knife = new KnifeLazer();

	/**
	 * setter를 이용하여 경우에 따라 다르게도 값을 설정할 수 있다. 아래의 코드는 SuperRobot, StandardRobot,
	 * LowRobot 모두에게 동일하기 때문에 상위 클래스로 옮긴다.
	 */
	// IFly fly;
	// IMissile missile;
	// IKnife knife;
	//
	// public void setFly(IFly fly) {
	// this.fly = fly;
	// }
	//
	// public void setMissile(IMissile missile) {
	// this.missile = missile;
	// }
	//
	// public void setKnife(IKnife knife) {
	// this.knife = knife;
	// }

	public SuperRobot() {
		// TODO 자동 생성된 생성자 스텁
		// MainClass에서 속성을 설정하지 않고 생성자에서 속성을 설정할 수 있다.
		// fly = new FlyYes();
		// missile = new MissileYes();
		// knife = new KnifeLazer();
		// 그리고 요청된 변경사항만 MainClass에서 변경하거나 다시 생성자에서 변경할 수 있다.

	}

	@Override
	public void shape() {
		System.out.println("[슈퍼로봇]");
	}

}
