package com.java.playground;

import java.util.HashMap;
import java.util.Map;

public class CollectionsDemo {
	public static void main(String[] args) {
		Map<String, String> environments = new HashMap<>();
		environments.put("DEV", "https://www.amazon.dev.com");
		environments.put("SIT", "https://www.amazon-sit.com");
		environments.put("UAT", "https://www.amazon-uat.com");
		environments.put("PROD", "https://www.amazon.com");
		
		String url = environments.get(System.getProperty("env"));
	}
}
