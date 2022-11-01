package com.google.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.google.pages.ResultsPage;
import com.google.pages.SearchPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	private WebDriver driver;
	private SearchPage searchPage;
	private ResultsPage resultsPage;
	private String keyword;

	@Before
	public void setup() {
		driver = new ChromeDriver();
		System.out.println("Window handle once the browser launched " + driver.getWindowHandle());
		driver.manage().window().maximize();
	}

	@After
	public void quit() {
		if (driver != null) {
			driver.quit();
		}
	}

	@Given("the user is on home page")
	public void the_user_is_on_home_page() {
		searchPage = new SearchPage(driver);
		searchPage.goTo("http://google.com/ncr");

	}

	@When("the user searches for {string}")
	public void the_user_searches_for_shoes(String keyword) {
		searchPage.search(keyword);
//		this.keyword=keyword;

	}

	@Then("the user should be listed with relevant results")
	public void the_user_should_be_listed_with_relevant_results() {
		resultsPage = new ResultsPage(driver);
		//String Keyword = "cypress";
		resultsPage.getPageTitle();
		// String resultStat = resultsPage.getResultStat();
		// Assert.assertEquals(resultStat.substring(0, 30), "About 113,000,000
		// results");

		Assert.assertTrue(driver.getTitle().contains(keyword));
	}

}
