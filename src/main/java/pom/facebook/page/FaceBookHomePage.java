package pom.facebook.page;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FaceBookHomePage extends GenericWrappers{
	
	
	public FaceBookHomePage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	
	public FaceBookSignUpPage clickOnCreateNewAccount() {
		clickByXpath(prop.getProperty("FaceBookHomePage.CreateNewAccount.XPath"));
		return new FaceBookSignUpPage(driver,test);
	}
	

}
