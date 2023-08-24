package in.sportyshoes.pages;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddProductToCartPage {

	private WebDriverWait wait;
	private JavascriptExecutor jse;
	
	@FindBy(xpath = "(//a[contains(@class, 'btn btn-primary')])[1]")
	private WebElement addtocartBtn;
	
	@FindBy(linkText = "Home")
	private WebElement homeBtn;
	
	@FindBy(linkText = "Cart")
	private WebElement cartBtn;
	
	public AddProductToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		jse = (JavascriptExecutor)driver;
	}

	public void clickOnAddToCartBtn() throws InterruptedException {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(addtocartBtn));
		jse.executeScript("arguments[0].scrollIntoView()", addtocartBtn);
		jse.executeScript("arguments[0].click()", addtocartBtn);
	}
	
	public void clickOnHomeBtn() throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(homeBtn));
		homeBtn.click();
	}
	
	public void clickOnCartBtn() throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(cartBtn));
		cartBtn.click();
	}	
	
}