package com.test.programs;

public class ReverseArray {
	
	 public static void arrayReverse (Integer[] num) {
		 
		 //int[] c = { 1, 2, 3, 4, 5, 6 };

			int l = num.length;

			System.out.println("The length of the arrays is " + l);

			for (int i = l - 1; i >= 0; i--) {
				
			System.out.println(num[i]);

			}
		
	}

	public static void main(String[] args) {

	arrayReverse(new Integer []{1,2,3,4,5,6});	
		

	}

}
