package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigitalDownloadPage {

	public DigitalDownloadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "3rd Album")
	private WebElement FirstImg;
	@FindBy(linkText = "Music 2")
	private WebElement SecondImg;
	@FindBy(linkText = "Music 2")
	private WebElement ThirdImg;
	@FindBy(css = "[value='Email a friend']")
	private WebElement EmailAfriend;
	@FindBy(id = "FriendEmail")
	private WebElement enterFriendsEmail;
	@FindBy(id = "PersonalMessage")
	private WebElement PersonalMessage;
	@FindBy(css = "[value='Send email']")
	private WebElement sendEmail;

	public WebElement getFirstImg() {
		return FirstImg;
	}

	public WebElement getSecondImg() {
		return SecondImg;
	}

	public WebElement getThirdImg() {
		return ThirdImg;
	}

	public WebElement getEmailAfriend() {
		return EmailAfriend;
	}

	public WebElement getEnterFriendsEmail() {
		return enterFriendsEmail;
	}

	public WebElement getPersonalMessage() {
		return PersonalMessage;
	}

	public WebElement getSendEmail() {
		return sendEmail;
	}
}

