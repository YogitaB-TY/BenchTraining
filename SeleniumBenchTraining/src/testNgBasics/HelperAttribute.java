package testNgBasics;

import org.testng.annotations.Test;

public class HelperAttribute {
	
	@Test(priority = 3)
	public void TC_03() {
		System.out.println("TC_03 Login");
	}
	@Test(priority = 2)
	public void TC_01() {
		System.out.println("TC_01 Login");
	}
	@Test(priority = 1)
	public void TC_04() {
		System.out.println("TC_04 Login");
	}
	@Test(priority = 4)
	public void TC_02() {
		System.out.println("TC_02 Login");
	}

}
