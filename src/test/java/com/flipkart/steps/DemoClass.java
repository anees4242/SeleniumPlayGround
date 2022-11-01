package com.flipkart.steps;

public class DemoClass {

	
	public static void main(String[] args) {
		FlipkartNewHomePage newHomePage = new FlipkartNewHomePage();
		String pageName= newHomePage.getPageName();
		System.out.println(pageName);
	}
}
