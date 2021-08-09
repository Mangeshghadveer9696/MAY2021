package property_file;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class KitePinPage12 {
	@FindBy(xpath ="//input[@type='password']") private WebElement Pin;
	
	@FindBy(xpath = "//button[@type='submit']") private WebElement Continue;
	
	public KitePinPage12(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void EnterIntoPin(String pin)
	{
		Pin.sendKeys(pin);
		Reporter.log("Pin entered successfully",true);
		
	}
	
	public void ClickOnContinue()
	{
		Continue.click();
	}

}
