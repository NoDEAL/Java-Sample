package com.nodeal.sample.java;

public class Sample10Accessing2 {
	public static void main(String[] args) {
		Sample10Accessing1.sMethod1(); // Sample10Accessing을 참고한다. 정적 메소드는 메소드가
										// 존재하는 클래스 선언과 초기화 없이 바로 사용할 수 있다.
		Sample10Accessing1 sample10Accessing1 = new Sample10Accessing1();
		sample10Accessing1.method1(); // Sample10Accessing을 참고한다. 일반 메소드는 메소드가
										// 존재하는 클래스를 초기화하여 사용해야 한다.

		new Sample10Accessing1().method1(); // 일반 메소드를 초기화만 하여 사용한 것이다. 작동은 똑같이
											// 되지만 해당 클래스 내에 접근이 많아야 한다면 연산이 많아져
											// 좋은 프로그램이 되지 못한다.
	}

	public void method1() {
		System.out.println(Sample10Accessing1.INT); // 정적 변수는 다른 클래스에서도 일반 메소드가
													// 접근할 수 있다.
		Sample10Accessing1 sample10Accessing1 = new Sample10Accessing1();
		System.out.println(sample10Accessing1.mInt1); // 전역 변수는 변수가 존재하는 클래스를 초기화하여 사용해야 한다.
		
		System.out.println(new Sample10Accessing1().mInt1); // 메소드와 마찬가지로 초기화만 하여 접근할 수 있다.
	}
}
