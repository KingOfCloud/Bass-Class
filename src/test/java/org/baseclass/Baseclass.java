package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {

	public static RemoteWebDriver driver;
	
	public static void initialization(String browserName, String url) {
		switch (browserName) {
		
		case "Chrome":
			driver = new ChromeDriver();
			driver.get(url);
			break;
		case "Edge":
			driver =new EdgeDriver();
			driver.get(url);
			break;
		default:
			System.out.println("Driver not initalized");
		}
	}
	
						//Hi
						//Locator
	public static WebElement Locator(String browser, String value) {
		WebElement element = null;
		switch (browser) {
		case "id":
			element=driver.findElement(By.id(value));
			break;
		case "name":
			element=driver.findElement(By.name(value));
			break;
		case "class":
			element=driver.findElement(By.className(value));
			break;
		case "tag":
			element=driver.findElement(By.tagName(value));
			break;
		case "linktext":
			element=driver.findElement(By.linkText(value));
			break;
		case "partiallinktext":
			element=driver.findElement(By.partialLinkText(value));
			break;
		case "xpath":
			element=driver.findElement(By.xpath(value));
			break;

		default:
			System.out.println("Invalid Locater");
		
		}
		return element;
		
	}
	
					//Navigation
	public static void Navigation(String browser, String url) {
		switch (browser) {
		case "to":
			driver.navigate().to(url);
			break;
		case "back":
			driver.navigate().back();
			break;
		case "forward":
			driver.navigate().forward();
			break;
		case "refresh":
			driver.navigate().refresh();
			break;

		default:
			System.out.println("Invalid Navigation");
		}
	}

								//Actions
	public static void Action(String browser, WebElement element, WebElement drop) {
		Actions a=new Actions(driver);
		switch (browser) {
		case "Mousehover":
			a.moveToElement(element).perform();
			break;
		case "Click":
			a.click(element).perform();
			break;
		case "Rirhtclick":
			a.contextClick(element).perform();
			break;
		case "Doubleclick":
			a.doubleClick(element).perform();
			break;
		case "Draganddrop":
			
			a.dragAndDrop(element, drop).perform();
			break;
		default:
			System.out.println("Invalid Actions");
		}
	}

								//Robot Class
	public static void Robotclass(String key, int keys) throws AWTException {
		Robot r=new Robot();
		switch (key) {
		case "keypress":
			r.keyPress(keys);
			break;
		case "keyRelease":
			r.keyRelease(keys);
			break;

		default:
			System.out.println("Invalid Robotclass");
		}
	}
								//JavaScriptExecutor
	public static void JavaScript(String browser, WebElement element) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		switch (browser) {
		case "Scrolldown":
			js.executeScript("arguments[0].scrollIntoView(true)", element);
			break;
		case "Scrollup":
			js.executeScript("arguments[0].scrollIntoView(false)", element);
			break;
		case "Refreshpage":
			js.executeScript("history.go(0)");
			break;
		case "Toppage":
			js.executeScript("window.scroll(0,1000)");
			break;
		case "Endpage":
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			break;
		case "Click":
			js.executeScript("arguments[0].click();", element);
			break;

		default:
			System.out.println("Invalid JavaScriptExecutor");
		}
	}

								//Select
	public static void select(String browser, WebElement element, String value) {
		Select s=new Select(element);
		switch (browser) {
		case "index":
			s.selectByIndex(Integer.parseInt(value));
			break;
		case "value":
			s.selectByValue(value);
			break;
		case "visibletext":
			s.selectByVisibleText(value);
			break;

		default:
			System.out.println("Invalid Select");
		}
	}

							//Alert
	public static void alert(String browser) {
		Alert a= driver.switchTo().alert();
		switch (browser) {
		case "Simple":
			a.accept();
			break;
		case "Confirm":
			a.dismiss();
			break;
		case "Prompt":
			a.getText();
			break;
		default:
			System.out.println("Invalid Alert");
		}
	}
							//TakesScreenshot
	public static void Screenshot(String name) {
		try {
		File screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File destination=new File("C:\\Users\\judso\\Downloads\\"+name+".png");
			FileUtils.copyFile(screenshotAs, destination);
	}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
							//Frames
	public static void frames(String method,int index,String name,WebElement ref) {
		switch (method) {
		case "index":
			driver.switchTo().frame(index);
			break;
		case "name":
			driver.switchTo().frame(name);
			break;
		case "ref":
			driver.switchTo().frame(ref);
			break;

		default:
			System.out.println("There is no Frames");
		}
	}
	public static void Nestedframe(String method,int index) {
		switch (method) {
		case "frame":
			driver.switchTo().frame(index);
			break;
		case "parent":
			driver.switchTo().parentFrame();
			break;
		case "default":
			driver.switchTo().defaultContent();
			break;

		default:
			System.out.println("Thres is no nestedframe");
		}
	}

						//WebDriver Commends
	public static void Commends(String method,int x,int y) {
		switch (method) {
		case "max":
			driver.manage().window().maximize();
			break;
		case "min":
			driver.manage().window().minimize();
			break;
		case "Dimension":
			Dimension d=new Dimension(x,y);
			driver.manage().window().setSize(d);
			break;
		case "Position":
			Point p=new Point(x,y);
			driver.manage().window().setPosition(p);
			break;

		default:
			System.out.println("No such commend");
		}
	}

						//Window Handling
	public static void windowhandle(String browser) {
		switch (browser) {
		case "parentId":
			String parentId = driver.getWindowHandle();
			break;
		case "allId":
			Set<String> allId = driver.getWindowHandles();
			break;

		default:
			System.out.println("Invalid Window Handling");
		}
	}

						//Waits
	public static void waits(String method) throws InterruptedException {
		switch (method) {
		case "Static wait":
			Thread.sleep(0);
			break;
		case "Implicity wait":
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			break;
		}
	}
}
