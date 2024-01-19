package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("6765765");
		driver.findElement(By.name("submit")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(3000);
		if(alert.getText().contains("delete")){
			alert.accept();
		}
		alert.dismiss();
	}

}
