package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningDragDropAction {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement oslo=driver.findElement(By.id("box1"));
		WebElement norway=driver.findElement(By.xpath("//div[text()='Norway']"));
		WebElement washington=driver.findElement(By.id("box3"));
		WebElement unitedStates=driver.findElement(By.xpath("//div[text()='United States']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(oslo, norway).build().perform();
		Thread.sleep(3000);
		action.clickAndHold(washington).build().perform();
		action.release(unitedStates).build().perform();
		
	}

}
