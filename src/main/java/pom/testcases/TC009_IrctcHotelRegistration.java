package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC009_IrctcHotelRegistration extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
	testCaseName="TC009_Hotel Registration";
	testCaseDescription="To verify the irctc Hotel Registration page ";
	author="Senthil";
	category="Smoke";
	browserName="chrome";
	appName="irctc";
	}
	@Test
	public void irctchotelregistration()
	{
		new HomePage(driver,test)
		.clickOnOk()
		.clickOnHotels()
		.switchToLastTab()
		.clickOnOkirctcHotel()
		.enterHotelLocationName("Chennai")
		.SelectHotel()
		.clickOnRooms()
		.selectGuestRooms("1")
		.selectGuestAdults("2")
		.selectGuestChildren("1")
		.clickOnDoneButton()
		.clickOnFindHotel()
		.clickOnBook()
		.clickOnContinueButton()
		.enterEmailId("senthilnathan012@gmail.com")
		.enterMobileNumber("9789622488")
		.clickOnSignIn()
		.selectIrctcHotelPassengerTitle("Mr")
		.enterPassengerFirstName("Senthilnathan")
		.enterPassengerLastName("Ramalingam")
		.selectPassengerCountry("India")
		.selectPassengerState("TAMIL NADU")
		.MovetoGST()
		.selectPassengerGst("No")
		.clickOnGobutton()
		.WaitTime()
		.verifyHotelName()
		.verifyHotelPrice()
		.clickOnGobuttons()
		.clickOnTermsandCondition()
		.clickOnMakePayment()
		.clickonVerifyButton()
		.verifyOTPerrorMessage()
		.closeAllBrowsers();
		
	}

}
