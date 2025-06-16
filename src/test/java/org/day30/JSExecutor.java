package org.day30;

import org.baseclass.Baseclass;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExecutor extends Baseclass{

	@Test
	public static void Chrome() throws InterruptedException {
		initialization("Chrome","https://www.myntra.com/");
		JavaScript("Toppage", null);
		
	}
}
