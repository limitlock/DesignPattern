package com.javelec.singleton;

public class FirstClass {

	public FirstClass() {
		/**
		 * SingletonClass singletonClass = new SingletonClass(); SingletonClass의 생성자가
		 * private으로 지정되었기 때문에, new를 사용할 수 없고 SingletonClass.getSingletonClass()을 이용하여
		 * 내부적으로 만들어진 객체를 리턴받는다.
		 */
		SingletonClass singletonClass = SingletonClass.getSingletonClass();
		System.out.println("First");
		System.out.println("i = " + singletonClass.getI());
		singletonClass.setI(200);
		System.out.println("i = " + singletonClass.getI());

	}

}
