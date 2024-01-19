package testNgBasics;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basics.ReadExcelData;
import frameworkComponents.BaseTest;
import pomRepository.HomePage;
import pomRepository.LoginPage;

public class LoginTest extends BaseTest {
	/*
	 * parallel execution using invocation count and thread pool size helper attributes
	 * //(invocationCount = 4, threadPoolSize = 2)

	 */
	@Test(dataProvider = "LoginData")	
	public void TC_Login_01(String userName,String password) {
		/*
		 * WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * driver.get("http://demowebshop.tricentis.com/");
		 */
		Reporter.log("Application has launched");
		HomePage homePage=new HomePage(driver);
		homePage.clickLoginLink();
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterEmail(userName);
		loginPage.enterPassword(password);
		loginPage.clickLoginButton();
		
		if(driver.findElement(By.className("ico-logout")).isDisplayed()) {
			System.out.println("PASS: User is logged in"); 
			Reporter.log("User has logged in");
		} else {
			System.out.println("FAIL: User is not logged in"); }
		driver.findElement(By.className("ico-logout")).click();
		//driver.quit();
	}

	@DataProvider(name = "LoginData"/* ,parallel = true */)
	public String[][] testData() throws EncryptedDocumentException, IOException {
		return ReadExcelData.readmultipleData();
	}
}
