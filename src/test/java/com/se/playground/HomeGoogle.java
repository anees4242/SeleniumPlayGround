package com.se.playground;

import static java.time.temporal.ChronoUnit.SECONDS;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;

		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.of(10, SECONDS));

		GoogleTestPo gp = new GoogleTestPo(driver);
		gp.launchGoogle();
		gp.gotoTazaFresh();
		gp.clickBtn();

	}

}
