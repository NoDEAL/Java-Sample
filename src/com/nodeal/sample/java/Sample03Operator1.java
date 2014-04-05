package com.nodeal.sample.java;

public class Sample03Operator1 {

	static int a = 1;
	static int b = 2;
	static int c = 3;
	static int d, e, f, g; 
	static float h; // static 타입의 실수형 변수 h를 선언

	public static void main(String[] args) {
		d = a + b;
		System.out.println(d);
		
		e = b - c;
		System.out.println(e);
		
		f = d * e; // f에 d와 e를 곱한 값을 대입
		System.out.println(f);
		
		g = a / b; // f에 b를 c로 나눈 값을 대입
		System.out.println(g);
		
		float aa = a; // 실수형 변수 aa 선언, a 대입
		float bb = b; // 실수형 변수 bb 선언, b 대입
		h = aa / bb;
		System.out.println(h);
	}
}
