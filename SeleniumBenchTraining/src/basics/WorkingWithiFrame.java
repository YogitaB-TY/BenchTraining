package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithiFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/User/Downloads/iframe.html");
		driver.switchTo().frame("FR1");
		Thread.sleep(3000);
		driver.findElement(By.linkText("LATEST")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Google")).click();
	}
}
