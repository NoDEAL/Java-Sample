package com.nodeal.sample.java;

public class Sample08Constructor {
	public static void main(String[] args) {
		Sample08Constructor_Sub constructor_Sub; // Sample08Constructor_SubŬ����
													// ����
		constructor_Sub = new Sample08Constructor_Sub(1, 2); // �����
																// constructor_Sub
																// ���� �ʱ�ȭ
		int a = constructor_Sub.plus(); // a�� Sample08Constructor_SubŬ���� ���� ������
										// �޼ҵ� plus�� ������ ��ȯ���� a�� ����
		System.out.println(a);

		System.out.println(constructor_Sub.plus()); // a�� Sample08Constructor_SubŬ���� ���� ������ �޼ҵ� plus��
								// ������ ��ȯ���� ���
	}
}
