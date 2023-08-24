package in.sportyshoes.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterUserPage {

	@FindBy(linkText = "Logout")
	private WebElement logoutBtn;
	
	public RegisterUserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLogoutBtn() throws InterruptedException {
		Thread.sleep(3000);
		logoutBtn.click();
	}

}
