package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravels.pages.HomePhpTravels;
import wrappers.ProjectWrappers;

public class TC004_PhpTravels extends ProjectWrappers{
	
@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC004_PhpTravels";
		testCaseDescription= "To verify whether the user is able to perform phptravels registration with valid details";
		author="Senthil";
		category="Smoke";
		browserName="chrome";
		appName="phptravels";
	}
	
	
	@Test
	public void phpregistration() {
		
		new HomePhpTravels(driver,test)
		.clickOnPhpTravelRegistration()
		.enterFirstName("senthilnathan")
		.enterLastName("Ramalingam")
		.enterEmailid("senthilnathan012@gmail.com")
		.enterPhoneNumber("9789622488")
		.enterCompnayName("Testing")
		.enterStreetAddree("StreetOne")
		.enterStreetAddres("Streettwo")
		.enterCity("Chennai")
		.enterState("Tamil Nadu")
		.enterPincode("600048")
		.selectFindus("Google")
		.enterMoibleNumber("9789622488")
		.enterPassword("Password@123")
		.enterConfPassword("Password@123");

		
	}

}
