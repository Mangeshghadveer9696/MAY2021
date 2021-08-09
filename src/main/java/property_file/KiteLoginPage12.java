package property_file;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class KiteLoginPage12 {

	@FindBy(xpath = "//input[@id='userid']") private WebElement Userid;
	
	@FindBy(xpath = "//input[@id='password']") private WebElement Password;
	
	@FindBy(xpath = "//button[@type='submit']") private WebElement LogginButton;
	
//	@FindBy(xpath = "//span[contains(text(),'User ID should be')]") private WebElement UserIdErrorMsg;
//	
//	@FindBy (xpath = "//span[contains(text(),'Password should be ')]") private WebElement PasswordErrorMsg;
	 
	public KiteLoginPage12(WebDriver driver) {

		PageFactory.initElements(driver, this);
		
	}
	
	public void EnterIntoUserId(String UserName)
	{
		Userid.sendKeys(UserName);
		Reporter.log("User Name is successfully entered",true);
	}
	public void EnterIntoPassword(String Pwd)
	{
		Password.sendKeys(Pwd);
		Reporter.log("Password is successfully entered",true);

	}
	
	
	public void ClickOnLogin()
	{
		LogginButton.click();
	}
	
//	public String ValidateUserErrorMsg()
//	
//	
//	{
//		String actualError = UserIdErrorMsg.getText();
//		
//		return ValidateUserErrorMsg();
//	}
	
	
	
	
}
