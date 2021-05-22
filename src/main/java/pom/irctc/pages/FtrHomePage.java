package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FtrHomePage extends GenericWrappers{
	
	public FtrHomePage(RemoteWebDriver driver,ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public FtrRegistrationPage clickOnftrsignup() {
		clickByLink(prop.getProperty("FtrRegistrationPage.ClickLink.Xpath"));
		return new FtrRegistrationPage(driver,test);
	}

}
