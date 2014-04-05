package com.nodeal.sample.java;

public class Sample11Class {
	public class InnerClass1 { // Ŭ���� ���ο��� �ٸ� Ŭ������ ������ �� �ִ�.
		int class1Int1 = 1; // ���� Ŭ�������� �Ϲ� ������ ���� ������ ������ �� �ִ�.

		public void class1Method1() { // ���� Ŭ�������� �Ϲ� �޼ҵ带 ������ �� �ִ�.
			System.out.println(class1Int1);
		}
	}

	static class InnerClass2 { // Ŭ���� ���ο��� �ٸ� ���� Ŭ������ ������ �� �ִ�.
		int class2Int1 = 2;
		static int class2Int2 = 3; // ���� Ŭ���������� ���� ������ ������ �� �ִ�.

		public void class2Method1() {
			System.out.println(class2Int1);
		}

		public static void class2Method2() { // ���� Ŭ���������� ���� �޼ҵ带 ������ �� �ִ�.
			System.out.println(class2Int2);
		}
	}

	public static void main(String[] args) {
		InnerClass2 class2 = new InnerClass2(); // ���� �޼ҵ忡���� ���� ���� Ŭ���� �ʱ�ȭ��
												// �����ϴ�. ������ �Ϲ� ���� Ŭ���� �ʱ�ȭ��
												// �Ұ����ϴ�.
		class2.class2Method1();
		InnerClass2.class2Method2();
		
		Sample11Class sample11Class = new Sample11Class();
		sample11Class.method1();
	}

	public void method1() {
		InnerClass1 class1 = new InnerClass1(); // �Ϲ� �޼ҵ忡���� �Ϲ� ���� Ŭ���� �ʱ�ȭ�� �����ϴ�
		InnerClass2 class2 = new InnerClass2(); // �Ϲ� �޼ҵ忡���� ���� ���� Ŭ���� �ʱ�ȭ�� �����ϴ�
		class1.class1Method1();
		class2.class2Method1();
		InnerClass2.class2Method2();
	}
}
