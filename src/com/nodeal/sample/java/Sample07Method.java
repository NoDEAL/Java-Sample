package com.nodeal.sample.java;

public class Sample07Method {
	/* 다른 프로그래밍 언어에서 부르는 '함수'와 다르게 Java에서는 작업을 수행하는 구간의 명칭을 '메소드'라 한다. */
	public static void main(String[] args) {
		int a = plus(1, 2); // a메 plus메소드에 1과 2를 부여한 정수형 반환값을 대입
		System.out.println(a);

		System.out.println(plus(1, 2)); // plus메소드에 1과 2를 부여한 정수형 반환값을 출력

		Sample07Method_Sub method_Sub; // Sample08Constructor 참고
		method_Sub = new Sample07Method_Sub();

		int b = method_Sub.plus(1, 2); // Sample07Method_Sub 내부 정수형 메소드 plus에 1과
										// 2를 부여한 정수형 반환값을 대입
		System.out.println(b);

		System.out.println(method_Sub.plus(1, 2)); // Sample07Method_Sub 내부 정수형
													// 메소드 plus에 1과 2를 부여한 정수형
													// 반환값을 출력
	}

	public static int plus(int i1, int i2) { // static 타입의 두 개의 정수형 변수를 인수로 가지는
												// 정수형 메소드 plus 선언
		return i1 + i2; // i1과 i2를 더한 값을 반환
	}
}
