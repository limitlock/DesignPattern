package com.javalec.strategy;

import com.javalec.robotex.inter.FlyYes;
import com.javalec.robotex.inter.KnifeLazer;
import com.javalec.robotex.inter.MissileYes;

public class MainClass {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		// 이렇게 Robot 클래스를 이용하여 객체를 생성하면, 후에 변경사항이 있을 때 유연하게 대처할 수 있다.
		// ex)날수 없는 슈퍼로봇으로 바꾸고 싶다고 요청이 들어올 경우, 간단히 setFly(new FlyNo())를 선언하면 변경이 가능하다.
		// 지금은 코드가 짧아서 큰 효용성이 없어보이지만, 특정 기능을 담당하는 클래스의 코드가 라인 수가 많을 때는 유용하게 사용될 수 있다.
		// 그리고 이렇게 만들어진 Robot 클래스는 부품화 되어, 다른 곳에서도 사용될 수 있다.

		System.out.println("슈퍼로봇 만들어주세요.");
		Robot superRobot = new SuperRobot();
		superRobot.shape();
		superRobot.actionWalk();
		superRobot.actionRun();

		superRobot.setFly(new FlyYes());
		superRobot.setMissile(new MissileYes());
		superRobot.setKnife(new KnifeLazer());

		superRobot.actionFly();
		superRobot.actionMissile();
		superRobot.actionKnife();

	}

}
