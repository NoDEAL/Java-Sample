package com.nodeal.sample.java;

public class Sample06Array1 {
	static int[] a = { 1, 2, 3 }; // staticŸ���� ������ �迭 a ����, 1, 2, 3���� �ʱ�ȭ

	public static void main(String[] args) {
		for (int b = 0; b < a.length; b++) { // b�� �迭 a�� ���̺��� ���� �� ���� 1�� ���ϸ�
			System.out.println(a[b]); // �迭 a�� b��° ���� ���
		}
	}
}
