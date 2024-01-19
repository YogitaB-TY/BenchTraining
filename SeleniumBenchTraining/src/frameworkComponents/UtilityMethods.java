package frameworkComponents;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethods {
	
	public void selectOption(WebElement dropDown,String option) {
		Select select=new Select(dropDown);
		int counter=0;
		try {
		select.selectByIndex(Integer.parseInt(option));
		counter++;
		}
		catch (Exception e) {
			System.out.println("Not an index");
		}
		if(counter==0) {
			try {
			select.selectByValue(option);
			}catch (Exception e) {
				select.selectByVisibleText(option);			}
		}	
	}
	
	public void getPhoto(WebDriver driver) {
		
		LocalDateTime datetime=LocalDateTime.now();
		String fileName=datetime.toString().replaceAll(":", "-");
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File dest=new File("./Screenshots/"+fileName+".png");
		File temp=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
