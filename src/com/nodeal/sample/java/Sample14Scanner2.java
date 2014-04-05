package com.nodeal.sample.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sample14Scanner2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[][] strArray1 = { { "Hello : ", "Hello World!" },
				{ "Bye : ", "Goodbye World!" } };
		int columnIndex = 0;
		for (columnIndex = 0; columnIndex < strArray1.length; columnIndex++) {
			System.out.println(strArray1[columnIndex][0] + strArray1[columnIndex][1]);
		}
		
		System.out.println("\nChoose one (1/2)");
		
		int inputInteger = 0;
		boolean isInteger = true;
		while (isInteger) {
			try {
				inputInteger = new Scanner(System.in).nextInt();
				isInteger = false;
			} catch (InputMismatchException e) {
				System.out.println("You should enter in integer");
				inputInteger = new Scanner(System.in).nextInt();
			}
		}
		boolean isNotCorrect = true;
		
		while (isNotCorrect) {
			if (inputInteger == 1) {
				System.out.println(strArray1[0][1]);
				isNotCorrect = false;
			} else if (inputInteger == 2) {
				System.out.println(strArray1[1][1]);
				isNotCorrect = false;
			} else {
				System.out.println("Enter vaild one");
				inputInteger = new Scanner(System.in).nextInt();
				isNotCorrect = true;
			}
		}
	}

}
