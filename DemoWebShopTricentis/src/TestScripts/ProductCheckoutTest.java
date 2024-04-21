package TestScripts;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRepository.BooksPage;
import ObjectRepository.CheckoutPage;
import ObjectRepository.LoginPage;
import ObjectRepository.ShoppingCartPage;
import ObjectRepository.WelcomePage;

public class ProductCheckoutTest {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.getLoginlink().click();

		LoginPage loginpage = new LoginPage(driver);
		loginpage.getEmailTextField().sendKeys("shivashiv2102@gmail.com");
		loginpage.getPasswordTextField().sendKeys("Shiva@123");
		loginpage.getLogInbutton().click();

		welcomePage.getBookslink().click();
		BooksPage booksPage = new BooksPage(driver);
		booksPage.getFictionBookslink().click();
		welcomePage.getShoppingcartlink().click();

		ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
		shoppingCartPage.getTermsandofserviceChecbox().click();
		shoppingCartPage.getCheckoutButton().click();

		CheckoutPage checkoutPage = new CheckoutPage(driver);
		checkoutPage.getBillingaddressContinuebutton().click();
		checkoutPage.getInstorepickCheckbox().click();
		checkoutPage.getShippingAddressContinuebutton().click();
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[onclick='ShippingMethod.save()']")));
		Thread.sleep(3000);
		checkoutPage.getPaymentmethodContinuebutton().click();
		checkoutPage.getPaymentInfoContinuebutton().click();
		checkoutPage.getConfirmbutton().click();
		checkoutPage.getThankyoucontinuebutton().click();
	}
}