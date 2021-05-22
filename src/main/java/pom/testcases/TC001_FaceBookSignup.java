package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.page.FaceBookHomePage;
import wrappers.ProjectWrappers;

public class TC001_FaceBookSignup extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC001_FaceBookSignup";
		testCaseDescription="To verify whether the user is able to perform registration with valid details";
		author="Senthil";
		category="Smoke";
		browserName="chrome";
		appName="facebook";
	}
	
	@Test
	public void Faceregistrationpage() {
		
		new FaceBookHomePage(driver,test)
		.clickOnCreateNewAccount()
		.enterFirstName("senthil")
		.enterLastName("nathanr")
		.enterEmailId("senthilnathan012@gmail.com")
		.enterConfEmailId("senthilnathan012@gmail.com")
		.enterPassword("Password@123")
		.selectDay("8")
		.selectMonth("May")
		.selectYear("1986")
		.clickOnMale()
		.clickOnSUbmit();
		
	}


}
