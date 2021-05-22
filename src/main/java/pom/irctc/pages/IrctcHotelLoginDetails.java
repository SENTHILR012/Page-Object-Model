package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IrctcHotelLoginDetails extends GenericWrappers{
	
	public IrctcHotelLoginDetails(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public IrctcHotelLoginDetails enterEmailId(String emailid) {
		
		enterByXpath(prop.getProperty("IrctcHotelLoginDetails.EmailId.Xapth"), emailid);
		
		return this;
		
	}
	
	public IrctcHotelLoginDetails enterMobileNumber(String number) {
		
		enterByXpath(prop.getProperty("IrctcHotelLoginDetails.MobileNumber.Xpath"), number);
		
		return this;
	}
	
	public IrctcHotelPassengerDetails clickOnSignIn() {
		
		clickByXpath(prop.getProperty("IrctcHotelLoginDetails.SignIn.Xpath"));
		
		return new IrctcHotelPassengerDetails(driver,test);
	}
}
