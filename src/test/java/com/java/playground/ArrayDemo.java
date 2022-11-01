package com.java.playground;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ArrayDemo {

	String[] names;

	@Test
	private void DisplayArray() {
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + " name at " + i);
		}
	}

	@Test
	private void displayArray2() {
		for (String name : names) {
			System.out.println("Names are " + name);
		}
	}

	@BeforeTest
	private void storeArray() {
		names = new String[2];
		names[0] = "Shahul";
		names[1] = "Anees";
	}
}
