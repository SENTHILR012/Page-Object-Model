package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.panregistration.pages.PanHomePage;
import wrappers.ProjectWrappers;

public class TC002_PanRegistration extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TSC002_PanRegistration";
		testCaseDescription= "To verify whether the user is able to perform registration with valid details";
		author="Senthil";
		category="Smoke";
		browserName="chrome";
		appName="panindia";
		
		
	}
	@Test
	public void PanCardRegistrationHomePage() {
		
		new PanHomePage(driver,test)
		.mouseHoverTaxRegistrationFilling()
		.mouseHoverTaxRegistration()
		.mouseHoverPanRegistration()
		.mousehoverApplyPan()
		.mousehoverclickApplyNewPan()
		.switchToPanRegistrationPage()
		.selectUserTitle("MR.")
		.enterUserFirstName("Senthilnathan")
		.enterUserMiddleName("nathan")
		.enterUserLastName("Ramalingam")
		.enterUserfatherFirstName("Ramalingam")
		.enterUserfatherMiddleName("Ramalingam")
		.enterUserfatherLastName("Vaiyapuri")
		.enterUserMobileNumber("9789622488")
		.enterUserEmailid("Senthilnathan012@gmail.com")
		.selectSourceOfIncome("Salary")
		.clickOnUserAddress()
		.enterUserDateofBirth("08051986")
		.enterReAddHouse("F28B")
		.enterReAddArea("Mannivakkam")
		.enterReAddCity("Chennai")
		.selectUserState("Tamil Nadu")
		.TabtoNext()
		.enterUserregAddPinCode("600048")
		.TabtoProof()
		.selectUserIdentityProof("Aadhar Card issued by UIDAI(In Copy)")
		.selectUserAddressProof("Aadhar Card issued by UIDAI(In Copy)")
		.selectPanDOBproof("Aadhar Card issued by UIDAI(In Copy)")
		.selectPanAadhaarProof("Copy of Aadhaar Card / Letter")
		.clickOnTermsandCondition();
		
		
		
		
	}

}
