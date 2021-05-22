 package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IrctcHotelList extends GenericWrappers{
	

	public IrctcHotelList(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public IrctcHotelDetailsPage clickOnBook() {
		
		clickByXpath(prop.getProperty("IrctcHotelList.ClickBook.Xpath"));
		
		return new IrctcHotelDetailsPage(driver,test);
	}
	

}
