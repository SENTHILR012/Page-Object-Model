package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class SaloonEnquiryForm extends GenericWrappers{
	
	public SaloonEnquiryForm(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public SaloonEnquiryForm clickOnEnquiryForm() {
		
		clickByXpath(prop.getProperty("SaloonEnquiryForm.ClickEnquiryForm.Xpath"));
		
		return this;
	}
	
	public SaloonEnquiryForm enterUserName(String name) {
		
		enterByXpath(prop.getProperty("SaloonEnquiryForm.UserName.Xpath"), name);
		
		return this;
	}
	
	public SaloonEnquiryForm entherUserOrganization(String organization) {
		
		enterByXpath(prop.getProperty("SaloonEnquiryForm.UserOrganization.Xpath"), organization);
		
		return this;
	}
	
	public  SaloonEnquiryForm enterUserAddress(String address) {
		
		enterByXpath(prop.getProperty("SaloonEnquiryForm.UserAddress.Xpath"), address);
		
		return this;
	}
	
	public SaloonEnquiryForm enterUserMobileNumber(String mobilenumber) {
		
		enterByXpath(prop.getProperty("SaloonEnquiryForm.UserMobileNumber.Xpath"), mobilenumber);
		
		return this;
	}
	public SaloonEnquiryForm enterUserEmail(String emailid) {
		
		enterByXpath(prop.getProperty("SaloonEnquiryForm.UserEmail.Xpath"), emailid);
		
		return this;
	}
	
	public SaloonEnquiryForm selectUserRequest(String requestfor) {
		
		enterByXpath(prop.getProperty("SaloonEnquiryForm.UserRequest.Xpath"), requestfor);
		
		return this;
	}
	
	public SaloonEnquiryForm enterOrganizationStation(String station) {
		
		enterByXpath(prop.getProperty("SaloonEnquiryForm.OrganizationStation.Xpath"), station);
		
		return this;
	}
	
	public SaloonEnquiryForm enterDestnStation(String destnStation) {
		
		enterByXpath(prop.getProperty("SaloonEnquiryForm.DestnStation.Xpath"), destnStation);
		
		return this;
	}
	
	public SaloonEnquiryForm clickOnDateofDepIn() {
		
		clickByXpath(prop.getProperty("SaloonEnquiryForm.DateofDepIn.Xpath"));
		
		return this;
	}
	
	public SaloonEnquiryForm clickOnDatefieldIn() {
		
		clickByXpath(prop.getProperty("SaloonEnquiryForm.DatefieldIn.Xpath"));
		
		return this;
	}
	
	
	public SaloonEnquiryForm clickOnCheckOutDateofDep() {
		
		clickByXpath(prop.getProperty("SaloonEnquiryForm.CheckOutDateofDep.Xpath"));
		
		return this;
	}
	
	public SaloonEnquiryForm clickOnCheckOutDatefield() {
		
		clickByXpath(prop.getProperty("SaloonEnquiryForm.CheckOutDatefield.Xpath"));
		
		return this;
	}
	
	public SaloonEnquiryForm enterDurationofTour(String noofday) {
		
		enterByXpath(prop.getProperty("SaloonEnquiryForm.DurationofTour.Xpath"), noofday);
		
		return this;
	}
	
	public SaloonEnquiryForm enterCoachDetails(String noofcochyes) {
		
		enterByXpath(prop.getProperty("SaloonEnquiryForm.CoachDetails.Xpath"), noofcochyes);
		
		return this;
	}
	
	public SaloonEnquiryForm enterCoachPassenger(String passenger) {
		
		enterByXpath(prop.getProperty("SaloonEnquiryForm.CoachPassenger.Xpath"), passenger	);
		
		return this;
	}
	
	public SaloonEnquiryForm enterCoachPassengers(String passengers) {
		
		enterByXpath(prop.getProperty("SaloonEnquiryForm.CoachPassengers.Xpath"), passengers);
		
		return this;
	}
	
	public SaloonEnquiryForm enterCoachPurpose(String purpose) {
		
		enterByXpath(prop.getProperty("SaloonEnquiryForm.CoachPurpose.Xpath"), purpose);
		
		return this;
	}
	
	public SaloonEnquiryForm enterCoachAdditionalService(String additionalservice) {
		
		enterByXpath(prop.getProperty("SaloonEnquiryForm.CoachAdditionalService.Xpath"), additionalservice);
		
		return this;
	}
	
}
