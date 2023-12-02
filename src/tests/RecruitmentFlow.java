package tests;

import org.testng.annotations.Test;

import pageElements.CandidatePage;
import pageElements.CloseBrowser;
import pageElements.LandingPage;
import pageElements.RecruitmentPage;
import pageElements.VacanciesPage;
import utilities.BaseTest;
import utilities.ExcelUtility1;

public class RecruitmentFlow extends BaseTest{
	
	LandingPage lp;
	RecruitmentPage Rp;
	CandidatePage Cp;
	VacanciesPage VC;
	CloseBrowser CB;
	
	@Test
	public void Recruitmentflow() throws Exception {
	   lp=LaunchApplication();
	   
	   ExcelUtility1 xs = new ExcelUtility1();
		
		String username = xs.Get_Username(1, 0).toString();
		String password = xs.Get_password(1, 1).toString();
		Rp=lp.enterlogindetails(username,password);
		Cp=Rp.clickOnRecruitment();
		 VC = Cp.Candidate();
		 CB=VC.Vacancies();
		 CB.BrowserExit();
		 

}
}
