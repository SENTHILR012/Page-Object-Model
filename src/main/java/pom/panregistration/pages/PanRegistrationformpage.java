package pom.panregistration.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PanRegistrationformpage extends GenericWrappers {
		
	public PanRegistrationformpage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
		
	}
	
	public PanRegistrationformpage selectUserTitle(String title) {
		
		selectVisibleTextByXpath(prop.getProperty("PanRegistrationformpage.PanTitle.Xapth"), title);
		
		return this;
	}

	
	public PanRegistrationformpage enterUserFirstName(String firstname) {
		
		enterByXpath(prop.getProperty("PanRegistrationformpage.PanFirstName.Xapth"), firstname);
		
		return this;
	}
	
	public PanRegistrationformpage enterUserMiddleName(String middlename) {
		
		enterByXpath(prop.getProperty("PanRegistrationformpage.PanMiddleName.Xapth"), middlename);
		
		return this;
	}
	
	public PanRegistrationformpage enterUserLastName(String lastname) {
		
		enterByXpath(prop.getProperty("PanRegistrationformpage.PanLastName.Xapth"), lastname);
		
		return this;
	}
	
	public PanRegistrationformpage enterUserfatherFirstName(String fathername) {
		
		enterByXpath(prop.getProperty("PanRegistrationformpage.PanFatherFristName.Xapth"), fathername);
		
		return this;
	}
	
	public PanRegistrationformpage enterUserfatherMiddleName(String fathermiddlename) {
		
		enterByXpath(prop.getProperty("PanRegistrationformpage.PanFatherMiddleName.Xapth"), fathermiddlename);
		
		return this;
	}
	
	public PanRegistrationformpage enterUserfatherLastName(String fatherlastname) {
		
		enterByXpath(prop.getProperty("PanRegistrationformpage.PanFatherLastName.Xapth"), fatherlastname);
		
		return this;
	}
	
	public PanRegistrationformpage enterUserMobileNumber(String mobilenumber) {
		
		enterByXpath(prop.getProperty("PanRegistrationformpage.MobileNumber.Xapth"), mobilenumber);
		
		return this;
	}
	
	public PanRegistrationformpage enterUserEmailid(String emailid) {
		
		enterByXpath(prop.getProperty("PanRegistrationformpage.EmailId.Xapth"), emailid);
		
		return this;
	}
	
	public PanRegistrationformpage selectSourceOfIncome(String sourceofIncome) {
		
		selectVisibleTextByXpath(prop.getProperty("PanRegistrationformpage.SourceOfIncome.Xapth"), sourceofIncome);
		
		return this;
	}
	
	public PanRegistrationformpage clickOnUserAddress() {
		
		clickByXpath(prop.getProperty("PanRegistrationformpage.Residance.Xapth"));
		
		return this;
	}
	
	public PanRegistrationformpage clickOnUserOffice() {
		
		clickByXpath(prop.getProperty("PanRegistrationformpage.Office.Xapth"));
		
		return this;
	}
	
	public PanRegistrationformpage enterUserDateofBirth(String dob) {
		
		enterByXpath(prop.getProperty("PanRegistrationformpage.DateOfBirth.Xapth"), dob);
		
		return this;
	}
	
	public PanRegistrationformpage enterReAddHouse(String houseno) {
		
		enterByXpath(prop.getProperty("PanRegistrationformpage.AddressOne.Xapth"), houseno);
		
		return this;
	}
	
	public PanRegistrationformpage enterReAddArea(String housearea) {
		
		enterByXpath(prop.getProperty("PanRegistrationformpage.AddressTwo.Xapth"), housearea);
		
		return this;
	}
	
	public PanRegistrationformpage enterReAddCity(String housecity) {
		
		enterByXpath(prop.getProperty("PanRegistrationformpage.CityName.Xapth"), housecity);
		
		return this;
	
	}
	
	public PanRegistrationformpage selectUserState(String State) {
		
		selectVisibleTextByXpath(prop.getProperty("PanRegistrationformpage.PanState.Xapth"), State);
		
		return this;
	}
	
	public PanRegistrationformpage TabtoNext() {
		
		pageDown(prop.getProperty("PanRegistrationformpage.MovetoField.Xapth"), "tab");
		
		return this;
	}
		
	public PanRegistrationformpage enterUserregAddPinCode(String pincode) {
		
		enterByXpath(prop.getProperty("PanRegistrationformpage.Pincode.Xapth"), pincode);
		
		return this;
	}
	
	public PanRegistrationformpage TabtoProof() {
		
		pageDown(prop.getProperty("PanRegistrationformpage.MovetoNextField.Xapth"), "tab");
		
		return this;
	}
	
	public PanRegistrationformpage selectUserIdentityProof(String identityproof) {
		
		selectVisibleTextByXpath(prop.getProperty("PanRegistrationformpage.IdentityProof.Xapth"), identityproof);
		
		return this;
	}
	
	public PanRegistrationformpage selectUserAddressProof(String addressproof) {
		
		selectVisibleTextByXpath(prop.getProperty("PanRegistrationformpage.AddressProof.Xapth"), addressproof);
		
		return this;
	}
	
	public PanRegistrationformpage selectPanDOBproof(String pandobproof) {
		
		selectVisibleTextByXpath(prop.getProperty("PanRegistrationformpage.DobProof.Xapth"), pandobproof);
		
		return this;
	}
	
	public PanRegistrationformpage selectPanAadhaarProof(String aadhaarproof) {
		
		selectVisibleTextByXpath(prop.getProperty("PanRegistrationformpage.AadharProof.Xapth"), aadhaarproof);
		
		return this;
	}
	
	public PanRegistrationformpage clickOnTermsandCondition() {
		
		clickByXpath(prop.getProperty("PanRegistrationformpage.PanSource.Xapth"));
		
		return this;
	}
	
	
}
