package com.nodeal.sample.java;

public class Sample03Operator4 {

	static int a = 1;
	static int b = 2;
	static boolean c, d; // static Ÿ���� �� ���� c�� d ����

	public static void main(String[] args) {
		if (a == b) {
			c = false; // c�� ��
		} else {
			c = true; // c�� ��
		}
		d = false; // d�� ����

		if (c && d) { // AND ������: �� ��ΰ� ���� ��
			System.out.println("c and d are true");
		} else {
			System.out.println("c or d is false");
		}
		if (c || d) { // OR ������: �� �� �ϳ��� ���� ��
			System.out.println("c or d is true");
		} else {
			System.out.println("c and d are false");
		}
		if (!c) { // NOT ������: ���� �ƴ� ��
			System.out.println("c is false");
		} else {
			System.out.println("c is true");
		}
	}
}
