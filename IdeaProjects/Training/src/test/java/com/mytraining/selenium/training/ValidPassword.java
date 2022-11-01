package com.mytraining.selenium.training;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword {

 static boolean isValidPassword(String password){

     String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&!+])(?=\\S+).{8,20}$";
     if (password == null){
         return false;
     }
     Pattern p = Pattern.compile(regex);
     Matcher m = p.matcher(password);


     return m.matches();
 }
    public static void main(String[] args) {

     String pass1 = "Password!@98";
     String pass2 = "Passw ord12";
     String pass3 = "12345!@";
     String pass4 = "abed23";


        System.out.println(isValidPassword(pass1));
        System.out.println(isValidPassword(pass2));
        System.out.println(isValidPassword(pass3));
        System.out.println(isValidPassword(pass4));
    }
}
