package pom.formcregistration.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FormCRegistrationPage extends GenericWrappers{
	
	public FormCRegistrationPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public FormCRegistrationPage waittime() {
		
		waitProperty(5000);
		
		return this;
	}
	
	public FormCRegistrationPage enterRegUserId(String userid) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.RegUserId.Xpath"), userid);
		
		return this;
	}
	
	public FormCRegistrationPage enterRegPassWord(String password) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.RegPassWord.Xpath"), password);
		
		return this;
	}


	public FormCRegistrationPage enterRegConfPassWord(String confpassword) {
	
		enterByXpath(prop.getProperty("FormCRegistrationPage.ConfPassWord.Xpath"), confpassword);
	
	return this;
	}
	
	public FormCRegistrationPage tabToNextField() {
		
		pageDown(prop.getProperty("FormCRegistrationPage.TabToNextField.Xpath"), "tab");
	
		return this;
	}
	

	public FormCRegistrationPage selectRegSecuque(String secuquest) {
			
		selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.RegSecuQue.Xpath"), secuquest);
	
	return this;
	}
	

	
	public FormCRegistrationPage enterRegAnswer(String answer) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.RegSecuAns.Xpath"), answer);
	
	return this;
	}
	
	
	public FormCRegistrationPage enterRegName(String name) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.RegName.Xpath"), name);
	
	return this;
	}

	public FormCRegistrationPage selectGender(String gender) {
	
		selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.RegGender.Xpath"), gender);
	
	return this;
	}
	
	public FormCRegistrationPage enterRegDOB(String dob) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.RegDob.Xpath"), dob);
		
		return this;
		}
	public FormCRegistrationPage MoveToDesignation() {
		
		pageDown(prop.getProperty("FormCRegistrationPage.RegDob.Xpath"), "tab");
		
		return this;
	}
	
	public FormCRegistrationPage enterRegDesignation(String designation) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.RegDesignation.Xpath"), designation);
		
		return this;
		}
	
	public FormCRegistrationPage enterRegEmailId(String emailid) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.RegEmailId.Xpath"), emailid);
		
		return this;
		}
	
	public FormCRegistrationPage enterRegMobileNumber(String mobilenumber) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.RegMobileNumber.Xpath"), mobilenumber);
		
		return this;
		}
	
	public FormCRegistrationPage enterRegPhoneNumber(String phonenumber) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.RegPhoneNumber.Xpath"), phonenumber);
		
		return this;
		}
	
	public FormCRegistrationPage enterRegGuestName(String guestname) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.RegGuestName.Xpath"), guestname);
		
		return this;
		}
	
	public FormCRegistrationPage enterRegCapacity(String capacity) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.RegCapacity.Xpath"), capacity);
		
		return this;
		}
	

	
	public FormCRegistrationPage enterRegAddress(String address) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.RegAddress.Xpath"), address);
		
		return this;
	}
	
	public FormCRegistrationPage tabToNextFields() {
		
		pageDown(prop.getProperty("FormCRegistrationPage.tabToNextFields.Xpath"), "tab");
		
		return this;
	}
	
	public FormCRegistrationPage selectRegState(String state) {
		
		selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.RegState.Xpath"), state);
		
		return this;
		}
	
	public FormCRegistrationPage selectRegCity(String city) {
		
		selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.RegCity.Xpath"), city);
		
		return this;
		}
	
	public FormCRegistrationPage selectRegAccoType(String accotype) {
		
		selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.RegAccoType.Xpath"), accotype);
		
		return this;
		}
	
	public FormCRegistrationPage selectRegAccograde(String accograde) {
		
		selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.RegAccograde.Xpath"), accograde);
		
		return this;
		}
	
	public FormCRegistrationPage enterRegGuestemailid(String emailid) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.RegGuestemailid.Xpath"), emailid);
		
		return this;
		}
	
	public FormCRegistrationPage enterRegGuestmobile(String gumobile) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.RegGuestmobile.Xpath"), gumobile);
		
		return this;
		}
	
	public FormCRegistrationPage enterRegGuestPhoneNumber(String guphonenumber) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.RegGuestPhoneNumber.Xpath"), guphonenumber);
		
		return this;
		}
	
	public FormCRegistrationPage enterRegOwnerName(String ownername) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.RegOwnerName.Xpath"), ownername);
		
		return this;
		}
	
	public FormCRegistrationPage enterRegOwneraddress(String owneraddress) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.RegOwneraddress.Xpath"), owneraddress);
		
		return this;
		}
	
	public FormCRegistrationPage selectRegOwnerState(String ownerstate) {
		
		selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.RegOwnerState.Xpath"), ownerstate);
		
		return this;
	}
	
	public FormCRegistrationPage selectRegOwnerCity(String ownercity) {
		
		selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.RegOwnerCity.Xpath"), ownercity);
		
		return this;
	}
	
	public FormCRegistrationPage enterRegOwnerEmailId(String owneremailid) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.RegOwnerEmailId.Xpath"), owneremailid);
		
		return this;
		}
	
	public FormCRegistrationPage enterRegOwnerPhoneNo(String ownerphoneno) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.RegOwnerPhoneNo.Xpath"), ownerphoneno);
		
		return this;
		}
	public FormCRegistrationPage enterRegOwnerMobileNo(String ownermobileno) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.RegOwnerMobileNo.Xpath"), ownermobileno);
		
		return this;
		}
	public FormCRegistrationPage clickOnAddUser() {
		
		clickByXpath(prop.getProperty("FormCRegistrationPage.ClickOnAddUser.Xpath"));
		
		return this;
	}
	
public FormCRegistrationPage enterGuestName(String guestname) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.GuestName.Xpath"), guestname);
		
		return this;
	}
	
	public FormCRegistrationPage enterGuestAddress(String guestaddress) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.GuestAddress.Xpath"), guestaddress);
		
		return this;
	}
	
	
	public FormCRegistrationPage selectGuestState(String gueststate) {
		
		selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.GuestState.Xpath"), gueststate);
		
		return this;
	}
	
	public FormCRegistrationPage selectGuestCity(String guestcity) {
		
		selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.GuestCity.Xpath"), guestcity);
		return this;
	}
	
	public FormCRegistrationPage enterGuestEmailID(String guestemailid)
	{
		enterByXpath(prop.getProperty("FormCRegistrationPage.GuestEmailID.Xpath"), guestemailid);
		return this;
	}
	
	public FormCRegistrationPage enterGuestPhoneNumber(String guestphonenumber) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.GuestPhoneNumber.Xpath"),guestphonenumber);
		return this;
		
	}
	
	public FormCRegistrationPage enterGuestMoibleNumber(String guestmobilenumber)
	{
		enterByXpath(prop.getProperty("FormCRegistrationPage.GuestMoibleNumber.Xpath"), guestmobilenumber);
		
		return this;
	}
	
	public FormCRegistrationPage clickOnAddUsers() {
		
		clickByXpath(prop.getProperty("FormCRegistrationPage.clickOnAddUsers.Xpath"));
		
		return this;
	}
	
	
	public FormCRegistrationPage enterHotelGuestName(String guestname) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.HotelGuestName.Xpath"), guestname);
		
		return this;
	}
	
	public FormCRegistrationPage enterHotelGuestAddress(String guestaddress) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.HotelGuestAddress.Xpath"), guestaddress);
		
		return this;
	}
	
	
	
	
	public FormCRegistrationPage selectHotelGuestState(String gueststate) {
		
		selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.HotelGuestState.Xpath"), gueststate);
		
		return this;
	}
	
	public FormCRegistrationPage selectHotelGuestCity(String guestcity) {
		
		selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.HotelGuestCity.Xpath"), guestcity);
		return this;
	}
	
	public FormCRegistrationPage enterHotelGuestEmailID(String guestemailid)
	{
		enterByXpath(prop.getProperty("FormCRegistrationPage.HotelGuestEmailID.Xpath"), guestemailid);
		return this;
	}
	
	public FormCRegistrationPage enterHotelGuestPhoneNumber(String guestphonenumber) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.HotelGuestPhoneNumber.Xpath"), guestphonenumber);
		return this;
		
	}
	
	public FormCRegistrationPage enterHotelGuestMoibleNumber(String guestmobilenumber)
	{
		enterByXpath(prop.getProperty("FormCRegistrationPage.HotelGuestMoibleNumber.Xpath"), guestmobilenumber);
		
		return this;
	}
	
	
}
