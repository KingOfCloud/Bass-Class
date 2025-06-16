package org.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Utility {
	
	public static WebDriver driver;
	
	public static void initialization(String browserName) {
		switch (browserName) {
		
		case "Chrome":
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/login.php/");
			driver.findElement(By.name("email")).sendKeys("9698413982");
			driver.findElement(By.name("pass")).sendKeys("Mega@199800");
			driver.findElement(By.name("login")).click();
			break;
		case "Edge":
			driver =new EdgeDriver();
			driver.get("https://www.flipkart.com/");
			break;
		default:
			System.out.println("Driver not initalized");
		}
	}
	
	
		
		
	
	
	
}
