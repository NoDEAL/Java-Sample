package com.nodeal.sample.java;

public class Sample10Accessing2 {
	public static void main(String[] args) {
		Sample10Accessing1.sMethod1(); // Sample10Accessing�� �����Ѵ�. ���� �޼ҵ�� �޼ҵ尡
										// �����ϴ� Ŭ���� ����� �ʱ�ȭ ���� �ٷ� ����� �� �ִ�.
		Sample10Accessing1 sample10Accessing1 = new Sample10Accessing1();
		sample10Accessing1.method1(); // Sample10Accessing�� �����Ѵ�. �Ϲ� �޼ҵ�� �޼ҵ尡
										// �����ϴ� Ŭ������ �ʱ�ȭ�Ͽ� ����ؾ� �Ѵ�.

		new Sample10Accessing1().method1(); // �Ϲ� �޼ҵ带 �ʱ�ȭ�� �Ͽ� ����� ���̴�. �۵��� �Ȱ���
											// ������ �ش� Ŭ���� ���� ������ ���ƾ� �Ѵٸ� ������ ������
											// ���� ���α׷��� ���� ���Ѵ�.
	}

	public void method1() {
		System.out.println(Sample10Accessing1.INT); // ���� ������ �ٸ� Ŭ���������� �Ϲ� �޼ҵ尡
													// ������ �� �ִ�.
		Sample10Accessing1 sample10Accessing1 = new Sample10Accessing1();
		System.out.println(sample10Accessing1.mInt1); // ���� ������ ������ �����ϴ� Ŭ������ �ʱ�ȭ�Ͽ� ����ؾ� �Ѵ�.
		
		System.out.println(new Sample10Accessing1().mInt1); // �޼ҵ�� ���������� �ʱ�ȭ�� �Ͽ� ������ �� �ִ�.
	}
}
