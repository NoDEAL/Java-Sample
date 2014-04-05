package com.nodeal.sample.java;

public class Sample04ControlStatement {

	static int a = 1;

	public static void main(String[] args) {
		if (a == 1) { // a가 1일 때
			System.out.println("a is one");
		} else if (a == 2) { // a가 2일 때
			System.out.println("a is two");
		} else if (a == 3) { // a가 3일 때
			System.out.println("a is three");
		} else { // a가 1도 2도 3도 아닐 때
			System.out.println("a is not one or two or three");
		}

		switch (a) { // a가
		case 1: // 1일 때
			System.out.println("a is one");
			break;
		case 2: // 2일 때
			System.out.println("a is two");
			break;
		case 3: // 3일 때
			System.out.println("a is three");
			break;
		default: // 1도 2도 3도 아닐 때
			System.out.println("a is not one or two or three");
		}
	}
}
