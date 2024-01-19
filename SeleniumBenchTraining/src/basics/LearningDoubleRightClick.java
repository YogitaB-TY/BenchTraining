package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningDoubleRightClick {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions action=new Actions(driver);
		action.moveToElement(rightClickButton).contextClick().build().perform();
		Thread.sleep(3000);
		WebElement doubleClickButton=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action.doubleClick(doubleClickButton).build().perform();
		
	}
}
