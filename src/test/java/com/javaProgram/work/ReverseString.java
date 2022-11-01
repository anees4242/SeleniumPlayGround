package com.javaProgram.work;

public class ReverseString {

	static void reverse(String word) {
		String sub = word.substring(0, 3);
//		0 1 2 3 4 5 6 7 8 9 0 1 2 3
//		A a l i y a h
//		M o h a m m e d _ A n e e s
		System.out.println("substring "+sub);
		char[] chArray = word.toCharArray();
		// char letter = chArray[0];
		int n = word.length();
		
		System.out.print("Lenght of the Array is " + n);

		for (int i = n - 1; i >= 0; i--) {
			System.out.print(chArray[i]);

		}

	}

	public static void main(String[] args) {

		reverse("Aaliyah");

	}

}
