package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

	public MyAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Addresses")
	private WebElement addresslink;
	@FindBy(linkText = "Customer info")
	private WebElement customerlink;
	@FindBy(linkText = "Orders")
	private WebElement ordersLink;

	public WebElement getAddresslink() {
		return addresslink;
	}

	public WebElement getCustomerlink() {
		return customerlink;
	}

	public WebElement getOrdersLink() {
		return ordersLink;
	}
}
