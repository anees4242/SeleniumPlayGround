package com.google.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.google.factory.pages.NavigationPage_PF;
import com.google.pages.ResultsPage;
import com.google.pages.SearchPage;

public class GoogleTestUsingPO {

	private WebDriver driver;
	private SearchPage searchPage;
	private ResultsPage resultsPage;
	private NavigationPage_PF NavigationPage_PF;

	@BeforeSuite
	public void setup() {
		driver = new ChromeDriver();
		System.out.println("Window handle once the browser launched " + driver.getWindowHandle());
		driver.manage().window().maximize();
	}

	@AfterSuite
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}

	@Test
	public void searchGoogle() {
		searchPage = new SearchPage(driver);
		searchPage.goTo("http://google.com/ncr");
		String term = "playwright";
		searchPage.search(term);
		resultsPage = new ResultsPage(driver);
		String resultStat = resultsPage.getResultStat();
		Assert.assertEquals(resultStat.substring(0, 25), "About 113,000,000 results");
		NavigationPage_PF = new NavigationPage_PF(driver);

	}
}
