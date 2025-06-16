package org.utility;

import org.day26.ActionsEx;
import org.testng.annotations.Test;

public class Guru99 extends ActionsEx {
	
	@Test
	public static void Chrome() {
		initialization("Chrome");
		initialization("Click");
		initialization("Drag&Drop");
	}
	
	@Test
	public static void Edge() {
		initialization1("Edge");
		initialization1("Click");
		initialization1("Drag&Drop");
		
	}
	
}
