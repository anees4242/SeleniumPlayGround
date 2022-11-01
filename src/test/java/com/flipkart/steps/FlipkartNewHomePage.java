package com.flipkart.steps;

import com.flipkart.po.FlipkartHomePage;

public class FlipkartNewHomePage extends FlipkartHomePage {
	
	public String getPageName() {
		return "Home Page";
	}
	
	public FlipkartNewHomePage() {
		super(null);
		FlipkartHomePage();
		System.out.println("Default Constructor invoked");
	}

}
