package com.nodeal.sample.java;

public class Sample03Operator1 {

	static int a = 1;
	static int b = 2;
	static int c = 3;
	static int d, e, f, g; 
	static float h; // static Ÿ���� �Ǽ��� ���� h�� ����

	public static void main(String[] args) {
		d = a + b;
		System.out.println(d);
		
		e = b - c;
		System.out.println(e);
		
		f = d * e; // f�� d�� e�� ���� ���� ����
		System.out.println(f);
		
		g = a / b; // f�� b�� c�� ���� ���� ����
		System.out.println(g);
		
		float aa = a; // �Ǽ��� ���� aa ����, a ����
		float bb = b; // �Ǽ��� ���� bb ����, b ����
		h = aa / bb;
		System.out.println(h);
	}
}
