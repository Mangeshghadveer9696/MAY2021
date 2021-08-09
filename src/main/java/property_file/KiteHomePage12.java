package property_file;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage12 {

	@FindBy(xpath = "//span[@class='user-id']")
	private WebElement UserName;

	@FindBy(xpath = "(//ul[@class='list-flat dropdown-nav-list']/li)[9]")
	private WebElement LogOut;

	public KiteHomePage12(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String UserValidation(String user) {
		String Actual = UserName.getText();
		return Actual;
	}

	public void ClickUser() {
		UserName.click();
	}

	public void LogoutKite() {
		LogOut.click();
	}

}
