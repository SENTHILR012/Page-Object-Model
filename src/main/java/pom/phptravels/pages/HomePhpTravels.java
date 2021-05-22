package pom.phptravels.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HomePhpTravels extends GenericWrappers{
	
	
	public HomePhpTravels(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public PhpTravelRegistrationPage clickOnPhpTravelRegistration() {
		
		clickByXpath(prop.getProperty("HomePhpTravels.PhpTravelRegistration.Xpath"));
		
		return new PhpTravelRegistrationPage(driver,test);
	}

}
