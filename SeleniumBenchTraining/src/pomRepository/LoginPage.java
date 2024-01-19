package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Email")
	WebElement emailTextField;
	
	@FindBy(name = "Password")
	WebElement passwordTextField;
	
	@FindBy(xpath = "//input[@value='Log in']")
	WebElement loginButton;
	
	public void enterEmail(String email) {
		emailTextField.sendKeys(email);
	}
	public void enterPassword(String password) {
		passwordTextField.sendKeys(password);
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}

}
