package org.day30;

import org.baseclass.Baseclass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Navigation extends Baseclass {
	
	@Test
	public static void fk() throws InterruptedException {
		initialization("Chrome","https://www.flipkart.com/");
		Navigation("to", "https://www.facebook.com/login.php");
		Thread.sleep(2000);
		Navigation("back", null);
		Thread.sleep(2000);
		Navigation("forward", null);
		Thread.sleep(2000);
		Navigation("refresh", null);
		System.out.println("Navigation process Sucess");
		
	}
}
