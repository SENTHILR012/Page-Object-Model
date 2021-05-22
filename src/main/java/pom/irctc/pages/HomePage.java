package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{

	
	public HomePage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
		// TODO Auto-generated constructor stub
	}


	public HomePage clickOnOk() {
		clickByXpath(prop.getProperty("HomePage.PopUpClick.Xpath"));
		return this;
	}
	
	public RegistrationPage clickOnRegister() {
		clickByXpath(prop.getProperty("HomePage.Registration.Xpath"));
		return new RegistrationPage(driver,test);
	}
	
	public HomePage clickOnHotels() {
		
		clickByXpath(prop.getProperty("HomePage.Hotels.Xpath"));
		
		return this;
	}
	
	public CovidAlertPage switchToLastTab() {
		
		switchToLastWindow();
	
		return new CovidAlertPage(driver,test);
	}
	
	public HomePage mouseHoverOnHolidays() {
		mouseHover(prop.getProperty("HomePage.Holidays.Xpath"));
		return this;
	}
	
	public HomePage mouseHoverOnStays() {
		mouseHover(prop.getProperty("HomePage.HoverStays.Xpath"));
		return this;
	}
	
	public HomePage clickOnLounge() {
		clickByXpath(prop.getProperty("HomePage.Lounge.Xpath"));
		return this;
		//return new AccommodationPage(driver,test);
	}
	
	public AccommodationPage SwitchtoLastWindow() {
		
		switchToLastWindow();
		
		return new AccommodationPage(driver,test);
	}
	
}
