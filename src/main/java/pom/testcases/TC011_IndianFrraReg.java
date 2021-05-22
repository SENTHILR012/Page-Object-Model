package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.formcregistration.pages.FormCHomePage;
import wrappers.ProjectWrappers;

public class TC011_IndianFrraReg extends ProjectWrappers{
	
@BeforeClass
	
	public void beforeClass() {
		
		testCaseName="TC011_FormcRegiration";
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
	.selectRegSecuque("where did you meet your spouse?")
	.enterRegAnswer("testtest")
	.enterRegName("senthilnathan")
	.selectGender("Male")
	.enterRegDOB("08/05/1986")
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
	.enterRegOwnerMobileNo("9789622488")
	.clickOnAddUser()
	.enterGuestName("testone")
	.enterGuestAddress("testone")
	.selectGuestState("TAMIL NADU")
	.selectGuestCity("CHENNAI")
	.enterGuestEmailID("Guest@gmail.com")
	.enterGuestPhoneNumber("9789622488")
	.enterGuestMoibleNumber("9789622488")
	.clickOnAddUsers()
	.enterHotelGuestName("testtwo")
	.enterHotelGuestAddress("testtwo")
	.selectHotelGuestState("TAMIL NADU")
	.selectHotelGuestCity("CHENNAI")
	.enterHotelGuestEmailID("Guest@gmail.com")
	.enterHotelGuestPhoneNumber("9789622488")
	.enterHotelGuestMoibleNumber("9789622488")
	.closeAllBrowsers();
}

}
