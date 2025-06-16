package org.day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonEx {

public static WebDriver driver;
	
	public static void initialization(String browserName) {
	
	switch (browserName) {
	case "Chrome":
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		break;
	case "Edge":
		driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		
		break;
	
	default:
		System.out.println("Browser not Launched");
	}	
		
		}
	
	public static void Dropdown(WebElement element,String method, String input) {
	
		switch (method) {
		case "Value":
			Select value= new Select(element);
			value.selectByValue(input);
			break;
		case "Text":
			Select text = new Select(element);
			text.selectByVisibleText(input);
			break;
		case "Index":
			Select index = new Select(element);
			int parseInt = Integer.parseInt(input);
			index.selectByIndex(parseInt);
			break;
		
		default:
			System.out.println("The given dropdown method is recognizable");
			
		}
		
		
		
		
		
}
}