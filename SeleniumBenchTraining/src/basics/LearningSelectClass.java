package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import frameworkComponents.UtilityMethods;

public class LearningSelectClass {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("BOOKS")).click();
		

		WebElement sortByDropDown = driver.findElement(By.id("products-orderby"));
		UtilityMethods um=new UtilityMethods();
		um.selectOption(sortByDropDown, "https://demowebshop.tricentis.com/books?orderby=5");
		
		//sortByDropDown.getScreenshotAs(OutputType.FILE);
		um.getPhoto(driver);
		
		/*
		 * //constructor expects the address of the dropdown Select select=new
		 * Select(sortByDropDown);
		 * //select.selectByValue("https://demowebshop.tricentis.com/books?orderby=5");
		 * List<WebElement> options = select.getOptions(); for(int
		 * i=0;i<options.size();i++) { System.out.println(options.get(i).getText());
		 * 
		 * Thread.sleep(2000);
		 * 
		 * WebElement sortByDropDown1 = driver.findElement(By.id("products-orderby"));
		 * Select select1=new Select(sortByDropDown1); select1.selectByIndex(i);
		 * 
		 * } //select1.selectByVisibleText("Price: Low to High");
		 */ }

}
