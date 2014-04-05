package com.nodeal.sample.java;

public class Sample03Operator2 {

	static int a = 1;
	static int b = 2;
	static int c, d, e;

	public static void main(String[] args) {
		a = a + 1; // a에 a에 1을 더한 값을 대입
		System.out.println(a);

		b += b; // b에 b를 더한 값을 대입
		System.out.println(b);

		b -= b; // b에 b를 뺀 값을 대입
		System.out.println(b);

		a *= a; // a에 a를 곱한 값을 대입
		System.out.println(a);

		a /= a; // a에 a를 나눈 값을 대입
		System.out.println(a);
	}
}
