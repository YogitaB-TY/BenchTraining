package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public void TC_Login_01() {

		String url="http://demowebshop.tricentis.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		/*
		 * SoftAssert ast=new SoftAssert(); ast.assertEquals(driver.getCurrentUrl(),
		 * "http://demoweshop.tricentis.com/");
		 */
		Assert.assertTrue(false);
		Reporter.log("Application has launched");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("yogbelavanaki@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Pasword@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		/*
		 * hard assert
		 */
		//Assert.assertTrue(driver.findElement(By.className("ico-logout")).isDisplayed());
		/*
		 * if (driver.findElement(By.className("ico-logout")).isDisplayed()) {
		 * System.out.println("PASS: User is logged in");
		 * Reporter.log("User has logged in"); } else {
		 * System.out.println("FAIL: User is not logged in"); }
		 */
		
		driver.quit();
		//ast.assertAll();
	}

	
}
