package pom.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.irctc.pages.FtrHomePage;
import wrappers.ProjectWrappers;

public class TC006_FtrRegistration extends ProjectWrappers{
	
@BeforeTest	
	public void beforeClass() {
		
		testCaseName="TC006_FtrRegistration";
		testCaseDescription="To verify whether the user is able to perform registration with valid details";
		author="senthil";
		category="Smoke";
		browserName="chrome";
		appName="irctcftrregistration";
		
	}
	
	@Test
	public void ftrregistration() {
		
		new FtrHomePage(driver,test)
		.clickOnftrsignup()
		.enterFtrUserUserid("Snathanr012")
		.enterFtrUserPassword("Password@123")
		.enterFtrUserCofPass("Password@123")
		.selectFtrSecuQuestion("What is your pet name?")
		.enterFtrSecuAnswer("Testtest")
		.enterFtrDateOfBirth("08/05/1986")
		.moveToNextField()
		.clickOnFtrGenderMale()
		.clickOnFtrMarriedStatus()
		.enterFtrEmailid("senthilnathan012@gmail.com")
		.selectFtrOccupation("Government")
		.enterFtrFirstName("senthilnathan")
		.enterFtrMiddleName("senthil")
		.enterFtrLastName("Ramalingam")
		.selectNationality("Indian")
		.enterFtrFlatNumber("F28B")
		.enterFtrSteetLane("Mannivakkam")
		.enterFtrArea("Mannivakkam")
		.selectFtrCountry("India")
		.enterFtrMobileNumber("9789622488")
		.enterFtrPincode("600048")
		.WaitTime()
		.MoveTocity()
		.MoveToPost()
		.WaitTime()
		.selectFtrPostOffice("Vandalur S.O")
		.closeAllBrowsers();
	}
			

}
