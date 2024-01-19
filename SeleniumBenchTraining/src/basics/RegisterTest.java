package basics;

import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
	
	/*
	 * Test Case 1: Verify user is able to register using valid credentials
	 * Step 1: launch browser
	 * Step 2: Navigate to URL
	 * Step 3: Navigate to register page
	 * Step 4: Enter all the credentials
	 * Step 5: Click on register button
	 * Step 6: Validate user is registered
	 */
	public static void main(String[] args) throws InterruptedException {
		String email="aliabhatt09090@gmail.com";
		ChromeDriver driver=new ChromeDriver();
		//get() is responsible to launch url when url is passed as string.
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		String url=driver.getCurrentUrl();
		if(url.contains("register")) {
			System.out.println("Register page is displayed");
		}
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Alia");
		
		driver.findElement(By.id("LastName")).sendKeys("Bhatt");
		driver.findElement(By.id("Email")).sendKeys(email);
		//password&confirm password	
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(3000);
		if(driver.findElement(By.linkText(email)).isDisplayed()) {
			System.out.println("User is successfully registered");
		}
	}

}
