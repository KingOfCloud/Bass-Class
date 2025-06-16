package org.day26;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowsHandling {

	public static WebDriver driver;
	
	
	@SuppressWarnings("deprecation")
	public static void initialization(String browserName) throws InterruptedException  {

	switch (browserName) {
	case "Chrome":
		driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Book",Keys.ENTER);
		System.out.println("URL Launched");
		break;
	case "Book":
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@data-id='9789368971771']")).click();
		String parentId = driver.getWindowHandle();
		Set<String> childId = driver.getWindowHandles();
		for(String s : childId) {
			if(!parentId.equals(s)) {

			}
			driver.switchTo().window(s);
			Thread.sleep(2000);
		}
		driver.switchTo().window(parentId);
		System.out.println("Product search complte");
		break;
		
		
	case "Book1":
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@data-id='9788197808081']")).click();
		Set<String> childId1 = driver.getWindowHandles();
		for(String s1 : childId1) {
			driver.switchTo().window(s1);
		}
		System.out.println("Product search complte");
		break;
	default:
		System.out.println("Browser not Launch");
	
	
	
	}
	
	}	
}

