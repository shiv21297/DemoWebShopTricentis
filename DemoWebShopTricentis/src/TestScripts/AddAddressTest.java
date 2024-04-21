package TestScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import ObjectRepository.AddressPage;
import ObjectRepository.LoginPage;
import ObjectRepository.MyAccountPage;
import ObjectRepository.WelcomePage;

public class AddAddressTest {

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

		welcomePage.getShivashiv2102gmaillink().click();

		MyAccountPage myAccountPage = new MyAccountPage(driver);
		myAccountPage.getAddresslink().click();

		AddressPage addressPage = new AddressPage(driver);
		addressPage.getAddnewaddressbutton().click();
		addressPage.getAddFNinAddress().sendKeys("Shiva");
		addressPage.getAddLNinAddress().sendKeys("shiv");
		addressPage.getAddEmailinAddress().sendKeys("shivashiv2102@gmail.com");
		addressPage.getAddcompanyName().sendKeys("amazon");

		WebElement CountryDropdown = addressPage.getAddCountryName();
		Select selectcountry = new Select(CountryDropdown);
		selectcountry.selectByVisibleText("India");

		addressPage.getAddAddressCity().sendKeys("Chennai");
		addressPage.getAddAddress1().sendKeys("3377,TNHB");
		addressPage.getAddAddress2().sendKeys("Avadi");
		addressPage.getAddzipcode().sendKeys("600054");
		addressPage.getAddPhoneNumber().sendKeys("8148442102");
		addressPage.getAddFaxNumber().sendKeys("044");
		addressPage.getSaveButton().click();
	}
}

