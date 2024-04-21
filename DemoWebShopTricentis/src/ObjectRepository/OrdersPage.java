package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrdersPage {

	public OrdersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "[onclick=\"setLocation('/orderdetails/1684985')\"]")
	private WebElement orderDetailslink;
	@FindBy(linkText = "PDF Invoice")
	private WebElement pdfInvicedownload;

	public WebElement getOrderDetailslink() {
		return orderDetailslink;
	}

	public WebElement getPdfinvicedownload() {
		return pdfInvicedownload;
	}

}
