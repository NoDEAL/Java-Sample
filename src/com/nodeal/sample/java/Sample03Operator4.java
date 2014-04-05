package com.nodeal.sample.java;

public class Sample03Operator4 {

	static int a = 1;
	static int b = 2;
	static boolean c, d; // static 타입의 논리 변수 c와 d 선언

	public static void main(String[] args) {
		if (a == b) {
			c = false; // c는 참
		} else {
			c = true; // c는 참
		}
		d = false; // d는 거짓

		if (c && d) { // AND 연산자: 둘 모두가 참일 때
			System.out.println("c and d are true");
		} else {
			System.out.println("c or d is false");
		}
		if (c || d) { // OR 연산자: 둘 중 하나가 참일 때
			System.out.println("c or d is true");
		} else {
			System.out.println("c and d are false");
		}
		if (!c) { // NOT 연산자: 참이 아닐 때
			System.out.println("c is false");
		} else {
			System.out.println("c is true");
		}
	}
}
