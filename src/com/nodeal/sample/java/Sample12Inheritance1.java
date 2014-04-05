package com.nodeal.sample.java;

public class Sample12Inheritance1 extends Sample12Inheritance_Sub { // 상속할 클래스
																	// 선언. 다중
																	// 상속은 허용되지
																	// 않는다.
	
	/* Inheritance : 상속 */
	
	public static void main(String[] args) { // 전역 메소드 생성
		subMethod2(); // 상속된 클래스의 전역 메소드를 초기화없이 같은 클래스에 존재하는 메소드처럼 사용
		
		Sample12Inheritance1 inheritance = new Sample12Inheritance1();
		inheritance.method1();
		inheritance.subMethod3(); // Sample12Inheritance에서 재정의 되었으므로 재정의된 내용을 따른다.
	}

	public void method1() {
		subMethod1(); // 상속된 클래스의 일반 메소드를 초기화없이 같은 클래스에 존재하는 메소드처럼 사용
	}
	
	@Override // 상속된 클래스의 메소드 내용을 재정의한다.
	public void subMethod3() {
		// 상속된 클래스에서는 출력 구문이 존재했지만 Override하여 삭제했다.
	}
	
	public static void method2() {
		System.out.println("Hello World 4!");
	}
}
