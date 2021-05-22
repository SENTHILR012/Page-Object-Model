package pom.panregistration.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;


public class ApplyPanHomePage extends GenericWrappers{
	
	public ApplyPanHomePage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	
	public ApplyPanHomePage mousehoverApplyPan() {
		
		mouseHover(prop.getProperty("ApplyPanHomePage.ApplyPan.Xpath"));
		
		return this;
	}
	
	public ApplyPanHomePage mousehoverclickApplyNewPan() {
		
		clickByXpath(prop.getProperty("ApplyPanHomePage.ApplyNewPan.Xpath"));
		
		return this;
	}
	
  
	public PanRegistrationformpage switchToPanRegistrationPage() {
		
		switchToLastWindow();
		
		return new PanRegistrationformpage(driver, test);
		}
	
	
}
