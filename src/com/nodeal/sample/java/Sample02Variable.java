package com.nodeal.sample.java;

public class Sample02Variable {
	static int a = 1; // static Ÿ���� ������ ���� a ����, 1�� �ʱ�ȭ
	static int b = 2; // static Ÿ���� ������ ���� b ����, 2�� �ʱ�ȭ
	static int c, d, e; // static Ÿ���� ������ ���� c�� d�� e ����
	
	public static void main(String[] args) {
		System.out.println(a + b); // a�� b�� ���� ���� ���
		
		c = a + b; // c�� a�� b�� ���� ���� ����
		System.out.println(c);
		
		d = a++; // d�� a�� 1�� ���� ���� ����
		System.out.println(d);
		
		e = b--; // e�� b�� 1�� �� ���� ����
		System.out.println(e);
		
		a = b; // a�� b�� ����
		System.out.println(a);
	}
}
