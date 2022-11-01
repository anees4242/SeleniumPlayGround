package com.example.myfirstselenium;

public class ReverseString {

    static void reverse(String txt) {
        char[] chArray = txt.toCharArray();
        char letter = chArray[4];
        int n = txt.length();
        System.out.println("Length of given string " + n);
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(chArray[i]);
        }
    }

    public static void main(String[] args) {

        reverse("Anees");
    }

}
