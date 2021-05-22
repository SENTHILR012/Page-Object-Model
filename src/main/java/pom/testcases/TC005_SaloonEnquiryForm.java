package pom.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC005_SaloonEnquiryForm extends ProjectWrappers{
	
@BeforeTest
	public void beforeClass() {
		
		testCaseName="TC005_SallonEnquiryForm";
		testCaseDescription="To Verify Irctc service of Saloon Enquiry form validation";
		author="senthil";
		category="Smoke";
		browserName="chrome";
		appName="irctc";
		
	}
	
	@Test
	public void saloonenquiryform() {

	new HomePage(driver,test)
	.clickOnOk()
	.mouseHoverOnHolidays()
	.mouseHoverOnStays()
	.clickOnLounge()
	.SwitchtoLastWindow()
	.clickOnSideBar()
	.clickOnCharter()
	.clickOnEnquiryForm()
	.enterUserName("senthilnathan")
	.entherUserOrganization("Testorange")
	.enterUserAddress("Address")
	.enterUserMobileNumber("9789622488")
	.enterUserEmail("Senthilnathan012@gmail.com")
	.selectUserRequest("Saloon Charter")
	.enterOrganizationStation("Chennai")
	.enterDestnStation("Banglore")
	.clickOnDateofDepIn()
	.clickOnDatefieldIn()
	.clickOnCheckOutDateofDep()
	.clickOnCheckOutDatefield()
	.enterDurationofTour("3")
	.enterCoachDetails("3")
	.enterCoachPassenger("6")
	.enterCoachPassengers("6")
	.enterCoachPurpose("Traveling")
	.enterCoachAdditionalService("Food");

	}
}
