package com.test.programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword {

	static boolean isValidPassword(String password) {
		String regex = "^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[!@#$%^&])(?=\\S+).{8,20}$";
		
		if (password == null) {

			return false;
		}

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		return m.matches();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Password1 = "Password12#";
		String Password2 = "password";
		String Password3 = "PASS!@";
		String Password4 = "Pass word12";
		
		System.out.println("The given Password is "+ isValidPassword(Password1));
		System.out.println("The given Password is "+ isValidPassword(Password2));
		System.out.println("The given Password is "+ isValidPassword(Password3));
		System.out.println("The given Password is "+ isValidPassword(Password4));
	}

}
