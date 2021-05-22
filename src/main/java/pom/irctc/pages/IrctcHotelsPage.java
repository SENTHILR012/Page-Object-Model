package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IrctcHotelsPage extends GenericWrappers{
	
	public IrctcHotelsPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}

	public IrctcHotelsPage enterHotelLocationName(String location) {
		
		enterByXpath(prop.getProperty("IrctcHotelsPage.HotelLocationName.Xpath"), location);
		
		return this;
	}
	
	
	
	public IrctcHotelsPage SelectHotel() {
		
		clickByXpath(prop.getProperty("IrctcHotelsPage.SelectHotelLocation.Xpath"));
		
		return this;
	}
	
	public IrctcHotelsPage clickOnCheckInDate() {
		
		clickByXpath(prop.getProperty("IrctcHotelsPage.ClickCheckInDate.Xpath"));
		
		return this;
	}

	public IrctcHotelsPage selectCheckInDate(String date) {
		
		clickByXpath(prop.getProperty("IrctcHotelsPage.SelectCheckInDate.Xpath"));
		
		return this;
	}
	
	public IrctcHotelsPage clickOnCheckoutDate() {
		
		clickByXpath(prop.getProperty("IrctcHotelsPage.ClickCheckOutDate.Xpath"));
		
		return this;
	}

	public IrctcHotelsPage selectCheckoutDate(String outdate) {
		
		clickByXpath(prop.getProperty("IrctcHotelsPage.CheckoutDate.Xpath"));
		
		return this;
	}
	
	public IrctcHotelsPage clickOnRooms() {
		
		clickByXpath(prop.getProperty("IrctcHotelsPage.ClickOnRooms.Xpath"));
		return this;
	}
	
	public IrctcHotelsPage selectGuestRooms(String room) {
		
		selectVisibleTextByXpath(prop.getProperty("IrctcHotelsPage.GuestRooms.Xpath"), room);
		
		return this;
	}
	
	public IrctcHotelsPage selectGuestAdults(String adults) {
		
		selectVisibleTextByXpath(prop.getProperty("IrctcHotelsPage.GuestAdults.Xpath"), adults);
		
		return this;
	}
	
	public IrctcHotelsPage selectGuestChildren(String children) {
		
		selectVisibleTextByXpath(prop.getProperty("IrctcHotelsPage.GuestChildren.Xpath"), children);
		
		return this;
	}
	
	public IrctcHotelsPage clickOnDoneButton() {
		
		clickByXpath(prop.getProperty("IrctcHotelsPage.DoneButton.Xpath"));
		
		return this;
		
	}
	
	public IrctcHotelList clickOnFindHotel() {
		
		clickByXpath(prop.getProperty("IrctcHotelsPage.FindHotel.Xpath"));
		
		return new IrctcHotelList(driver,test);
	}
	
}
