package pageElements;

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
			
 @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i") WebElement JobTitle_V;

 @FindBy(xpath="//*[text()='CEO']")WebElement JobTitle_V1;
 
 @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i") WebElement VacancyDrop;
 
 @FindBy(xpath="//*[text()='Senior QA Lead'][1]") WebElement Vacancy_V1;
 
 @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i") WebElement Hiring_M;
 
 @FindBy(xpath="//*[text()='Paul Collings'][1]") WebElement Hiring_M1;
 
 @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[2]/i") WebElement Status_C;
 
 @FindBy(xpath="//*[text()='Active'][1]") WebElement Status_V;
 
 @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]") WebElement Search_V;
 public CloseBrowser Vacancies(){
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


