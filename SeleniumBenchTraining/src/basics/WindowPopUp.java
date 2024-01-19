package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/User/Downloads/MultipleWindow.html");

		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(3000);
		Set<String> windowHandles = driver.getWindowHandles();
		for (String handle : windowHandles) {
			Thread.sleep(4000);
			driver.switchTo().window(handle);
			Thread.sleep(2000);
			driver.close();
			/*
			 * if (driver.getCurrentUrl().contains("barbeque")) { driver.close(); } else {
			 * System.out.println(driver.getCurrentUrl()); }
			 */
			 
		}

	}

}
