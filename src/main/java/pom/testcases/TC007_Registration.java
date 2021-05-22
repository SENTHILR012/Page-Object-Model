package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;


public class TC007_Registration extends ProjectWrappers{
	
@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC007_Registration";
		testCaseDescription="To verify the irctc registration page validation";
		author="Senthil";
		category="Smoke";
		browserName="chrome";
		appName="irctc";
	}

	@Test
	public void irctcregistration() {
		
		new HomePage(driver,test)
		.clickOnOk()
		.clickOnRegister()
		.enterUserName("senthilnathanr012")
		.enterPassWord("Password123")
		.enterConfPassWord("Password123")
		.clickOnLanguage()
		.clickOnLanguageOption()
		.clickOnSecurityQuestion()
		.waittime()
		.clickOnSecurityOption("What is your pet name?")
		.enterSecurityAnswer("Test")
		.clickOnContinuebutton()
		.enterFirstName("Senthilnathan")
		.enterMiddleName("Ramalingam")
		.enterLastName("Ramalingam")
		.clickOnSelectOccupation()
		.waittime()
		.SelectOccupationdetail("PUBLIC")
		.enterDateofBirth("08-05-1986")
		.clickOnMarried()
		.clickOnGender("Male")
		.enterEmailID("senthilnathan012@gmail.com")
		.enterMoibleNumber("9789622488")
		.selectNationality("India")
		.clickOnContinue()
		.enterFlatNumber("F28B")
		.enterStreetName("Pavan")
		.enterAreaName("Aadhiran")
		.enterPinCode("600048")
		.movetonextfield()
		.selectCity("Kanchipuram")
		.selectPostOffice("Kolapakkam B.O")
		.eneterHomePhoneNumber("9789622488")
		.clickOnResidance("Yes")
		.enterOfficeFlatNumbers("26 Moon home")
		.enterOfficeStreet("Adyar Main road")
		.enterOfficeArea("Adyar")
		.clickOnOfficeCountry()
		.clickOnOfficeCountryoption("India")
		.enterOfficePincode("600027")
		.selectOfficePostOffice("Meenambakkam S.O")
		.enterOfficeMobileNumber("9789622488")
		.closeAllBrowsers();
	}

}
