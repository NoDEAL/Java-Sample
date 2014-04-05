package com.nodeal.sample.java;

public class Sample09DataType1 {
	static byte byte1 = 1;
	static short short1 = 1;
	static int int1 = 1;
	static long long1 = 1l;
	static float float1 = 1f;
	static double double1 = 1d;
	static boolean boolean1 = true;
	static char char1 = 97;
	
	public static void main(String[] args) {
		System.out.println(byte1); // 8비트 부호가 있는 정수
		System.out.println(short1); // 16비트 부호가 있는 정수
		System.out.println(int1); // 32비트 부호가 있는 정수
		System.out.println(long1); // 64비트 부호가 있는 정수
		System.out.println(float1); // 32비트 부호가 있는 실수
		System.out.println(double1); // 64비트 부호가 있는 실수
		System.out.println(boolean1); // 2비트 참, 거짓
		System.out.println(char1); // 16비트 유니코드 문자
	}
}
