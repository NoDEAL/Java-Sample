package com.nodeal.sample.java;

public class Sample07Method {
	/* �ٸ� ���α׷��� ���� �θ��� '�Լ�'�� �ٸ��� Java������ �۾��� �����ϴ� ������ ��Ī�� '�޼ҵ�'�� �Ѵ�. */
	public static void main(String[] args) {
		int a = plus(1, 2); // a�� plus�޼ҵ忡 1�� 2�� �ο��� ������ ��ȯ���� ����
		System.out.println(a);

		System.out.println(plus(1, 2)); // plus�޼ҵ忡 1�� 2�� �ο��� ������ ��ȯ���� ���

		Sample07Method_Sub method_Sub; // Sample08Constructor ����
		method_Sub = new Sample07Method_Sub();

		int b = method_Sub.plus(1, 2); // Sample07Method_Sub ���� ������ �޼ҵ� plus�� 1��
										// 2�� �ο��� ������ ��ȯ���� ����
		System.out.println(b);

		System.out.println(method_Sub.plus(1, 2)); // Sample07Method_Sub ���� ������
													// �޼ҵ� plus�� 1�� 2�� �ο��� ������
													// ��ȯ���� ���
	}

	public static int plus(int i1, int i2) { // static Ÿ���� �� ���� ������ ������ �μ��� ������
												// ������ �޼ҵ� plus ����
		return i1 + i2; // i1�� i2�� ���� ���� ��ȯ
	}
}
