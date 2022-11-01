package com.mytraining.selenium.training;

import java.util.regex.Pattern;

public class ValidEmail {

    //email address should have @ sign
    //username / Domain should not have one or more white space
    // Domain should have at least one . char

    public static boolean patternMatches(String emailAddress) {
        String regexPattern = "^(.+)@(\\S+).+$";

        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }

    public static void main(String[] args) {
        String email1 = "mdanees4242@gmail.com";
        String email2 = "md anees 4242";
        String email3 = "Mdanees.com";
        String email4 = "mdanees@";

        System.out.println("The Given email Id is "+patternMatches(email1));
        System.out.println("The Given email Id is "+patternMatches(email2));
        System.out.println("The Given email Id is "+patternMatches(email3));
        System.out.println("The Given email Id is "+patternMatches(email4));

    }
}
