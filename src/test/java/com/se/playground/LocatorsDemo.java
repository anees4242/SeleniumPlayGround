package com.se.playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsDemo {
	
	private WebDriver driver;

	
	/*

	 <div id='profile'>
 		<img src='head.png'>
 		<h1>Mr.Neo</h1>
 		<p>The one</p>
 		<a href='http://www.logo.com/usr'> Hello Mohammed!</a>
 		<div id='crew'>
 			<img src='crew1.png'>
 			<h2>Mr. Morpheus</h2>
 			<p>The other one</p>
 			<button class='btn cYop' name='btnK' id='btn21' data-qa-id='search'> Search </button>
 		</div>
	</div>
	
	
	 */
	public void runLocatorsDemo() {
		WebElement element = driver.findElement(By.id("btn21"));
		element.click();
		WebElement element1 = driver.findElement(By.name("btnK"));
		element1.click();
		WebElement element2 = driver.findElement(By.xpath("//button[contains(.,'Search')]"));
		element2.click();
		WebElement element3 = driver.findElement(By.cssSelector("button[data-qa-id='search']"));
		element3.click();
		WebElement element4 = driver.findElement(By.linkText("Hello Mohammed!"));
		element4.click();
		WebElement element5 = driver.findElement(By.partialLinkText("Mohammed"));
		element5.click();
		WebElement title6 = driver.findElement(By.tagName("h1"));
		title6.getText();
		WebElement element7 = driver.findElement(By.className("btn cYop"));
		element7.click();
	}

}
