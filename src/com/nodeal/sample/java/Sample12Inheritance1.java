package com.nodeal.sample.java;

public class Sample12Inheritance1 extends Sample12Inheritance_Sub { // ����� Ŭ����
																	// ����. ����
																	// ����� ������
																	// �ʴ´�.
	
	/* Inheritance : ��� */
	
	public static void main(String[] args) { // ���� �޼ҵ� ����
		subMethod2(); // ��ӵ� Ŭ������ ���� �޼ҵ带 �ʱ�ȭ���� ���� Ŭ������ �����ϴ� �޼ҵ�ó�� ���
		
		Sample12Inheritance1 inheritance = new Sample12Inheritance1();
		inheritance.method1();
		inheritance.subMethod3(); // Sample12Inheritance���� ������ �Ǿ����Ƿ� �����ǵ� ������ ������.
	}

	public void method1() {
		subMethod1(); // ��ӵ� Ŭ������ �Ϲ� �޼ҵ带 �ʱ�ȭ���� ���� Ŭ������ �����ϴ� �޼ҵ�ó�� ���
	}
	
	@Override // ��ӵ� Ŭ������ �޼ҵ� ������ �������Ѵ�.
	public void subMethod3() {
		// ��ӵ� Ŭ���������� ��� ������ ���������� Override�Ͽ� �����ߴ�.
	}
	
	public static void method2() {
		System.out.println("Hello World 4!");
	}
}
