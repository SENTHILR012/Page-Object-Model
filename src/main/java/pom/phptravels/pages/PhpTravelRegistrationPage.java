package pom.phptravels.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;


public class PhpTravelRegistrationPage extends GenericWrappers{
	
	public PhpTravelRegistrationPage(RemoteWebDriver driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		this.test=test;
	}
	
	public PhpTravelRegistrationPage enterFirstName(String firstname) {
		
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.FirstName.Xpath"), firstname);
		
		return this;
	}
	
	public PhpTravelRegistrationPage enterLastName(String lastname) {
		
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.LastName.Xpath"), lastname);
		
		return this;
	}
	
	public PhpTravelRegistrationPage enterEmailid(String emailid) {
		
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.Emailid.Xpath"), emailid);
		
		return this;
	}
	
	public PhpTravelRegistrationPage clickonCountrycode(String countrycode) {
		
		clickByXpath(prop.getProperty("PhpTravelRegistrationPage.CountryCode.Xpath"));
		
		return this;
	}
	
	public PhpTravelRegistrationPage enterPhoneNumber(String phonenumber) {
		
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.PhoneNumber.Xpath"), phonenumber);
		
		return this;
	}
	
	public PhpTravelRegistrationPage enterCompnayName(String companyname) {
		
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.CompnayName.Xpath"), companyname);
		
		return this;
	}
	
	public PhpTravelRegistrationPage enterStreetAddree(String streetone) {
		
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.StreetAddree.Xpath"), streetone);
		
		return this;
	}
	
	public PhpTravelRegistrationPage enterStreetAddres(String streettwo) {
		
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.StreetAddres.Xpath"), streettwo);
		
		return this;
	}
	
	public PhpTravelRegistrationPage enterCity(String city) {
		
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.City.Xpath"), city);
		
		return this;
	}
	
	public PhpTravelRegistrationPage enterState(String State) {
		
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.State.Xpath"), State);
		
		return this;
	}
	
	public PhpTravelRegistrationPage enterPincode(String pincode) {
		
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.Pincode.Xpath"), pincode);
		
		return this;
	}

	public PhpTravelRegistrationPage selectFindus(String findus) {
		
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.Findus.Xpath"), findus);
		
		return this;
	}
	
	public PhpTravelRegistrationPage enterMoibleNumber(String mobilenumber) {
		
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.MoibleNumber.Xpath"), mobilenumber);
		
		return this;
	}
	
	public PhpTravelRegistrationPage enterPassword(String password) {
		
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.Password.Xpath"), password);
		
		return this;
	}
	
	public PhpTravelRegistrationPage enterConfPassword(String confpassword) {
		
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.ConfPassword.Xpath"), confpassword);
		
		return this;
	}
	
}
