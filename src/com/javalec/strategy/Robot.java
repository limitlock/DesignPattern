package com.javalec.strategy;

import com.javalec.robotex.inter.IFly;
import com.javalec.robotex.inter.IKnife;
import com.javalec.robotex.inter.IMissile;

public abstract class Robot {

	/**
	 * 
	 * 스트레티지 패턴이란, 추상화를 이용하여 어떠한 기능의 표준을 만드는 것으로 필요에 따라, 이러한 표준을 이용하여 적절하게 변경하여
	 * 사용한다. 자주 사용되거나 사용할 기능들을 부품화하여 재사용성 올리고 일정한 틀을 제공하여 결함이 발생할 확률을 줄이는데 사용될 수 있다.
	 * 
	 */
	// 필요에 따라, 변경될 필요가 있는 것은 추상화한다.
	// 추상메소드도 가능하지만, 좀 더 유연하게 추상화하기 위해서는 인터페이스를 이용한다.

	IFly fly;
	IMissile missile;
	IKnife knife;

	public Robot() {
	}

	// 공통된 속성은 어디에서든지 사용가능하게 public 일반 메소드로 선언한다.
	public void actionWalk() {
		System.out.println("걸을 수 있습니다.");
	}

	public void actionRun() {
		System.out.println("달릴 수 있습니다.");
	}

	public abstract void shape();

	// 값을 설정
	// setFly는 [FlyYes, FlyNo]로 설정된다.
	public void setFly(IFly fly) {
		this.fly = fly;
	}

	// setMissile은 [MissileYes, MissileNo]로 설정된다.
	public void setMissile(IMissile missile) {
		this.missile = missile;
	}

	// setKnife는 [KnifeLazer, KnifeWood, KnifeNo]로 설정된다.
	public void setKnife(IKnife knife) {
		this.knife = knife;
	}

	// setter로 인해 설정된 값을 호출
	public void actionMissile() {
		this.missile.Missile();
	}

	public void actionFly() {
		this.fly.Fly();
	}

	public void actionKnife() {
		this.knife.Knife();
	}

}
