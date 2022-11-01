package com.example.myfirstselenium;

import java.util.*;

public class SortArray {
    public static void main(String[] args) {
        int[] arrNum = {6, 5, 2, 1, 9, 10, 0};
        System.out.println(Arrays.toString(arrNum)); // [6, 5, 2, 1, 9, 10, 0]
        sSort(arrNum);
        System.out.println(Arrays.toString(arrNum)); // [0, 1, 2, 5, 6, 9, 10]

        arrNum = new int[]{6, 5, 2, 1, 9, 10, 0};
        System.out.println(Arrays.toString(arrNum)); // [6, 5, 2, 1, 9, 10, 0]
        bSort(arrNum);
        System.out.println(Arrays.toString(arrNum)); // [0, 1, 2, 5, 6, 9, 10]

    }

    /**
     * Selection Sort
     * The main idea to keep finding the smallest element and put it the beginning of array.
     */
    public static void sSort(int[] arr) {
        // loop over each element of array
        for (int i = 0; i < arr.length; i++) {
            int mIndex = i;
            int min = arr[i];

            // find smallest index
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    mIndex = j;
                }
            }

            // swap the values of i and smallest element.
            int tmp = arr[i];
            arr[i] = arr[mIndex];
            arr[mIndex] = tmp;
        }
    }

    /**
     * Bubble Sort
     * In bubble sort we push the biggest elements to the end of array by switching pairs of elements
     * if they are not in correct order.
     */
    public static void bSort(int[] arr) {
        boolean isNotSorted = true;
        // we need this because every iteration of outer loop we don't have to check last element again
        int len = arr.length;

        // loop over the array
        while (isNotSorted) {
            len--;

            // assume is all sorted
            isNotSorted = false;

            // loop over the array
            for (int i = 0; i < len; i++) {
                // take two pairs and check they are in correct order.
                if (arr[i] > arr[i + 1]) {
                    // if not swap them
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;

                    // if something was swapped then we need keep outer loop ON
                    // if nothing got swapped then array sorted.
                    isNotSorted = true;
                }
            }
        }
    }
}