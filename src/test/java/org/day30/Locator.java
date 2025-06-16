package org.day30;

import org.baseclass.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Locator extends  Baseclass{
	
	@Test(priority=1)
	public static void fb() {
	initialization("Chrome", "https://www.facebook.com");
	WebElement user = Locator("name", "email");
	user.sendKeys("9698413982");
	WebElement pass = Locator("name", "pass");
	pass.sendKeys("Mega@199800");
	WebElement login = Locator("name", "login");
	login.click();
	System.out.println("Login Sucess");
	
}

	@Test(priority=2)
	public static void fb1() {
		initialization("Edge", "https://www.facebook.com");
		WebElement user = Locator("name", "email");
		user.sendKeys("9698413982");
		WebElement pass = Locator("name", "pass");
		pass.sendKeys("Mega@199800");
		WebElement login = Locator("name", "login");
		login.click();
		System.out.println("Login Sucess");
	}

	@Test(priority=3)
	public static void fk() {
		initialization("Chrome", "https://demo.guru99.com/test/drag_drop.html");
		WebElement sel = Locator("xpath", "//a[text()='Selenium']");
	Action("Mousehover", sel, null);
	}

	@Test(priority=4)
	public static void DaD() {
		initialization("Chrome", "https://demo.guru99.com/test/drag_drop.html");
		WebElement ele = Locator("xpath", "(//a[@class='button button-orange'])[4]");
		WebElement plc = Locator("xpath", "(//li[@class='placeholder'])[4]");
		Action("Draganddrop", ele, plc);
		System.out.println("Actions Sucess");
		
	}

	@Test(priority=5)
	public static void Ro() {
		initialization("Chrome", "https://www.flipkart.com/");
		WebElement search = Locator("name", "q");
		search.sendKeys("Pen",Keys.ENTER);
		System.out.println("Robot class Sucess");
	}






}
