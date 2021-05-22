package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FtrRegistrationPage extends GenericWrappers{
	
	public FtrRegistrationPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public FtrRegistrationPage WaitTime() {
		
		waitProperty(5000);
		
		return this;
	}
	
	
	public FtrRegistrationPage enterFtrUserUserid(String userid) {
		
		enterByXpath(prop.getProperty("FtrRegistrationPage.FtrUserId.Xpath"), userid);
		
		return this;
	}
	
	public FtrRegistrationPage enterFtrUserPassword(String password) {
		
		enterByXpath(prop.getProperty("FtrRegistrationPage.FtrPassword.Xpath"), password);
		
		return this;
	}
	
	public FtrRegistrationPage enterFtrUserCofPass(String confpassword) {
		
		enterByXpath(prop.getProperty("FtrRegistrationPage.FtrConfirmPassword.Xpath"), confpassword);
		
		return this;
	}
	
	public FtrRegistrationPage selectFtrSecuQuestion(String secuques)
	{
		
		selectVisibleTextByXpath(prop.getProperty("FtrRegistrationPage.FtrSecurityQuestion.Xpath"), secuques);
		
		return this;
	}
	
	public FtrRegistrationPage enterFtrSecuAnswer(String answer) {
		
		enterByXpath(prop.getProperty("FtrRegistrationPage.SecurityAnswer.Xpath"), answer);
		
		return this;
	}
	
	public FtrRegistrationPage enterFtrDateOfBirth(String date) {
		
		enterByXpath(prop.getProperty("FtrRegistrationPage.FtrDateOfBirth.Xpath"),date);
		
		return this;
	}
	
	
	public FtrRegistrationPage moveToNextField()
	{
		
		pageDown(prop.getProperty("FtrRegistrationPage.FtrmoveToNextField.Xpath"), "tab");
		
		return this;
	}
	
	public FtrRegistrationPage clickOnFtrGenderMale() {
		
		clickByXpath(prop.getProperty("FtrRegistrationPage.FtrGenderMale.Xpath"));
		
		return this;
	}
	
	public FtrRegistrationPage clickOnFtrGenderFemale() {
		
		clickByXpath(prop.getProperty("FtrRegistrationPage.FtrGenderFemale.Xpath"));
		
		return this;
	}
	
	public FtrRegistrationPage clickOnFtrGenderTrans() {
		
		clickByXpath(prop.getProperty("FtrRegistrationPage.FtrGenderTrans.Xpath"));
		
		return this;
	}
	
	public FtrRegistrationPage clickOnFtrInsti() {
		
		clickByXpath(prop.getProperty("FtrRegistrationPage.FtrInsti.Xpath"));
		
		return this;
	}
	
	public FtrRegistrationPage clickOnFtrMarriedStatus() {
		
		clickByXpath(prop.getProperty("FtrRegistrationPage.FtrMarriedStatus.Xpath"));
		
		return this;
	}
	
	public FtrRegistrationPage clickOnFtrUnmarriedStatus() {
		
		clickByXpath(prop.getProperty("FtrRegistrationPage.FtrUnmarriedStatus.Xpath"));
		
		return this;
	}
	
	public FtrRegistrationPage enterFtrEmailid(String emailid) {
		
		enterByXpath(prop.getProperty("FtrRegistrationPage.FtrEmailid.Xpath"), emailid);
		
		return this;
	}
	
	public FtrRegistrationPage selectFtrOccupation(String occupation) {
		
		selectVisibleTextByXpath(prop.getProperty("FtrRegistrationPage.FtrOccupation.Xpath"), occupation);
		
		return this;
	}
	
	public FtrRegistrationPage enterFtrFirstName(String firstname) {
		
		enterByXpath(prop.getProperty("FtrRegistrationPage.FtrFirstName.Xpath"), firstname);
		
		return this;
	}
	
	public FtrRegistrationPage enterFtrMiddleName(String middlename) {
		
		enterByXpath(prop.getProperty("FtrRegistrationPage.FtrMiddleName.Xpath"), middlename);
		
		return this;
	}
	
	public FtrRegistrationPage enterFtrLastName(String lastname) {
		
		enterByXpath(prop.getProperty("FtrRegistrationPage.FtrLastName.Xpath"), lastname);
		
		return this;
	}
	
	
	public FtrRegistrationPage selectNationality(String nationality) {
		
		selectVisibleTextByXpath(prop.getProperty("FtrRegistrationPage.Nationality.Xpath"), nationality);
		
		return this;
	}
	
	public FtrRegistrationPage enterFtrFlatNumber(String flatnumber) {
		
		enterByXpath(prop.getProperty("FtrRegistrationPage.FtrFlatNumber.Xpath"), flatnumber);
		
		return this;
	}
	
	public FtrRegistrationPage enterFtrSteetLane(String streetlane) {
		
		enterByXpath(prop.getProperty("FtrRegistrationPage.FtrSteetLane.Xpath"), streetlane);
		
		return this;
	}
	
	public FtrRegistrationPage enterFtrArea(String area) {
		
		enterByXpath(prop.getProperty("FtrRegistrationPage.FtrArea.Xpath"), area);
		
		return this;
	}
	
	public FtrRegistrationPage selectFtrCountry(String country) {
		
		selectVisibleTextByXpath(prop.getProperty("FtrRegistrationPage.FtrCountry.Xpath"), country);
		
		return this;
	}
	
	public FtrRegistrationPage enterFtrMobileNumber(String mobilenumber) {
		
		enterByXpath(prop.getProperty("FtrRegistrationPage.FtrMobileNumber.Xpath"), mobilenumber);
		
		return this;
	}
	
	public FtrRegistrationPage enterFtrPincode(String pincode) {
		
		enterByXpath(prop.getProperty("FtrRegistrationPage.FtrPincode.Xpath"), pincode);
		
		return this;
	}
	
	public FtrRegistrationPage MoveTocity() {
		
		pageDown(prop.getProperty("FtrRegistrationPage.FtrCity.Xpath"), "tab");
		
		return this;
	}
	
	public FtrRegistrationPage MoveToPost() {
		
		pageDown(prop.getProperty("FtrRegistrationPage.FtrState.Xpath"), "tab");
		
		return this;
	}
	
	public FtrRegistrationPage selectFtrPostOffice(String postoffice) {
		
		selectVisibleTextByXpath(prop.getProperty("FtrRegistrationPage.FtrPostOffice.Xpath"), postoffice);
		return this;
	}
	
	public FtrRegistrationPage clickOnFtrSameResidential() {
		
		clickByXpath(prop.getProperty("FtrRegistrationPage.FtrSameResidential.Xpath"));
		
		return this;
	}
	
	public FtrRegistrationPage MoveToDiffRes() {
		
		pageDown(prop.getProperty("FtrRegistrationPage.MoveToDiffRes.Xpath"), "tab");
		
		return this;
	}
	
	public FtrRegistrationPage clickOnFtrdifferentResidential() {
		
		clickByXpath(prop.getProperty("FtrRegistrationPage.FtrdifferentResidential.Xpath"));
		
		return this;
	}
	
	
	public FtrRegistrationPage enterFtroffFlatnum(String offflatnum) {
		
		enterByXpath(prop.getProperty("FtrRegistrationPage.FtroffFlatnum.Xpath"), offflatnum);
		
		return this;
		
	}
	
	public FtrRegistrationPage enterFtroffStreetLane(String offstreet) {
		
		enterByXpath(prop.getProperty("FtrRegistrationPage.FtroffStreetLane.Xpath"), offstreet);
		
		return this;
	}
	
	public FtrRegistrationPage enterFtrOffArea(String offarea) 
	{
		enterByXpath(prop.getProperty("FtrRegistrationPage.FtrOffArea.Xpath"),offarea);
		
		return this;
	}
	
	public FtrRegistrationPage selectFtrOfficeCountry(String country) {
		
		selectVisibleTextByXpath(prop.getProperty("FtrRegistrationPage.FtrOfficeCountry.Xpath"), country);
		
		return this;
	}
	
	public FtrRegistrationPage enterFrtOffMobileNumber(String offmobilenum) {
		
		enterByXpath(prop.getProperty("FtrRegistrationPage.FrtOffMobileNumber.Xpath"), offmobilenum);
		
		return this;
	}
	
	public FtrRegistrationPage enterFrtOffPincode(String pincode) {
		
		enterByXpath(prop.getProperty("FtrRegistrationPage.FrtOffPincode.Xpath"), pincode);
		
		return this;
	}
	
public FtrRegistrationPage MoveToPostOffice() {
		
		pageDown(prop.getProperty("FtrRegistrationPage.FrtOffState.Xpath"), "tab");
		
		return this;
	}
	
	public FtrRegistrationPage selectFtroffPostOffice(String offpostoffice) {
		
		selectVisibleTextByXpath(prop.getProperty("FtrRegistrationPage.FtroffPostOffice.Xpath"), offpostoffice);
		return this;
	}
	
}


