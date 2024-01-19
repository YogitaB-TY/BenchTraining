package testNgBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShoppingCartTest {
	@Test
	public void shoppingCartTest() {
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("yogbelavanaki@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Password@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.partialLinkText("BOOKS")).click();
		driver.findElement(By.xpath("(//a[text()='Computing and Internet'])[2]/../..//input")).click();
		driver.findElement(By.partialLinkText("shopping cart")).click();
		driver.findElement(By.id("checkout")).click();
		driver.close();
	}
}
