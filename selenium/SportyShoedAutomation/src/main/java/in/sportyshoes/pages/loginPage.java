package in.sportyshoes.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	@FindBy(linkText = "New User? Register Here")
	private WebElement registerBtn;
	
	@FindBy(id = "email")
	private WebElement emailBox;
	
	@FindBy(id = "password")
	private WebElement passwordBox;
	
	@FindBy(xpath = "//button")
	private WebElement loginButton;
	
	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickRegisterHere() throws InterruptedException {
		Thread.sleep(3000);
		registerBtn.click();
	}

	public void enterEmail(String string) throws InterruptedException {
		Thread.sleep(3000);
		emailBox.sendKeys(string);
		
	}

	public void enterPassword(String string) {
		passwordBox.sendKeys(string);
		
	}
	
	public void clickLoginBtn() {
		loginButton.click();
	}
}
