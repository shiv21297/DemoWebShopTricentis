package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {

	public AddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "[value='Add new']")
	private WebElement addnewaddressbutton;
	@FindBy(id = "Address_FirstName")
	private WebElement addFNinAddress;
	@FindBy(id = "Address_LastName")
	private WebElement addLNinAddress;
	@FindBy(id = "Address_Email")
	private WebElement addEmailinAddress;
	@FindBy(id = "Address_Company")
	private WebElement addcompanyName;
	@FindBy(id = "Address_CountryId")
	private WebElement addCountryName;
	@FindBy(id = "Address_City")
	private WebElement addAddressCity;
	@FindBy(id = "Address_Address1")
	private WebElement addAddress1;
	@FindBy(id = "Address_Address2")
	private WebElement addAddress2;
	@FindBy(id = "Address_ZipPostalCode")
	private WebElement addzipcode;
	@FindBy(id = "Address_PhoneNumber")
	private WebElement addPhoneNumber;
	@FindBy(id = "Address_FaxNumber")
	private WebElement addFaxNumber;
	@FindBy(css = "[value='Save']")
	private WebElement saveButton;
	@FindBy(css = "[value='Edit']")
	private WebElement editAddressbutton;
	@FindBy(css = "[value='Delete']")
	private WebElement deleteAddressbutton;

	public WebElement getEditAddressbutton() {
		return editAddressbutton;
	}

	public WebElement getDeleteAddressbutton() {
		return deleteAddressbutton;
	}

	public WebElement getAddAddressCity() {
		return addAddressCity;
	}

	public WebElement getAddAddress1() {
		return addAddress1;
	}

	public WebElement getAddAddress2() {
		return addAddress2;
	}

	public WebElement getAddzipcode() {
		return addzipcode;
	}

	public WebElement getAddPhoneNumber() {
		return addPhoneNumber;
	}

	public WebElement getAddFaxNumber() {
		return addFaxNumber;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getAddnewaddressbutton() {
		return addnewaddressbutton;
	}

	public WebElement getAddFNinAddress() {
		return addFNinAddress;
	}

	public WebElement getAddLNinAddress() {
		return addLNinAddress;
	}

	public WebElement getAddEmailinAddress() {
		return addEmailinAddress;
	}

	public WebElement getAddcompanyName() {
		return addcompanyName;
	}

	public WebElement getAddCountryName() {
		return addCountryName;
	}

}
