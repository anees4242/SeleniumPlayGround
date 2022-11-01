package com.mytraining.selenium.training;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassTrail {

    static boolean isValidPassword(String password){
        String regex = "^(?=.*\\d+)(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%&+])(?=[\\S+]).{8,20}$";

        if (password == null){
            return false;
        }

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        return m.matches();
    }



    public static void main(String[] args) {
        String pass1 = "Password12#";
        String pass2 = "Pass Word";
        String pass3 = "abcdefg1234";
        String pass4 = "!@PASSWORD";
        String pass5 = "Password!@98";

        System.out.println("The given password is a valid password :"+isValidPassword(pass1));
        System.out.println("The given password is a valid password :"+isValidPassword(pass2));
        System.out.println("The given password is a valid password :"+isValidPassword(pass3));
        System.out.println("The given password is a valid password :"+isValidPassword(pass4));
        System.out.println("The given password is a valid password :"+isValidPassword(pass5));
    }
}
