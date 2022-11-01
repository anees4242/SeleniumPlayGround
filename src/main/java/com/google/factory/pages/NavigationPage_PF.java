package com.google.factory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationPage_PF {

	
	private WebElement showAllResults;
	@FindBy(name = "hdtb-mitem hdtb-msel")
	WebDriver driver;

	@FindBy(partialLinkText = "Maps")
	private WebElement showMapsResults;

	@FindBy(css = "a[data-hveid='CAIQBA']")
	private WebElement listOfImages;

	@FindBy(xpath = "//a[@data-hveid='CAIQBQ']")
	private WebElement listOfVideos;
	
	@FindBy(xpath = "//a[@data-hveid='CAIQBg']")
	private WebElement listOfNews;

	public NavigationPage_PF(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public void navigateToAll() {
		showAllResults.click();
	}

	public void navigateToMaps() {

		showMapsResults.clear();

	}

	public void navigateToImages() {

		listOfImages.click();

	}

	public void navigateToVideos() {
		listOfVideos.click();

	}

	public void navigateToNews() {
		listOfNews.click();

	}
}
