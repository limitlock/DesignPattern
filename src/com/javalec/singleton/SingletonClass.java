package com.javalec.singleton;

public class SingletonClass {

	/**
	 * 가장 기본적인 싱글톤 패턴
	 * 
	 * 싱글톤 패턴 또한, 다양한 방식으로 사용되고 있고 필요에 따라, 다른 방식의 싱글톤 패턴을 사용하는 것이 좋다.
	 */
	private static SingletonClass SINGLETON_CLASS_INSTANCE = new SingletonClass();

	/**
	 * 
	 * private static SingletonClass SINGLETON_CLASS_INSTANCE;
	 * 
	 * 위에와 같이 선언과 동시에 new를 쓰지 않는 방식을 Lazy(게으른) Singleton이라고 하며 최초 선언시에 생성되는
	 * Singleton 객체 또한 메모리에 부담이라고 생각되면 사용하는 방식으로 분명, 선언과 동시에 Singleton객체를 생성하지 않고
	 * getSingletonClass()가 호출될 때 생성되게 때문에 메모리적으로는 부담이 덜하지만, 멀티 쓰레드의 프로그램과 같은 경우에는
	 * getSingletonClass()의 호출이 동시에 일어날 수 있기 때문에 동기화 문제가 발생할 수 있다.
	 * 
	 */

	public int i = 10;

	/**
	 * 다른 클래스에서 new를 이용하여 객체를 생성할 수 없도록, 생성자를 private로 지정한다.
	 */
	private SingletonClass() {

	}

	/**
	 * 
	 * new를 통해 객체를 생성할 수 없기 때문에, 내부적으로 만들어진 객체를 return값으로 반환하여 전역적으로 사용하게 한다.
	 * 
	 */
	public static SingletonClass getSingletonClass() {
		if (SINGLETON_CLASS_INSTANCE == null) {
			SINGLETON_CLASS_INSTANCE = new SingletonClass();
		}
		return SINGLETON_CLASS_INSTANCE;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

}
