package pageElements;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VacanciesPage {

			
		 WebDriver driver;
			
			public VacanciesPage (WebDriver driverhere) {
				this.driver = driverhere;
				PageFactory.initElements(driver, this);
				
			}
			
 @FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]") WebElement JobTitle_V;

 @FindBy(xpath="//*[text()='CEO']")WebElement JobTitle_V1;
 
 @FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]") WebElement VacancyDrop;
 
 @FindBy(xpath="//*[text()='Senior QA Lead'][1]") WebElement Vacancy_V1;
 
 @FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]") WebElement Hiring_M;
 
 @FindBy(xpath="//*[text()='Paul Collings'][1]") WebElement Hiring_M1;
 
 @FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[4]") WebElement Status_C;
 
 @FindBy(xpath="//*[text()='Active'][1]") WebElement Status_V;
 
 @FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']") WebElement Search_V;
 
 public CloseBrowser vacancies(){
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	 JobTitle_V.click(); 
	 JobTitle_V1.click();
	 VacancyDrop.click();
	 Vacancy_V1.click();
	 Hiring_M.click();
	 Hiring_M1.click();
	 Status_C.click();
	 Status_V.click();
	 Search_V.click();
	 
	CloseBrowser CB = new CloseBrowser(driver);
		return CB;
				
			}
			
			
						
		
	}


