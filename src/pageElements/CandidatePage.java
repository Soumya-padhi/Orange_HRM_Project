package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CandidatePage {

		
      WebDriver driver;
		
		public CandidatePage (WebDriver driverhere) {
			this.driver = driverhere;
			PageFactory.initElements(driver, this);
			
		}
		
		
 @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")WebElement JobTitleDropDown;
	
 @FindBy(xpath="//*[text()='Account Assistant']")WebElement JobTitle_Val1;
 
 @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i")WebElement Vacancy;
 
 @FindBy(xpath="//*[text()='Associate IT Manager'][1]") WebElement Vacancy_Val1;
 
 @FindBy(xpath="/*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i") WebElement HiringManager;
 
 @FindBy(xpath="//*[text()='Odis Adalwin']") WebElement HiringManger_Val1;
 
 
 @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[2]/i") WebElement Status;
 
 @FindBy(xpath="//*[text()='Application Initiated'][1]") WebElement Status_Val1;
 
 @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div/input") WebElement CandidateName;

 @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div") WebElement Candidate_Val1;
 
// @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[3]/div/div[2]/div/div/i") WebElement DatePicker_From;
 
 @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[3]/div/div[2]/div/div/i") WebElement From_Value1;
 
 @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[4]/div/div[2]/div/div/input") WebElement To_Value1;
 
 @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[3]/div/div/div/div[2]/div/div/div[2]/i") WebElement Method_Of_App;
 
 @FindBy(xpath="//*[text()='Manual']" ) WebElement Method_V1;
 @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[4]/button[2]") WebElement Searchbutton;
 
 public VacanciesPage Candidate() {
	 JobTitleDropDown.click();
	 JobTitle_Val1.click();
 
	 Vacancy.click();
	 Vacancy_Val1.click();
 
	 HiringManager.click();
	 HiringManger_Val1.click();
 
	 Status.click();
	 Status_Val1.click();
	 
	 Candidate_Val1.sendKeys("Soumya Padhi");
	 
	 From_Value1.sendKeys("2022-12-31");
	 
	 To_Value1.sendKeys("2023-11-30");
	 
	 Method_Of_App.click();
	 Method_V1.click();
	 
	 
	 Searchbutton.click();
	 
	 VacanciesPage VC = new VacanciesPage(driver);
	 return VC;
	 
	 
	 
 }
 
     
 
 

}









