package com.nodeal.sample.java;

public class Sample12Inheritance2 extends Sample12Inheritance1 {
	public static void main(String[] args) {
		method2(); // 상속된 클래스의 전역 메소드를 초기화없이 같은 클래스에 존재하는 메소드처럼 사용
		subMethod2(); // 상속된 클래스가 상속한 클래스의 전역 메소드를 초기화없이 같은 클래스에 존재하는 메소드처럼 사용.
						// 다중상속의 편법으로 여겨진다.
	}
}
