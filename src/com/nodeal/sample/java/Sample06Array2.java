package com.nodeal.sample.java;

public class Sample06Array2 {

	static int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

	public static void main(String[] args) {
		for (int b = 0; b < a.length; b++) { // b�� a�� ���̺��� ���� �� ���� b�� 1�� ���ϸ�
			for (int c = 0; c < a[b].length; c++) { // c�� a[b]�� ���̺��� ���� �� ���� c��
													// 1�� ���ϸ�
				System.out.println(a[b][c]); // �迭 a�� b�� c�� ���� ���
			}
		}
	}
}
