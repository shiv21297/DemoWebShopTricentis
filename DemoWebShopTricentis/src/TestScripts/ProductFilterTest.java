package TestScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import ObjectRepository.ApparelsAndShoesPage;
import ObjectRepository.CheckoutPage;
import ObjectRepository.LoginPage;
import ObjectRepository.ShoppingCartPage;
import ObjectRepository.WelcomePage;

public class ProductFilterTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.getLoginlink().click();

		LoginPage loginpage = new LoginPage(driver);
		loginpage.getEmailTextField().sendKeys("shivashiv2102@gmail.com");
		loginpage.getPasswordTextField().sendKeys("Shiva@123");
		loginpage.getLogInbutton().click();

		welcomePage.getApparelnshoeslink().click();

		ApparelsAndShoesPage apparelsAndShoesPage = new ApparelsAndShoesPage(driver);

		WebElement sortby = apparelsAndShoesPage.getSortBy();
		Select selectposition = new Select(sortby);
		selectposition.selectByVisibleText("Price: Low to High");

		WebElement display = apparelsAndShoesPage.getDisplay();
		Select selectdisplay = new Select(display);
		selectdisplay.selectByVisibleText("12");

		WebElement viewas = apparelsAndShoesPage.getViewas();
		Select selectview = new Select(viewas);
		selectview.selectByVisibleText("List");
		
		apparelsAndShoesPage.getBluejeanAddToCart().click();
		welcomePage.getShoppingcartlink().click();
		ShoppingCartPage shoppingCartPage=new ShoppingCartPage(driver);
		shoppingCartPage.getTermsandofserviceChecbox().click();
		shoppingCartPage.getCheckoutButton().click();
		
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		checkoutPage.getBillingaddressContinuebutton().click();
		checkoutPage.getInstorepickCheckbox().click();
		checkoutPage.getShippingAddressContinuebutton().click();
		checkoutPage.getPaymentmethodContinuebutton().click();
		checkoutPage.getPaymentInfoContinuebutton().click();
		checkoutPage.getConfirmbutton().click();
		checkoutPage.getThankyoucontinuebutton().click();
		
		welcomePage.getLogoutlink().click();
	}
}
