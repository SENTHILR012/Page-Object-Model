package pom.panregistration.pages;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PanHomePage extends GenericWrappers{

	
	public PanHomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		// TODO Auto-generated constructor stub
	}

	public PanHomePage mouseHoverTaxRegistrationFilling() {
		
		mouseHover(prop.getProperty("PanHomePage.TaxRegistrationFilling.Xpath"));
		
		return this;
	}
	
	public PanHomePage mouseHoverTaxRegistration() {
		
		mouseHover(prop.getProperty("PanHomePage.TaxRegistration.Xpath"));

		return this;
	}
	
	public ApplyPanHomePage mouseHoverPanRegistration() {
		
		clickByXpath(prop.getProperty("PanHomePage.PanRegistration.Xpath"));

		return new ApplyPanHomePage(driver, test);
	}
}
