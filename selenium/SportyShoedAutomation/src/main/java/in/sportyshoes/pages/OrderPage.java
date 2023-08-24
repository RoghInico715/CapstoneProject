package in.sportyshoes.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {
	
	@FindBy(xpath = "//strong")
	private WebElement text;

	public OrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getTextMessage() {
		String message = text.getText();
		return message;
	}
}
