package in.sportyshoes.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import in.sportyshoes.pages.AddProductToCartPage;
import in.sportyshoes.pages.CartPage;
import in.sportyshoes.pages.OrderPage;
import in.sportyshoes.pages.RegisterPage;
import in.sportyshoes.pages.RegisterUserPage;
import in.sportyshoes.pages.loginPage;

public class placeOrder extends BaseTest{

	@Test
	public void PlaceOrder() throws InterruptedException {
		
		loginPage loginpage = new loginPage(driver);
		loginpage.clickRegisterHere();
		
		RegisterPage registerPage = new RegisterPage(driver);
		registerPage.EnterName("batman1234");
		registerPage.EnterEmail("batman1234@gmail.com");
		registerPage.EnterPassword("batman123");
		registerPage.clickOnRegisterBtn();
		
		RegisterUserPage registerUserPage = new RegisterUserPage(driver);
		registerUserPage.clickOnLogoutBtn();
		
		loginpage.enterEmail("batman1234@gmail.com");
		loginpage.enterPassword("batman123");
		loginpage.clickLoginBtn();
		
		AddProductToCartPage addProductToCartPage = new AddProductToCartPage(driver);		
		addProductToCartPage.clickOnAddToCartBtn();
		addProductToCartPage.clickOnHomeBtn();
		addProductToCartPage.clickOnCartBtn();
		
		CartPage cartPage = new CartPage(driver);
		cartPage.clickOnPlaceOrderBtn();
		
		OrderPage orderPage = new OrderPage(driver);
		String expectedText = "Success!";
		String actualText = orderPage.getTextMessage();
		Assert.assertEquals(actualText, expectedText);
	}
}
