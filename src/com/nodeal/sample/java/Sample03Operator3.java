package com.nodeal.sample.java;

public class Sample03Operator3 {

	static int a = 1;
	static int b = 2;

	public static void main(String[] args) {

		if (a >= b) { // a �� b�� ���ų� Ŭ ��
			if (a > b) { // a �� b���� Ŭ ��
				System.out.println("a is bigger than b");
			} else { // a �� b���� ũ�� ���� ��
				System.out.println("a is same or bigger than b");
			}
		}
		if (a == b) { // a �� b�� ���� ��
			System.out.println("a and b is same");
		}
		if (a <= b) { // a �� b�� ���ų� ���� ��
			if (a < b) { // a �� b���� ���� ��
				System.out.println("a is smaller than b");
			} else { // a �� b���� ���� ���� ��
				System.out.println("a is same or smaller than b");
			}
		}
		if (a != b) { // a �� b�� ���� ���� ��
			System.out.println("a and b is not same");
		}

	}
}
