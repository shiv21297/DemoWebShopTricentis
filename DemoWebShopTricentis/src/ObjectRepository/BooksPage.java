package ObjectRepository;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class BooksPage {

		public BooksPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		@FindBy(linkText = "Computing and Internet")
		private WebElement computersandInternetBookslink;
		@FindBy(linkText = "Fiction")
		private WebElement fictionBookslink;
		@FindBy(css = "[value='Add to compare list']")
		private WebElement addtocompareList;

		public WebElement getComputersandInternetBookslink() {
			return computersandInternetBookslink;
		}

		public WebElement getFictionBookslink() {
			return fictionBookslink;
		}
		public WebElement getAddtocompareList() {
			return addtocompareList;
		}

	}

