package org.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.utility.UtilityClass;

public class ScreenshotEx extends UtilityClass{

	public static RemoteWebDriver driver;
	
	@Test
	private void screen() {
		driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.name("Email")).sendKeys("meganathanindia1998@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Mega@199800");
	}
	








}

