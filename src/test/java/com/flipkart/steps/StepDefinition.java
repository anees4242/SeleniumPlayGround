package com.flipkart.steps;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.flipkart.po.FlipkartHomePage;
import com.flipkart.po.FlipkartSignInPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class StepDefinition {
	
	public WebDriver driver;
	private FlipkartSignInPage signInPage;
	private FlipkartHomePage homePage;

	@Before
	
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.of(10, ChronoUnit.SECONDS));

	}
	
	@After
	
	public void teardown() {
		  
		 if(driver != null) {
			 driver.quit();
		 }
	}
		 			 
		
		
	
	@Given("The User has a valid flipkart login")
	public void validLogin() {

		String username = "hachibi.mech@gmail.com";
		String password = "mashallah";
		String url = "https://flipkart.com";
		signInPage = new FlipkartSignInPage(driver);
		signInPage.lauch(url);
		signInPage.signIn(username, password);
		homePage = new FlipkartHomePage(driver);
		Assert.assertEquals(homePage.getUserName(), "Mohammed");

	}
	
	

}
