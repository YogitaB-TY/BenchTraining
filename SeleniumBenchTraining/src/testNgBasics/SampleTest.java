package testNgBasics;

import org.testng.annotations.Test;

public class SampleTest {
	/*
	 * test case 3 depends on the execution of test case 1
	 */
	@Test( dependsOnMethods = "TC_01",alwaysRun = true)
	public void TC_03() {
		System.out.println("TC_03 Login");
	}
	
	@Test
	public void TC_01() {
		System.out.println("TC_01 Login");
		int i=1/0;
	}
	@Test
	public void TC_04() {
		System.out.println("TC_04 Login");
	}
	@Test
	public void TC_02() {
		System.out.println("TC_02 Login");
	}

}
