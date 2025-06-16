package org.day30;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.baseclass.Baseclass;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RobotEx extends Baseclass {

	@Test
	public static void Chrome() throws AWTException {
		initialization("Chrome","https://www.amazon.in/");
		WebElement search = Locator("xpath", "//input[@type='text']");
		search.sendKeys("Pendrive");
		Robotclass("keypress", KeyEvent.VK_ENTER);
		Robotclass("keyRelease", KeyEvent.VK_ENTER);
		System.out.println("Robot class Sucess");
	}
	
	@Test
	public static void Edge() throws AWTException {
		initialization("Edge","https://www.amazon.in/");
		WebElement search = Locator("xpath", "//input[@type='text']");
		search.sendKeys("Pendrive");
		Robotclass("keypress", KeyEvent.VK_ENTER);
		Robotclass("keyRelease", KeyEvent.VK_ENTER);
		System.out.println("Robot class Sucess");
	}
}
