package org.day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsEx {

	public static WebDriver driver;
	
	public static void initialization(String browserName) {
		
		switch (browserName) {
		case "Chrome":
			driver =new ChromeDriver();
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			Actions a = new Actions(driver);
			WebElement sel = driver.findElement(By.xpath("//a[text()='Selenium']"));
			a.moveToElement(sel).perform();
			
			break;
		case "Click":
			Actions b=new Actions(driver);
			WebElement sc = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
			b.click(sc).perform();
			WebElement sc1 = driver.findElement(By.xpath("//a[text()='Flash Movie Demo']"));
			b.doubleClick(sc1).perform();
			driver.navigate().back();
			break;
			
		case "Drag&Drop":
			Actions c=new Actions(driver);
			WebElement num = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
			WebElement plc = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
			c.dragAndDrop(num, plc).build().perform();
			
			
		
		
		default:
			System.out.println("Browser not Launch");
		}
	}
	
	public static void initialization1(String browserName) {
		switch (browserName) {
		case "Edge":
			driver =new EdgeDriver();
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			Actions a = new Actions(driver);
			WebElement sel = driver.findElement(By.xpath("//a[text()='Selenium']"));
			a.moveToElement(sel).perform();
			
			break;
		case "Click":
			Actions b=new Actions(driver);
			WebElement sc = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
			b.click(sc).perform();
			WebElement sc1 = driver.findElement(By.xpath("//a[text()='Flash Movie Demo']"));
			b.doubleClick(sc1).perform();
			driver.navigate().back();
			break;
			
		case "Drag&Drop":
			Actions c=new Actions(driver);
			WebElement num = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
			WebElement plc = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
			c.dragAndDrop(num, plc).build().perform();
			

		default:
			System.out.println("Browser not Launch");
		}
	}
		
		
	
	
}
