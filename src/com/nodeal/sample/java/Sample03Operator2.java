package com.nodeal.sample.java;

public class Sample03Operator2 {

	static int a = 1;
	static int b = 2;
	static int c, d, e;

	public static void main(String[] args) {
		a = a + 1; // a�� a�� 1�� ���� ���� ����
		System.out.println(a);

		b += b; // b�� b�� ���� ���� ����
		System.out.println(b);

		b -= b; // b�� b�� �� ���� ����
		System.out.println(b);

		a *= a; // a�� a�� ���� ���� ����
		System.out.println(a);

		a /= a; // a�� a�� ���� ���� ����
		System.out.println(a);
	}
}
