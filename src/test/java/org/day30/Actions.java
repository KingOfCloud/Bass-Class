package org.day30;

import org.baseclass.Baseclass;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Actions extends Baseclass {
	
	@Test
	public static void guru99() throws InterruptedException {
		initialization("Chrome","https://demo.guru99.com/test/drag_drop.html");
		WebElement sel = Locator("xpath", "//a[text()='Selenium']");
		Action("Mousehover", sel, null);
	
		WebElement click = Locator("xpath", "//a[text()='Selenium']");
		Action("Click", click, null);
		Thread.sleep(1000);
		Navigation("back", null);
		Thread.sleep(1000);
		WebElement rc = Locator("xpath", "(//a[@class='button button-orange'])[4]");
		Action("Rirhtclick", rc, null);
		Thread.sleep(1000);
		WebElement drag = Locator("xpath", "(//a[@class='button button-orange'])[4]");
		WebElement drop = Locator("xpath", "(//li[@class='placeholder'])[4]");
		Action("Draganddrop", drag, drop);
		System.out.println("Action is Complete");
	}
	
}
