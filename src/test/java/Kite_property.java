

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



import property_file.KiteHomePage12;
import property_file.KiteLoginPage12;
import property_file.KitePinPage12;



//@Listeners(ListenerStudy.Listener.class)
public class Kite_property extends Base_Property {
	KiteLoginPage12 page1;
	KitePinPage12 page2;
	KiteHomePage12 page3;
	String TCID = "9696";

	@BeforeClass
	public void BrowserInvoke() throws IOException {
		BrowserInit();
		page1 = new KiteLoginPage12(driver);
		page2 = new KitePinPage12(driver);
		page3 = new KiteHomePage12(driver);
	}

	@BeforeMethod
	public void LoginTokite() throws IOException, InterruptedException {
		page1.EnterIntoUserId(Utility_prop.FetDataFromPropertyFile("UID"));

		page1.EnterIntoPassword(Utility_prop.FetDataFromPropertyFile("PWD"));

		page1.ClickOnLogin();
		Thread.sleep(4000);
		page2.EnterIntoPin(Utility_prop.FetDataFromPropertyFile("PIN"));
		page2.ClickOnContinue();

	}

	@Test
	public void UserIdvalidation() throws IOException {
		String actual = page3.UserValidation(null);

		String expected = Utility_prop.FetDataFromPropertyFile("PWD");

		Assert.assertEquals(actual, expected);

	}

	@AfterMethod

	public void LogOut(ITestResult result) throws IOException {

		if (result.getStatus() == ITestResult.FAILURE) {
			CaptureSCR(driver, TCID);
		}

		page3.ClickUser();
		page3.LogoutKite();
	}

	@AfterClass
	public void CloseBrowser() {
		driver.close();
	}
}
