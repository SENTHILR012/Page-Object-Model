package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{
	
	public RegistrationPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public RegistrationPage waittime() {
		
		waitProperty(5000);
		
		return this;
	}
	
	public RegistrationPage enterUserName(String username) {
		enterByXpath(prop.getProperty("RegistrationPage.UserName.Xpath"), username);
		return this;
	}
	
	public RegistrationPage enterPassWord(String password) {
		
		enterByXpath(prop.getProperty("RegistrationPage.PassWord.Xpath"), password);
		
		return this;
	}
	
	public RegistrationPage enterConfPassWord(String cnfpassword) {
		
		enterByXpath(prop.getProperty("RegistrationPage.ConfPassWord.Xpath"), cnfpassword);
		return this;
	}
	
	public RegistrationPage clickOnLanguage() {
		
		clickByXpath(prop.getProperty("RegistrationPage.ClickLanguage.Xpath"));
		
		return this;
	}
	
	public RegistrationPage clickOnLanguageOption() {
		clickByXpath(prop.getProperty("RegistrationPage.ClickLanguageOption.Xpath"));
		return this;
	}
	

	public RegistrationPage clickOnSecurityQuestion() {
		clickByXpath(prop.getProperty("RegistrationPage.ClickSecurityQuestion.Xpath"));
		return this;
	}
	
	public RegistrationPage clickOnSecurityOption(String option) {
		String xpath = replaceString(prop.getProperty("RegistrationPage.ClickOnSecurityOption.Xpath"), option);
		clickByXpath(xpath);
		
		return this;
	}
	
	public RegistrationPage enterSecurityAnswer(String answer) {
		
		enterByXpath(prop.getProperty("RegistrationPage.SecurityAnswer.Xpath"), answer);
		return this;
	}
	
	public RegistrationPage clickOnContinuebutton() {
		
		clickByXpath(prop.getProperty("RegistrationPage.ClickContinuebutton.Xpath"));
		
		return this;
	}
	
	public RegistrationPage enterFirstName(String firstname) {
		enterByXpath(prop.getProperty("RegistrationPage.FirstName.Xpath"), firstname);
		return this;
	}
	
	public RegistrationPage enterMiddleName(String middlename) {
		
		enterByXpath(prop.getProperty("RegistrationPage.MiddleName.Xpath"), middlename);
		return this;
	}
	
	public RegistrationPage enterLastName(String lastname) {
		
		enterByXpath(prop.getProperty("RegistrationPage.LastName.Xpath"), lastname);
		return this;
	}
	
	public RegistrationPage clickOnSelectOccupation() {
		
		clickByXpath(prop.getProperty("RegistrationPage.SelectOccupation.Xpath"));
		return this;
	}
	
	
	public RegistrationPage SelectOccupationdetail(String occupation) {
		
		clickByXpath(prop.getProperty("RegistrationPage.Occupationdetail.Xpath"));
		return this;
	}
	
	public RegistrationPage enterDateofBirth(String Dob) {
		
		enterByXpath(prop.getProperty("RegistrationPage.DateofBirth.Xpath"),Dob);
		
		return this;
	}
	
	public RegistrationPage MoveNextField() {
		
		pageDown(prop.getProperty("RegistrationPage.MoveToNextField.Xpath="), "tab");
		
		return this;
	}
	
	
	public RegistrationPage clickOnMarried() {
		
		clickByXpath(prop.getProperty("RegistrationPage.ClickMarried.Xpath"));
		return this;
	}
	
	public RegistrationPage clickOnUnMarried() {
		
		clickByXpath(prop.getProperty("RegistrationPage.ClickUnMarried.Xpath"));
		
		return this;
	}
	
	public RegistrationPage SelectCountry(String country) {
		
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.SelectCountry.Xpath"), country);
		
		return this;
	}
	
	public RegistrationPage clickOnGender(String gender) {
		
		clickByXpath(prop.getProperty("RegistrationPage.ClickOnGender.Xpath"));
		
		return this;
	}
	
	public RegistrationPage enterEmailID(String email) {
		
		enterByXpath(prop.getProperty("RegistrationPage.EmailID.Xpath"), email);
		
		return this;
	}
	
	public RegistrationPage enterMoibleNumber(String mobilenumber) {
		
		enterByXpath(prop.getProperty("RegistrationPage.MoibleNumber.Xpath"), mobilenumber);
		
		return this;
	}
	
	public RegistrationPage selectNationality(String nationality) {
		
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.SelectNationality.Xpath"), nationality);
		
		return this;
	}
	
	public RegistrationPage clickOnContinue() {
		
		clickByXpath(prop.getProperty("RegistrationPage.ClickContinue.Xpath"));
		
		return this;
	}
	
	public RegistrationPage enterFlatNumber(String floatnumber) {
		
		enterByXpath(prop.getProperty("RegistrationPage.FlatNumber.Xpath"), floatnumber);
		
		return this;
	}
	
	public RegistrationPage enterStreetName(String streetname) {
		
		enterByXpath(prop.getProperty("RegistrationPage.StreetName.Xpath"), streetname);
		
		return this;
	}
	
	public RegistrationPage enterAreaName(String areaname) {
		
		enterByXpath(prop.getProperty("RegistrationPage.AreaName.Xpath"), areaname);
		
		return this;
	}
	
	public RegistrationPage enterPinCode(String pincode) {
		
		enterByXpath(prop.getProperty("RegistrationPage.PinCode.Xpath"), pincode);
		
		return this;
	}
	
	public RegistrationPage movetonextfield() {
		
		pageDown(prop.getProperty("RegistrationPage.MoveTonextTield.Xpath"), "tab");
		
		return this;
		
	}
	
	public RegistrationPage selectCity(String city) {
		
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.SelectCity.Xpath"), city);
		
		return this;
	}
	

	
	public RegistrationPage selectPostOffice(String postoffice) {
		
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.SelectPostOffice.Xpath"), postoffice);
		
		return this;
	}
	
	public RegistrationPage eneterHomePhoneNumber(String homenumber) {
		
		enterByXpath(prop.getProperty("RegistrationPage.HomePhoneNumber.Xpath"), homenumber);
		
		return this;
	}
	
	public RegistrationPage clickOnResidance(String office) {
		
		clickByXpath(prop.getProperty("RegistrationPage.ClickResidance.Xpath"));
		
		return this;
	}
	
	public RegistrationPage enterOfficeFlatNumbers(String flatnumber) {
		
		enterByXpath(prop.getProperty("RegistrationPage.OfficeFlatNumbers.Xpath"), flatnumber);
		
		return this;
	}
	
	public RegistrationPage enterOfficeStreet(String officestreet) {
		
		enterByXpath(prop.getProperty("RegistrationPage.OfficeStreet.Xpath"), officestreet);
		
		return this;
	}
	
	public RegistrationPage enterOfficeArea(String officearea) {
		
		enterByXpath(prop.getProperty("RegistrationPage.OfficeArea.Xpath"), officearea);
		
		return this;
	}
	
	public  RegistrationPage clickOnOfficeCountry() {
		
		clickByXpath(prop.getProperty("RegistrationPage.OfficeCountry.Xpath"));
		
		return this;
	}
	
	public  RegistrationPage clickOnOfficeCountryoption(String officecountry) {
		
		clickByXpath(prop.getProperty("RegistrationPage.OfficeCountryoption.Xpath"));
		
		return this;
	}
	
	public RegistrationPage enterOfficePincode(String officepincode) {
		
		enterByXpath(prop.getProperty("RegistrationPage.OfficePincode.Xpath"), officepincode);
		
		return this;
	}
	
	public RegistrationPage selectOfficeCity(String cityname)
	{
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.OfficeCity.Xpath"), cityname);
		
		return this;
	}
	
	public RegistrationPage selectOfficePostOffice(String postoffice)
	{
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.OfficePostOffice.Xpath"), postoffice);
		
		return this;
	}
	
	public RegistrationPage enterOfficeMobileNumber(String officephonenumber) {
		
		enterByXpath(prop.getProperty("RegistrationPage.OfficeMobileNumber.Xpath"), officephonenumber);
		
		return this;
	}
	
	 
}
