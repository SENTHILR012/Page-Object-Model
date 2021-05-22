package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC008_IRCTCGSTValidation extends ProjectWrappers{
	
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC008_IRCTCGSTValidation";
		testCaseDescription="To verify the irctc GST page validation";
		author="Senthil";
		category="Smoke";
		browserName="chrome";
		appName="irctc";
	}

	@Test
	public void irctcgstvalidation()
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
		.selectPassengerGst("Yes")
		.enterCustomerGstNumber("")
		.enterCustomerCompanyName("Techbuild")
		.enterCustomerCompanyAddress("Chennai")
		.clickOnGobutton()
		.WaitTime()
		.verifyGstMandatoryerrMess()
		.closeAllBrowsers();
		
		
		
		
		
		
	}
	
}
