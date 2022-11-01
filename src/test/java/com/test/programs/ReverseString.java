package com.test.programs;

public class ReverseString {

	static void isreversechar(String word) {

		char[] c = word.toCharArray();
		int n = word.length();

		System.out.println("The length of the string is " + n);

		for (int i = n - 1; i >= 0; i--) {

			System.out.println(c[i]);

		}

	}

	public static void main(String[] args) {
		
		isreversechar("Shahul");
	}

}
