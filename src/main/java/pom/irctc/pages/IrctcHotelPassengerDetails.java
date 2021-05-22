package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IrctcHotelPassengerDetails extends GenericWrappers{
	
	public IrctcHotelPassengerDetails(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public IrctcHotelPassengerDetails WaitTime() {
		
		waitProperty(5000);
		
		return this;
	}
	
	public IrctcHotelPassengerDetails selectIrctcHotelPassengerTitle(String title) {
		
		selectVisibleTextByXpath(prop.getProperty("IrctcHotelPassengerDetails.HotelPassengerTitle.Xpath"), title);
		
		return this;
	}
	
	public IrctcHotelPassengerDetails enterPassengerFirstName(String firstname) {
		
		enterByXpath(prop.getProperty("IrctcHotelPassengerDetails.PassengerFirstName.Xpath"), firstname);
		
		return this;
	}
	
	public IrctcHotelPassengerDetails enterPassengerLastName(String lastname) {
		
		enterByXpath(prop.getProperty("IrctcHotelPassengerDetails.PassengerLastName.Xpath"), lastname);
		
		return this;
	}
	
	public IrctcHotelPassengerDetails selectPassengerCountry(String country) {
		
		selectVisibleTextByXpath(prop.getProperty("IrctcHotelPassengerDetails.PassengerCountry.Xpath"), country);
		
		return this;
	}
	
	public IrctcHotelPassengerDetails selectPassengerState(String state) {
		
		selectVisibleTextByXpath(prop.getProperty("IrctcHotelPassengerDetails.PassengerState.Xpath"), state);
		
		return this;
	}
	
	public IrctcHotelPassengerDetails MovetoGST() {
		
		pageDown(prop.getProperty("IrctcHotelPassengerDetails.MoveToGst.Xpath"), "tab");
		
		return this;
	}
	
	public IrctcHotelPassengerDetails selectPassengerGst(String gst) {
		
		selectVisibleTextByXpath(prop.getProperty("IrctcHotelPassengerDetails.PassengerGst.Xpath"), gst);
		
		return this;
	}
	
	public IrctcHotelPassengerDetails enterCustomerGstNumber(String gstnumber) {
		
		enterByXpath(prop.getProperty("IrctcHotelPassengerDetails.CustomerGstNumber.Xpath"), gstnumber);
		
		return this;
		
	}
	
	public IrctcHotelPassengerDetails enterCustomerCompanyName(String companyname) {
		
		enterByXpath(prop.getProperty("IrctcHotelPassengerDetails.CustomerCompanyName.Xpath"), companyname);
		
		return this;
	}
	
	public IrctcHotelPassengerDetails enterCustomerCompanyAddress(String companyaddress) {
		
		enterByXpath(prop.getProperty("IrctcHotelPassengerDetails.CustomerCompanyAddress.Xpath"), companyaddress);
		
		return this;	
	}
	
	public IrctcHotelPassengerDetails verifyHotelName() {
		
		IrctcHotelDetailsPage hoteldetails= new IrctcHotelDetailsPage(driver,test);
		
		String expectedresult = hoteldetails.getHotelName();
		
		verifyTextByXpath(prop.getProperty("IrctcHotelPassengerDetails.VerifyHotelName.Xpath"), expectedresult);
		
		return this;
	}
	
	public IrctcHotelPassengerDetails verifyHotelPrice() {
		
		IrctcHotelDetailsPage hoteldetails= new IrctcHotelDetailsPage(driver,test);
		
		String expectedprice = hoteldetails.getHotelPrice();
		
		verifyTextByXpath(prop.getProperty("IrctcHotelPassengerDetails.VerifyHotelPrice.Xpath"), expectedprice);
		
		return this;
	}
	
	public IrctcHotelPassengerDetails clickOnGobutton() {
		
		clickByXpath(prop.getProperty("IrctcHotelPassengerDetails.GoButton.Xpath"));
		
		return this;
		
	}
	
	public IrctcHotelPassengerDetails verifyGstMandatoryerrMess() {
		
		String error = "gstNumber field is required.";
		
		verifyTextByXpath(prop.getProperty("IrctcHotelPassengerDetails.VerifyGstMandatoryerrMess.Xpath"), error);
		
		return this;
		
	}
	
	public IrctcHotelMakePayment clickOnGobuttons() {
		
		clickByXpath(prop.getProperty("IrctcHotelPassengerDetails.Gobuttons.Xpath"));
		
		return new IrctcHotelMakePayment(driver,test);
		
	}

}
