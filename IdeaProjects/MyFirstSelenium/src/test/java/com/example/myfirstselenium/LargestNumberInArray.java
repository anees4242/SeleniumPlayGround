package com.example.myfirstselenium;

public class LargestNumberInArray {

    public static void main(String[] args) {
        int[] arr = {29, 53, 10, 0, 3, 38};
//        int[] arr1 = new int[3];
//        arr1[0]=29;
//        arr1[1]=53;
//        arr1[2]=10;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest number is " + max);
    }
}
