package com.nodeal.sample.java;

public class Sample13Boolean {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean isEnabled = true;

		while (isEnabled) {
			System.out.println("isEnabled");
			isEnabled = false;

			if (!isEnabled) {
				System.out.println("isDisabled");
				isEnabled = true;
			}
		}
	}

}
