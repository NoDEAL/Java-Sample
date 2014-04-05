package com.nodeal.sample.java;

public class Sample06Array1 {
	static int[] a = { 1, 2, 3 }; // static타입의 정수형 배열 a 선언, 1, 2, 3으로 초기화

	public static void main(String[] args) {
		for (int b = 0; b < a.length; b++) { // b가 배열 a의 길이보다 작을 때 까지 1을 더하며
			System.out.println(a[b]); // 배열 a의 b번째 값을 출력
		}
	}
}
