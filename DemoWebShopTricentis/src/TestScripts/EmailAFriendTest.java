package TestScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRepository.DigitalDownloadPage;
import ObjectRepository.LoginPage;
import ObjectRepository.WelcomePage;

public class EmailAFriendTest {

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

		welcomePage.getDigitaldownloadslink().click();

		DigitalDownloadPage digitalDownloadPage = new DigitalDownloadPage(driver);
		digitalDownloadPage.getFirstImg().click();
		digitalDownloadPage.getEmailAfriend().click();
		digitalDownloadPage.getEnterFriendsEmail().sendKeys("imshiva21297@gmail.com");
		digitalDownloadPage.getPersonalMessage().sendKeys("Hi_There");
		digitalDownloadPage.getSendEmail().click();

	}
}
