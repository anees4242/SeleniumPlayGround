package com.javaProgram.work;

public class SmallestNumberInArray {

	public static void main(String[] args) {

		int arr[] = { 51, 21, 31, 41, 11, 1, 42 };

		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < min) {

				min = arr[i];

			}

		}

		System.out.println("The Smallest Number in Array is " + min);

	}

}
