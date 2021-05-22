package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC010_BookYourCoch extends ProjectWrappers{
	
	
	@BeforeClass
	public void beforeclass() {
		
		testCaseName="TC010_Book Your Coach";
		testCaseDescription="To verify the Book Your Coach Registration page ";
		author="Senthil";
		category="Smoke";
		browserName="chrome";
		appName="bookyourcoach";
		
	}
	
	@Test
	public void BookurCoch(){
		
		new HomePage(driver,test)
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.SwitchtoLastWindow()
		.clickOnSideBar()
		.clickOnBookYourCoch()
		.SwitchtoLastWindow()
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
		.MoveToDiffRes()
		.clickOnFtrdifferentResidential()
		.enterFtroffFlatnum("28L")
		.enterFtroffStreetLane("Gandhi")
		.enterFtrOffArea("Velachery")
		.selectFtrOfficeCountry("India")
		.enterFrtOffMobileNumber("9789622488")
		.enterFrtOffPincode("600042")
		.WaitTime()
		.MoveToPostOffice()
		.WaitTime()
		.selectFtroffPostOffice("Velacheri S.O")
		.closeAllBrowsers();
	}

}
