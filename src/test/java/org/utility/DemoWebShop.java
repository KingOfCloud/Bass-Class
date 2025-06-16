package org.utility;

import java.io.IOException;

import org.day26.TakeScreenShoot;
import org.testng.annotations.Test;

public class DemoWebShop extends TakeScreenShoot{

	
	@Test(priority=-1)
	public static void Chrome() throws IOException {
		initialization("Chrome");
	}
	
	@Test(priority=0)
	public static void UserDetail() throws IOException {
		initialization("UserDetail");
	}
	
	@Test(priority=1)
	public static void Login() throws IOException {
		initialization("Login");
	}
	
	
	
	
	
	
	
}
