package com.nodeal.sample.java;

public class Sample09DataType4 {
	public static void main(String[] args) {
		/* String의 도입과 String의 원리. String은 char의 배열과 같다. */
		char[] char1 = { 97, 98, 99 };
		for (int a = 0; a < char1.length; a++) {
			System.out.print(char1[a]); // println과 다르게 print는 줄바꿈을 하지 않고 출력한다
		}
		
		String string1 = "abc";
		System.out.println("\n" + string1); // \n은 줄바꿈을 의미한다.
	}
}
