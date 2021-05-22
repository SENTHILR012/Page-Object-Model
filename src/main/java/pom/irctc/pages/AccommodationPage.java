package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class AccommodationPage extends GenericWrappers{
	
	public AccommodationPage(RemoteWebDriver driver, ExtentTest test)
	
	{
		
		this.driver=driver;
		this.test=test;
	}
		
	public AccommodationPage clickOnSideBar() {
		
		clickByXpath(prop.getProperty("AccommodationPage.SideMenu.Xpath"));
		
		return this;
	}
	
	public SaloonEnquiryForm clickOnCharter() {
				
		clickByXpath(prop.getProperty("AccommodationPage.ClickCharter.Xpath"));
		
		return new SaloonEnquiryForm(driver,test);
	}
	
	public AccommodationPage clickOnBookYourCoch() {
		
		clickByXpath("//a[text()='Book Your Coach/Train']");
		
		return this;
	}
	
	public FtrHomePage SwitchtoLastWindow() {
		
		switchToLastWindow();
		
		return new FtrHomePage(driver,test);
	}
	

}
