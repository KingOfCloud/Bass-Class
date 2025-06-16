package org.day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FrameEx {

public static WebDriver driver;
	
	public static void initialization(String browserName) {
	
	switch (browserName) {
	case "Chrome":
		driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("Meganathan");
		driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
		break;
	case "Edge":
		driver = new EdgeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("Meganathan");
		driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
		break;

	default:
		System.out.println("Browser not Launched");
	}	
		
		}
}