package com.nodeal.sample.java;

public class Sample03Operator3 {

	static int a = 1;
	static int b = 2;

	public static void main(String[] args) {

		if (a >= b) { // a 가 b와 같거나 클 때
			if (a > b) { // a 가 b보다 클 때
				System.out.println("a is bigger than b");
			} else { // a 가 b보다 크지 않을 때
				System.out.println("a is same or bigger than b");
			}
		}
		if (a == b) { // a 가 b와 같을 때
			System.out.println("a and b is same");
		}
		if (a <= b) { // a 가 b와 같거나 작을 때
			if (a < b) { // a 가 b보다 작을 때
				System.out.println("a is smaller than b");
			} else { // a 가 b보다 작지 않을 때
				System.out.println("a is same or smaller than b");
			}
		}
		if (a != b) { // a 가 b와 같지 않을 때
			System.out.println("a and b is not same");
		}

	}
}
