package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class CovidAlertPage extends GenericWrappers {
	
	public CovidAlertPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}

	public AccommodationPage ClickOnOk() {
		clickByXpath(prop.getProperty("CovidAlertPage.PopUpClick.Xpath"));
		return new AccommodationPage(driver,test);
	}
	
	public IrctcHotelsPage clickOnOkirctcHotel() {
		
		clickByXpath(prop.getProperty("CovidAlertPage.IrctcHotel.Xpath"));
		
		return new IrctcHotelsPage(driver,test);
	}
	
	
	
}
