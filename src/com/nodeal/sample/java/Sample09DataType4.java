package com.nodeal.sample.java;

public class Sample09DataType4 {
	public static void main(String[] args) {
		/* String�� ���԰� String�� ����. String�� char�� �迭�� ����. */
		char[] char1 = { 97, 98, 99 };
		for (int a = 0; a < char1.length; a++) {
			System.out.print(char1[a]); // println�� �ٸ��� print�� �ٹٲ��� ���� �ʰ� ����Ѵ�
		}
		
		String string1 = "abc";
		System.out.println("\n" + string1); // \n�� �ٹٲ��� �ǹ��Ѵ�.
	}
}
