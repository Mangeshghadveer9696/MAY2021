

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Base_Property {

	public WebDriver driver;

	public void BrowserInit() throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\software testing\\selenium\\chrome driver\\chromedriver 1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Utility_prop.FetDataFromPropertyFile("URL"));
           
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	public void CaptureSCR(WebDriver driver,String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("E:\\software testing\\screenshot\\Kiteimg"+TCID+".png");
		
		org.openqa.selenium.io.FileHandler.copy(src, dest);
	}

}
