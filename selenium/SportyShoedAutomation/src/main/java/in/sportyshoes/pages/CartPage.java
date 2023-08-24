package in.sportyshoes.pages;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	
	private WebDriverWait wait;
	private JavascriptExecutor jse;
	
	@FindBy(linkText = "Place Order")
	private WebElement placeOrderBtn;

	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		jse = (JavascriptExecutor)driver;
	}

	public void clickOnPlaceOrderBtn() throws InterruptedException {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(placeOrderBtn));
		jse.executeScript("arguments[0].scrollIntoView()", placeOrderBtn);
		jse.executeScript("arguments[0].click()", placeOrderBtn);
	}	
}
