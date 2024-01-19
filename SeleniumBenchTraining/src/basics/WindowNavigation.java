package basics;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowNavigation {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		/*
		 * manage() is used to manage 3 things:
		 * Cookies
		 * timeouts
		 * Window
		 */
		driver.manage().window().maximize();
		/*
		 * navigate() : used to perform browser navigation
		 */
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.navigate().refresh();

		Thread.sleep(2000);
		driver.navigate().to(new URL("https://github.com/"));
		}

}
