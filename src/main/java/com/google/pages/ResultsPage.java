package com.google.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultsPage {

	private WebDriver driver;
	private final By resultStat = By.id("result-stats");

	public ResultsPage(WebDriver driver) {
		this.driver = driver;
	}

//	public List<String> getResults() {
//		List<String> actualResults = new ArrayList<>();
//		 List<WebElement> results = driver.findElements(By.xpath("//a/h3"));
//		 for (WebElement result : results) {
//			String actualResult = result.getText();
//			actualResults.add(actualResult);
//		}
//		 return results.stream().map(WebElement::getText).collect(Collectors.toList());
//	}

	public String getResultStat() {
		return driver.findElement(resultStat).getText();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
}
