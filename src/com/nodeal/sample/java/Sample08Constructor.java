package com.nodeal.sample.java;

public class Sample08Constructor {
	public static void main(String[] args) {
		Sample08Constructor_Sub constructor_Sub; // Sample08Constructor_Sub클래스
													// 선언
		constructor_Sub = new Sample08Constructor_Sub(1, 2); // 선언된
																// constructor_Sub
																// 변수 초기화
		int a = constructor_Sub.plus(); // a에 Sample08Constructor_Sub클래스 내부 정수형
										// 메소드 plus의 정수형 반환값을 a에 대입
		System.out.println(a);

		System.out.println(constructor_Sub.plus()); // a에 Sample08Constructor_Sub클래스 내부 정수형 메소드 plus의
								// 정수형 반환값을 출력
	}
}
