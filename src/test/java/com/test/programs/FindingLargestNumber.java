package com.test.programs;

public class FindingLargestNumber {

	static void largestNumber(Integer num[]) {

		int max = num[0];
		int len = num.length;

		System.out.println("The length of the array is " + len);

		for (int i = 1; i < len; i++) {

			if (num[i] > max) {

				max = num[i];

			}

		}
		System.out.println("The largest number in the Arrays is " + max);
	}

	public static void main(String[] args) {

		largestNumber(new Integer[] { 12, 13, 21, 100, 33 });

	}

}
