package com.example.myfirstselenium;

public class ReverseWords {
    static void reverse(String words){
       /* String[] wordss = new String[4];
        wordss[0]="This "; //wordss[0]
        wordss[1]="is ";
        wordss[2]="Java ";
        wordss[3]="Programming";//wordss[3]*/

       String[] wordsArray=words.split(" ");

        for (int i = wordsArray.length-1; i >=0 ; i--) {
            System.out.print(wordsArray[i]+" ");

        }
    }


    public static void main(String[] args) {
        reverse("This is java programming");
    }
}
