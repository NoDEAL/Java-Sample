package com.nodeal.sample.java;

public class Sample10Accessing1 {
	/* 객체지향언어에서 가장 중요하다. 이를 모르고 지나간다면 Java는 헛배운게 되는 것이다. */
	
	int mInt1 = 1; // 클래스에서 선언되는 일반 변수는 'member 변수' 또는 '전역 변수'라 하며 편의상 변수 앞
					// member의 m을 붙인다.
	static int INT = 2; // 클래스에서 선언되는 static 변수는 'static 변수' 또는 '정적 변수'라 하며 편의상
						// 변수를 대문자로, 또는 변수 앞 static의 s를 붙인다.

	static Sample10Accessing1 sSample10Variable; // 데이터 형을 떠나 선언되는 모든 정적 변수는 이러한
													// 꼴을 가진다.

	public static void main(String[] args) {
		int int1 = 1; // 메소드에서 선언되는 일반 변수는 수식어 없이 '변수'라 한다. 메소드에서 선언된 변수는 선언된
						// 메소드 내에서만 접근할 수 있다.
		sSample10Variable = new Sample10Accessing1(); // sSample10Variable 초기화
		sSample10Variable.method1(); // 변수와 마찬가지로 정적 메소드에서는 일반 메소드로의 접근이 불가능하다.
										// 이때, 접근할 메소드가 존재하는 클래스를 변수로 선언한 후
										// 초기화하면 가능하다.

		sMethod1(); // 변수와 마찬가지로 정적 메소드는 정적 메소드를 바로 사용할 수 있다.
	}

	public void method1() { // 일반 메소드는 수식어 없이 '메소드'라 한다.
		System.out.println(mInt1); // 일반 메소드에서는 전역 변수 접근이 가능하다.
		System.out.println(INT); // 일반 메소드에서는 정적 변수 접근이 가능하다.

		sMethod1(); // 변수와 마찬가지로 일반 메소드는 정적 메소드를 바로 사용할 수 있다.
	}

	public static void sMethod1() { // 정적 메소드는 모두 대문자로 표기하면 사용의 불편함이 있기에 앞에
									// s를 또는 아무런 표시를 하지 않는다.
		System.out.println(INT); // 정적 메소드에서는 정적 변수의 접근만이 가능하다.
	}
}
