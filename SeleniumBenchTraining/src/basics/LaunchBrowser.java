package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
	//	ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		//EdgeDriver driver=new EdgeDriver();
		driver.close();
		/*or */
		//driver.quit();
	}

}
