package com.google.factory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultsPage_PF {

	@FindBy(id = "result-stats")
	WebElement resultStat;
	
	

	public ResultsPage_PF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String getResultStat() {
		return resultStat.getText();
	}
}
