package org.day26;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RobotEx {

	public static WebDriver driver;
	
	public static void initialization(String browserName) {
		
		switch (browserName) {
		case "Chrome":
			driver =new ChromeDriver();
			driver.get("https://www.amazon.in/");
			break;
		case "Pendrive":
			WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
			search.sendKeys("Pendrive",Keys.ENTER);
			System.out.println("Product search complte");
			break;
		default:
			System.out.println("Browser not Launch");
		}
	}
	
	public static void initialization1(String browserName) {
		
		switch (browserName) {
		case "Edge":
			driver =new EdgeDriver();
			driver.get("https://www.amazon.in/");
			break;
		case "Laptop":
			WebElement ser = driver.findElement(By.id("twotabsearchtextbox"));
			ser.sendKeys("Laptop",Keys.ENTER);
			System.out.println("Product search complte");

		default:
			System.out.println("Browser not Launch");
		}
		
	}
	
	}
	
	

