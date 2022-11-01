package com.example.myfirstselenium;

public class Palindrome {

    public static boolean isPalindrome(String word) {

        boolean result = false;

        char[] charArray = word.toCharArray();
        String reverseWord = "";
        for (int i = charArray.length - 1; i >= 0; i--) {

           reverseWord = reverseWord + charArray[i];
        }
        System.out.println(reverseWord);
        if (reverseWord.equals(word)){
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        boolean result = isPalindrome("malayalam");
        if (result){
            System.out.println("Given String is Palindrome");
        }
    }
}
