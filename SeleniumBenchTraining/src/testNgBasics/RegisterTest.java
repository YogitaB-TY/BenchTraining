package testNgBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterTest {
	
	@Test
	public void registerTest() {
		  WebDriver driver=new ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		  driver.get("http://demowebshop.tricentis.com/");
		  driver.findElement(By.className("ico-register")).click();
		  driver.findElement(By.xpath("//input[@value='M']")).click();
		  driver.findElement(By.id("FirstName")).sendKeys("Hello");
		  driver.findElement(By.id("LastName")).sendKeys("Hi");
		  driver.findElement(By.id("Email")).sendKeys("Hello@gmail.com");
		  driver.findElement(By.id("Password")).sendKeys("Password@123");
		  driver.findElement(By.id("ConfirmPassword")).sendKeys("Password@123");
		  driver.findElement(By.id("register-button")).click(); driver.close();
	}
}
