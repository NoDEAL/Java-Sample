package com.nodeal.sample.java;

public class Sample06Array2 {

	static int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

	public static void main(String[] args) {
		for (int b = 0; b < a.length; b++) { // b가 a의 길이보다 작을 때 까지 b에 1을 더하며
			for (int c = 0; c < a[b].length; c++) { // c가 a[b]의 길이보다 작을 때 까지 c에
													// 1을 더하며
				System.out.println(a[b][c]); // 배열 a의 b열 c행 값을 출력
			}
		}
	}
}
