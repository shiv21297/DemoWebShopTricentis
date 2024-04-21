package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(linkText = "Register")
	private WebElement registerlink;
	@FindBy(linkText = "Log in")
	private WebElement loginlink;
	@FindBy(linkText = "Log out")
	private WebElement logoutlink;
	@FindBy(linkText = "Shopping cart")
	private WebElement shoppingcartlink;
	@FindBy(linkText = "Wishlist")
	private WebElement wishlistlink;
	@FindBy(css = "[value='Add to cart']")
	private WebElement AddtoCartlink;
	@FindBy(linkText = "shivashiv2102@gmail.com")
	private WebElement shivashiv2102gmaillink;
	@FindBy(partialLinkText = "Books")
	private WebElement bookslink;
	@FindBy(partialLinkText = "Computers")
	private WebElement computerslink;
	@FindBy(partialLinkText = "Electronics")
	private WebElement electronicslink;
	@FindBy(partialLinkText = "Apparel & Shoes")
	private WebElement apparelnshoeslink;
	@FindBy(partialLinkText = "Digital downloads")
	private WebElement digitaldownloadslink;
	@FindBy(partialLinkText = "Jewelry")
	private WebElement jewelrylink;
	@FindBy(partialLinkText = "Gift Cards")
	private WebElement giftcardslink;

	public WebElement getRegisterlink() {
		return registerlink;
	}

	public WebElement getLoginlink() {
		return loginlink;
	}

	public WebElement getShoppingcartlink() {
		return shoppingcartlink;
	}

	public WebElement getWishlistlink() {
		return wishlistlink;
	}

	public WebElement getAddtoCartlink() {
		return AddtoCartlink;
	}

	public WebElement getShivashiv2102gmaillink() {
		return shivashiv2102gmaillink;
	}

	public WebElement getBookslink() {
		return bookslink;
	}

	public WebElement getComputerslink() {
		return computerslink;
	}

	public WebElement getElectronicslink() {
		return electronicslink;
	}

	public WebElement getApparelnshoeslink() {
		return apparelnshoeslink;
	}

	public WebElement getDigitaldownloadslink() {
		return digitaldownloadslink;
	}

	public WebElement getJewelrylink() {
		return jewelrylink;
	}

	public WebElement getGiftcardslink() {
		return giftcardslink;
	}

	public WebElement getLogoutlink() {
		return logoutlink;
	}
}