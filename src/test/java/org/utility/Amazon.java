package org.utility;

import org.day26.RobotEx;
import org.testng.annotations.Test;

public class Amazon extends RobotEx {
	
	@Test(priority=-2)
	public static void Chrome() {
		
		initialization("Chrome");
	}
	
	@Test(priority=-1)
	public static void Pendrive() {
		
		initialization("Pendrive");
	}
	@Test(priority=0)
	public static void Edge() {
		
		initialization1("Edge");
	}
	@Test(priority=1)
	public static void Laptop() {
		
		initialization1("Laptop");
	
}
}