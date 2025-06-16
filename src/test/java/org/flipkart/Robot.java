package org.flipkart;

import java.awt.AWTException;

import org.day26.RobotEx;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.utility.UtilityClass;

public class Robot extends UtilityClass {

	public static WebDriver driver;
	@Test(priority=0)
	public static void Robot() throws InterruptedException, AWTException {
		try {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement element = driver.findElement(By.id("email"));
		element.click();
		Thread.sleep(2000);
		RobotEx("keypress","G");
		RobotEx("keyRelease","G");
		RobotEx("keypress","M");
		RobotEx("keyRelease","M");
		} 
		catch (Exception e) {
		}
		
	
	}
	@Test(priority=1)
	public static void Robot1() throws InterruptedException, AWTException {
		try {
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement element = driver.findElement(By.id("email"));
		element.click();
		Thread.sleep(2000);
		RobotEx("keypress","G");
		RobotEx("keyRelease","G");
		RobotEx("keypress","M");
		RobotEx("keyRelease","M");
		} 
		catch (Exception e) {
		}
		
	
	}
		
	
}
