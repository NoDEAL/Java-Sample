package com.nodeal.sample.java;

public class Sample08Constructor_Sub {
	int a, b;
	
	public Sample08Constructor_Sub(int i1, int i2) { // 다른 클래스에서 이 클래스를 초기화할 때 진행되는 작업이다
		a = i1;
		b = i2;
	}
	
	public int plus() {
		return a + b;
	}
}
