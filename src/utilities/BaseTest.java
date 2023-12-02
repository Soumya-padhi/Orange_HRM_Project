
package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageElements.LandingPage;

public class BaseTest {
	
	WebDriver driver;
	
	public WebDriver initializebrowsers() {
		 driver = new ChromeDriver();
		 return driver;
	}
	
	public LandingPage LaunchApplication() throws Exception {
		driver = initializebrowsers();
		LandingPage lp = new LandingPage(driver);
		lp.GoTo();
		return lp;
		
	}

}
