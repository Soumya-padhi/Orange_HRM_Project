package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage {

		WebDriver driver;
		
		public RecruitmentPage (WebDriver driverhere) {
			this.driver = driverhere;
			PageFactory.initElements(driver, this);
			
		}
		
	
		@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a") WebElement Recruitment;
		
		//@FindBy(xpath="//span[text()='Recruitment'][1]")  WebElement Recruitment;
		
		public CandidatePage clickOnRecruitment() {
			Recruitment.click();
			CandidatePage Cp = new CandidatePage(driver);
			return Cp;
		}
	}



