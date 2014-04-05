package com.nodeal.sample.java;

public class Sample11Class {
	public class InnerClass1 { // 클래스 내부에서 다른 클래스를 생성할 수 있다.
		int class1Int1 = 1; // 내부 클래스에서 일반 변수와 전역 변수를 생성할 수 있다.

		public void class1Method1() { // 내부 클래스에서 일반 메소드를 생성할 수 있다.
			System.out.println(class1Int1);
		}
	}

	static class InnerClass2 { // 클래스 내부에서 다른 전역 클래스를 생성할 수 있다.
		int class2Int1 = 2;
		static int class2Int2 = 3; // 전역 클래스에서는 전역 변수를 선언할 수 있다.

		public void class2Method1() {
			System.out.println(class2Int1);
		}

		public static void class2Method2() { // 전역 클래스에서는 전역 메소드를 생성할 수 있다.
			System.out.println(class2Int2);
		}
	}

	public static void main(String[] args) {
		InnerClass2 class2 = new InnerClass2(); // 정적 메소드에서는 정적 내부 클래스 초기화가
												// 가능하다. 하지만 일반 내부 클래스 초기화는
												// 불가능하다.
		class2.class2Method1();
		InnerClass2.class2Method2();
		
		Sample11Class sample11Class = new Sample11Class();
		sample11Class.method1();
	}

	public void method1() {
		InnerClass1 class1 = new InnerClass1(); // 일반 메소드에서는 일반 내부 클래스 초기화가 가능하다
		InnerClass2 class2 = new InnerClass2(); // 일반 메소드에서는 정적 내부 클래스 초기화가 가능하다
		class1.class1Method1();
		class2.class2Method1();
		InnerClass2.class2Method2();
	}
}
