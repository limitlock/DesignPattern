package com.javalec.singleton;

public class SecondClass {

	public SecondClass() {
		// TODO 자동 생성된 생성자 스텁

		/**
		 * 동일한 singletonClass 객체를 사용하기 때문에 First에서 i값을 바꾼 200이 출력된다.
		 */
		SingletonClass singletonClass = SingletonClass.getSingletonClass();
		System.out.println("Second");
		System.out.println("i = " + singletonClass.getI());
	} 
}
