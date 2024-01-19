package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningActions {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Actions action=new Actions(driver);
		WebElement computersLink=driver.findElement(By.partialLinkText("COMPUTERS"));
		action.moveToElement(computersLink).build().perform();
		//composite action
		action.moveToElement(driver.findElement(By.partialLinkText("Desktops"))).click().build().perform();
	}

}
