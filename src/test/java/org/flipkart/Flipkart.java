package org.flipkart;

import org.day26.AmazonEx;
import org.day26.FrameEx;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.utility.Utility;

public class Flipkart extends AmazonEx {
	
	
	@Test(priority=1)
	public static void Chrome( ) {
		
		initialization("Chrome");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Dropdown(dropdown,"Value","search-alias=alexa-skills");
	}
	
	@Test(priority=2)
	private void Edge() {
		initialization("Edge");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Dropdown(dropdown,"Text","Amazon Fashion");
	}
	
	@Test(priority=3)
	private void Chrome1() {
		
		initialization("Chrome");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Dropdown(dropdown, "Index", "10");
	}
	
	
}
