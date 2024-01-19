package basics;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WorkingWithScreenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		//int a=(int)b;
		TakesScreenshot ts=(TakesScreenshot) driver;
		//OutputType---> File then return type file
		File dest=new File("./Screenshots/pageScreenshot.png");
		File temp=ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(temp, dest);
		//System.out.println(LocalDateTime.now().toString());
		
	}

}
