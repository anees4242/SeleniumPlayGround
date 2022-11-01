package com.se.playground;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGOrder {

	@BeforeClass
	public void setUp() throws Exception {
		System.out.println("Environment setup done");
	}

	@Test(priority = 0)
	public void login() {
		System.out.println("Login");
		Assert.fail("failing intentionally");
	}

	@Test(priority = 1, dependsOnMethods = "login")
	public void searchProduct() {
		System.out.println("Search product");
	}

	@Test(priority = 2, dependsOnMethods = "searchProduct")
	public void addToCart() {
		System.out.println("Add to cart");
	}

	@Test(priority = 3, dependsOnMethods = "addToCart", enabled = false)
	public void checkout() {
		System.out.println("Checkout");
	}

	@AfterClass
	public void tearDown() throws Exception {
		System.out.println("Environment teardown done");
	}

}
