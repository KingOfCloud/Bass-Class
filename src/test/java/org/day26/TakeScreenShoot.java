package org.day26;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShoot {

	public static WebDriver driver;
	
	public static void initialization(String browserName) throws IOException {
		
		switch (browserName) {
		case "Chrome":
			driver=new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/");
			break;
		case "UserDetail":
			driver.findElement(By.xpath("//a[text()='Log in']")).click();
			driver.findElement(By.name("Email")).sendKeys("meganathanindia1998@gmail.com");
			driver.findElement(By.name("Password")).sendKeys("Mega@199800");
			TakesScreenshot ts = (TakesScreenshot) driver;
		File s = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(s, new File("C:\\Users\\judso\\Downloads\\DemoScreenshot\\demo.jpeg"));
		Date d=new Date();
			System.out.println("Username & Password Enterd");
			break;
		
		case "Login":
			driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
			File sc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(sc, new File("C:\\Users\\judso\\Downloads\\DemoScreenshot\\demo1.jpeg"));
			System.out.println("Login Success");
			break;
		default:
			System.out.println("Browser not Launched");
		}
		
	}
	
	
	
	
	
	
	
}
