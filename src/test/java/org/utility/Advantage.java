package org.utility;

import org.day26.WindowsHandling;
import org.testng.annotations.Test;

public class Advantage extends WindowsHandling {

	@Test(priority=-1)
	public static void Chrome() throws InterruptedException {
		
		initialization("Chrome");
		//initialization("Book");
	}
	
	@Test(priority=0)
	public static void Book() throws InterruptedException {
		
		initialization("Book");
	}
	
	@Test(priority=1)
	public static void Book1() throws InterruptedException {
		
		initialization("Book1");
	}
}
