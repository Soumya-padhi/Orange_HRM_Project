package pageElements;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driverhere) {
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}
	
	public void GoTo() throws IOException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	WebElement enterusername;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	WebElement enterpassword;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitbutton;

	public RecruitmentPage enterlogindetails(String username, String password) throws InterruptedException {
		Thread.sleep(4000);
		enterusername.sendKeys(username);
		enterpassword.sendKeys(password);
		submitbutton.click();
		RecruitmentPage Rp = new RecruitmentPage(driver);
		return Rp;
		
	}
      
		

	}


