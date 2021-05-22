package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.formcregistration.pages.FormCHomePage;
import wrappers.ProjectWrappers;

public class TC003_FormCRegistration extends ProjectWrappers{
	
	
	@BeforeClass
	
	public void beforeClass() {
		
		testCaseName="TC003_FormcRegiration";
		testCaseDescription= "To verify whether the user is able to perform formc registration with valid details";
		author="Senthil";
		category="Smoke";
		browserName="chrome";
		appName="formcregistration";
	}
	@Test
	public void FormcRegistration()
	{
	
	new FormCHomePage(driver,test)
	.clickOnRegistratioPage()
	.enterRegUserId("snathanr012")
	.enterRegPassWord("Password@123")
	.enterRegConfPassWord("Password@123")
	.tabToNextField()
	.waittime()
	.selectRegSecuque("What is the name of the hospital where you were born?")
	.enterRegAnswer("testtest")
	.enterRegName("senthilnathan")
	.selectGender("Male")
	.enterRegDOB("08/05/1986")
	.MoveToDesignation()
	.enterRegDesignation("Officer")
	.enterRegEmailId("senthilnathan012@gmail.com")
	.enterRegMobileNumber("9789622488")
	.enterRegPhoneNumber("9789622488")
	.enterRegGuestName("senthilnathan")
	.enterRegCapacity("2")
	.enterRegAddress("testtesttest")
	.tabToNextFields()
	.selectRegState("TAMIL NADU")
	.selectRegCity("CHENNAI")
	.selectRegAccoType("Guest House")
	.selectRegAccograde("Two Star")
	.enterRegGuestemailid("senthilnathan012@gmail.com")
	.enterRegGuestmobile("9789622488")
	.enterRegGuestPhoneNumber("9789622488")
	.enterRegOwnerName("senthilnathan")
	.enterRegOwneraddress("testetst")
	.selectRegOwnerState("TAMIL NADU")
	.selectRegOwnerCity("CHENNAI")
	.enterRegOwnerEmailId("senthilnathan012@gmail.com")
	.enterRegOwnerPhoneNo("9789622488")
	.enterRegOwnerMobileNo("9789622488");

}
}
