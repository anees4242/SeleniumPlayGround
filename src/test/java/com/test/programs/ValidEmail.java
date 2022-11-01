package com.test.programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmail {

	static boolean isValidEmail(String email) {

		String regex = "^(.+)@(\\S+).+$";
		
		if (email == null) {
			return false;
			}
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);
		
		
		return m.matches();
	}

	public static void main(String[] args) {

		String email1 = "mdanees4242@gmail.com";
		String email2 = "mdanees4242gmail.com";
		String email3 = "mdanees4242@";
		String email4 = "md anees 4242.com";

		System.out.println("Given email Id is :"+isValidEmail(email1));
		System.out.println("Given email Id is :"+isValidEmail(email2));
		System.out.println("Given email Id is :"+isValidEmail(email3));
		System.out.println("Given email Id is :"+isValidEmail(email4));
	}

}
