package com.nodeal.sample.java;

public class Sample02Variable {
	static int a = 1; // static 타입의 정수형 변수 a 선언, 1로 초기화
	static int b = 2; // static 타입의 정수형 변수 b 선언, 2로 초기화
	static int c, d, e; // static 타입의 정수형 변수 c와 d와 e 선언
	
	public static void main(String[] args) {
		System.out.println(a + b); // a와 b를 더한 값을 출력
		
		c = a + b; // c에 a와 b를 더한 값을 대입
		System.out.println(c);
		
		d = a++; // d에 a에 1을 더한 값을 대입
		System.out.println(d);
		
		e = b--; // e에 b에 1을 뺀 값을 대입
		System.out.println(e);
		
		a = b; // a에 b를 대입
		System.out.println(a);
	}
}
