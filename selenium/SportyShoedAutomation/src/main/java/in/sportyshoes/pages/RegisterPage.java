package in.sportyshoes.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	@FindBy(id = "name")
	private WebElement nameBox;
	
	@FindBy(id = "email")
	private WebElement emailBox;
	
	@FindBy(id = "password")
	private WebElement passwordBox;
	
	@FindBy(xpath = "//button")
	private WebElement registerButton;
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void EnterName(String string) throws InterruptedException {
		Thread.sleep(3000);
		nameBox.sendKeys(string);	
	}


	public void EnterEmail(String string) {
		emailBox.sendKeys(string);
		
	}


	public void EnterPassword(String string) {
		passwordBox.sendKeys(string);
		
	}


	public void clickOnRegisterBtn() {
		registerButton.click();
		
	}

}
