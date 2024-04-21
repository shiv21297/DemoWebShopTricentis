package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class ApparelsAndShoesPage {

		public ApparelsAndShoesPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		@FindBy(id = "products-orderby")
		private WebElement sortBy;
		@FindBy(id = "products-pagesize")
		private WebElement display;
		@FindBy(id = "products-viewmode")
		private WebElement viewas;
		@FindBy(linkText = "Blue Jeans")
		private WebElement BlueJeanslink;
		@FindBy(linkText = "Casual Golf Belt")
		private WebElement CasualGolfBeltlink;

		@FindBy(xpath = "(//input[@value='Add to cart'])[1]")
		private WebElement bluejeanAddToCart;
		@FindBy(xpath = "(//input[@value='Add to cart'])[2]")
		private WebElement casualgolfbeltAddToCart;

		public WebElement getSortBy() {
			return sortBy;
		}

		public WebElement getDisplay() {
			return display;
		}

		public WebElement getViewas() {
			return viewas;
		}

		public WebElement getBlueJeanslink() {
			return BlueJeanslink;
		}

		public WebElement getCasualGolfBeltlink() {
			return CasualGolfBeltlink;
		}

		public WebElement getBluejeanAddToCart() {
			return bluejeanAddToCart;
		}

		public WebElement getCasualgolfbeltAddToCart() {
			return casualgolfbeltAddToCart;
		}
	}

