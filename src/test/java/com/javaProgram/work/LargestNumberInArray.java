package com.javaProgram.work;

public class LargestNumberInArray {
	

	public static void main(String[] args) {
		
		int[] arr = {10,23,34,2,51,31};
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
			max=arr[i];
			
			}
		}
		
		System.out.println("The Largest Number in an Array is "+ max);
	}

}
