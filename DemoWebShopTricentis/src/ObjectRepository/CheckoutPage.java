package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "[onclick='Billing.save()']")
	private WebElement billingaddressContinuebutton;

	@FindBy(id = "PickUpInStore")
	private WebElement InstorepickCheckbox;
	@FindBy(xpath = "//input[@onclick='Shipping.save()']")
	private WebElement shippingAddressContinuebutton;

	@FindBy(id = "shippingoption_0")
	private WebElement ground10radiobutton;
	@FindBy(css = "[onclick='ShippingMethod.save()']")
	private WebElement shippingmethodContinuebutton;

	@FindBy(css = "[value='Payments.CashOnDelivery']")
	private WebElement CODcheckbox;
	@FindBy(css = "[onclick='PaymentMethod.save()']")
	private WebElement paymentmethodContinuebutton;

	@FindBy(css = "[onclick='PaymentInfo.save()']")
	private WebElement paymentInfoContinuebutton;

	@FindBy(css = "[onclick='ConfirmOrder.save()']")
	private WebElement confirmbutton;

	@FindBy(css = "[onclick=\"setLocation('/')\"]")
	private WebElement thankyoucontinuebutton;

	public WebElement getBillingaddressContinuebutton() {
		return billingaddressContinuebutton;
	}

	public WebElement getInstorepickCheckbox() {
		return InstorepickCheckbox;
	}

	public WebElement getShippingAddressContinuebutton() {
		return shippingAddressContinuebutton;
	}

	public WebElement getGround10radiobutton() {
		return ground10radiobutton;
	}

	public WebElement getShippingmethodContinuebutton() {
		return shippingmethodContinuebutton;
	}

	public WebElement getCODcheckbox() {
		return CODcheckbox;
	}

	public WebElement getPaymentmethodContinuebutton() {
		return paymentmethodContinuebutton;
	}

	public WebElement getPaymentInfoContinuebutton() {
		return paymentInfoContinuebutton;
	}

	public WebElement getConfirmbutton() {
		return confirmbutton;
	}

	public WebElement getThankyoucontinuebutton() {
		return thankyoucontinuebutton;
	}
}
