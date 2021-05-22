package wrappers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ProjectWrappers extends GenericWrappers {
	
	public String browserName;
	
	public String appName;
	
	@BeforeSuite
	public void beforeSuite() {
		startReport();
	}
	
	@BeforeTest
	public void beforeTest() {
		loadObjects();
	}
	
	
	
	@BeforeMethod
	public void beforeMethod() {
		startTest(testCaseName, testCaseDescription);
		
		switch (appName) {
		case "facebook":
			invokeApp(browserName, "http://www.facebook.com");
			break;
		case "irctc":
			invokeApp(browserName, "http://www.irctc.co.in");
			break;
			
		case "panindia":
			invokeApp(browserName, "https://panind.com/");
			break;
			
		case "formcregistration":
			invokeApp(browserName, "https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
			break;
			
		case "phptravels":
			
			invokeApp(browserName, "https://www.phptravels.org/register.php");
			break;
			
		case "irctcftrregistration":
			
			invokeApp(browserName, "https://www.ftr.irctc.co.in/ftr/");
			break;
			
		case "bookyourcoach":
			
			invokeApp(browserName, "https://www.irctc.co.in/nget/train-search");
			break;

		default:
			System.out.println("Please specify valid application name");
			break;
		}
		
	}
	
	@AfterMethod
	public void afterMethod() {
		closeAllBrowsers();
	}
	
	@AfterClass
	public void afterClass() {
		endTest();
	}
	
	@AfterTest
	public void afterTest() {
		unloadObjects();
	}

	@AfterSuite
	public void afterSuite() {
		endReport();
	}
	
}
