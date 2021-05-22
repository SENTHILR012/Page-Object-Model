package pom.formcregistration.pages;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FormCHomePage extends GenericWrappers{
	
	public FormCHomePage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public FormCRegistrationPage clickOnRegistratioPage() {
		
		clickByXpath(prop.getProperty("FormCRegistrationPage.RegistrationPage.Xpath"));
		
		return new FormCRegistrationPage(driver, test);
	}

}
