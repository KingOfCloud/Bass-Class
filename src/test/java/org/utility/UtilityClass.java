package org.utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UtilityClass {
public static WebDriver driver;
private void initialization(String browserName, String url) {
	
	switch (browserName) {
	case "Chrome":
		driver=new ChromeDriver();
		driver.get(url);
		break;
	case "Edge":
		driver=new EdgeDriver();
		driver.get(url);
		break;

	default:
		System.out.println("Driver is not initialized");
	}
}

public static void RobotEx(String keys, String keychar) throws AWTException {
	
	Robot r=new Robot();
	keys=keys.toLowerCase();
	int keyCode = KeyEvent.getExtendedKeyCodeForChar(keychar.charAt(0));
	switch (keys) {
	case "keypress":
		r.keyPress(keyCode);
		break;
	case "keyRelease":
		r.keyRelease(keyCode);
		break;

	default:
		System.out.println("Name should be Entered");
	}
}

private void Screenshot(String name) throws IOException {

	switch (name) {
	case "screenshot":
		File sc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sc, new File("C:\\Users\\judso\\Downloads\\DemoScreenshot\\"+name+".jpeg"));
		break;

	default:
		
	}
		


	
	
	}
	
	
	
}














