package com.nodeal.sample.java;

public class Sample04ControlStatement {

	static int a = 1;

	public static void main(String[] args) {
		if (a == 1) { // a�� 1�� ��
			System.out.println("a is one");
		} else if (a == 2) { // a�� 2�� ��
			System.out.println("a is two");
		} else if (a == 3) { // a�� 3�� ��
			System.out.println("a is three");
		} else { // a�� 1�� 2�� 3�� �ƴ� ��
			System.out.println("a is not one or two or three");
		}

		switch (a) { // a��
		case 1: // 1�� ��
			System.out.println("a is one");
			break;
		case 2: // 2�� ��
			System.out.println("a is two");
			break;
		case 3: // 3�� ��
			System.out.println("a is three");
			break;
		default: // 1�� 2�� 3�� �ƴ� ��
			System.out.println("a is not one or two or three");
		}
	}
}
