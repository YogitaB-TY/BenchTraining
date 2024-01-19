package basics;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {
	

	private static final Class NoSuchElementException = null;

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("6765765");
		driver.findElement(By.name("submit")).click();
		/*
		 * Explicit wait
		 */
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert=driver.switchTo().alert();
		if(alert.getText().contains("delete")){
			alert.accept();
		}
		alert.dismiss();
		/*
		 * Fluent wait
		 */
		FluentWait fluentWait=new FluentWait(driver);
		fluentWait.pollingEvery(Duration.ofSeconds(1));
		fluentWait.ignoring(NoSuchElementException );
	
		
		
		
	}

}
