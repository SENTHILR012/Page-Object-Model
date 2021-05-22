package pom.facebook.page;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FaceBookSignUpPage extends GenericWrappers{
	
	public FaceBookSignUpPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	
	public FaceBookSignUpPage enterFirstName(String firstname) {
		enterByXpath(prop.getProperty("FaceBookSignUpPage.FirstName.XPath"), firstname);
		return this;
	}
	
	public FaceBookSignUpPage enterLastName(String lastname) {
		enterByXpath(prop.getProperty("FaceBookSignUpPage.LastName.XPath"), lastname);
		return this;
	}
	
	public FaceBookSignUpPage enterEmailId(String emailid) {
		enterByXpath(prop.getProperty("FaceBookSignUpPage.Email.XPath"), emailid);
		return this;
	}
	
	public FaceBookSignUpPage enterConfEmailId(String confemailid)
	{
		enterByXpath(prop.getProperty("FaceBookSignUpPage.ConfEmail.Xpath"), confemailid);
		
		return this;
	}
	
	
	public FaceBookSignUpPage enterPassword(String password) {
		enterByXpath(prop.getProperty("FaceBookSignUpPage.Password.Xpath"), password);
		return this;
	}
	
	public FaceBookSignUpPage selectDay(String date) {
		selectVisibleTextByXpath(prop.getProperty("FaceBookSignUpPage.DobDate.Xpath"), date);
		return this;
	}
	
	
	public FaceBookSignUpPage selectMonth(String month) {
		selectVisibleTextByXpath(prop.getProperty("FaceBookSignUpPage.DobMonth.Xpath"), month);
		return this;
	}
	
	public FaceBookSignUpPage selectYear(String year) {
		selectVisibleTextByXpath(prop.getProperty("FaceBookSignUpPage.DobYear.Xpath"), year);
		return this;
	}
	
	
	public FaceBookSignUpPage clickOnFemale() {
		clickByXpath(prop.getProperty("FaceBookSignUpPage.ClickOnFemale.Xpath"));
		return this;
	}
	
	public FaceBookSignUpPage clickOnMale() {
		clickByXpath(prop.getProperty("FaceBookSignUpPage.ClickOnMale.Xpath"));
		return this;
	}
	
	
	public FaceBookSignUpPage clickOnCustom() {
		clickByXpath(prop.getProperty("FaceBookSignUpPage.ClickOnCustom.Xpath"));
		return this;
	}
	
	public FaceBookSignUpPage selectPronoun(String value) {
		selectVisibleTextByXpath(prop.getProperty("FaceBookSignUpPage.SelectPronoun.Xpath"), value);
		return this;
	}
	
	
	public FaceBookSignUpPage enterCustomGender(String gender) {
		enterByXpath(prop.getProperty("FaceBookSignUpPage.CustomGender.Xpath"), gender);
		return this;
	}
	
	
	public FaceBookSignUpPage clickOnSUbmit() {
		clickByXpath(prop.getProperty("FaceBookSignUpPage.ClickOnSUbmit.Xpath"));
		return this;
	}
	

}
