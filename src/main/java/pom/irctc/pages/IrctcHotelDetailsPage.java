package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IrctcHotelDetailsPage extends GenericWrappers{
	
	public IrctcHotelDetailsPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public String getHotelName() {
		
		String expectedhotelname = getTextByXpath(prop.getProperty("IrctcHotelDetailsPage.GetHotelName.Xpath"));
	
		return expectedhotelname;
	}
	
	public String getHotelPrice() {
		
		String expectedresultprice= getTextByXpath(prop.getProperty("IrctcHotelDetailsPage.GetHotelPrice.Xpath"));
		
		String[] ba= expectedresultprice.split("/");
		
		 expectedresultprice= (ba[0]);
		 
		return expectedresultprice;
	
	}
	
	public IrctcHotelLoginDetails clickOnContinueButton() {
		
		clickByXpath(prop.getProperty("IrctcHotelDetailsPage.ButtonClick.Xpath"));
		
		return new IrctcHotelLoginDetails(driver,test);
	}

}
