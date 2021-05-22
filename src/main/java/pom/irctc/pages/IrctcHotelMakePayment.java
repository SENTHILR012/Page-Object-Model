package pom.irctc.pages;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IrctcHotelMakePayment extends GenericWrappers{
	
	public IrctcHotelMakePayment(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public IrctcHotelMakePayment clickOnTermsandCondition() {
		
		clickByXpath(prop.getProperty("IrctcHotelMakePayment.TermsandCondition.Xpath"));
		
		return this;
	}
	
	
	public IrctcHotelMakePayment clickOnMakePayment() {
		
		clickByXpath(prop.getProperty("IrctcHotelMakePayment.MakePayment.Xpath"));
		
		return this;
	}
	
	public IrctcHotelMakePayment clickonVerifyButton() {
		
		clickByXpath(prop.getProperty("IrctcHotelMakePayment.VerifyButton.Xpath"));
		
		return this;
	}
	
	public IrctcHotelMakePayment verifyOTPerrorMessage() {
		
		String error = "otp field is required.";
		
		verifyTextByXpath(prop.getProperty("IrctcHotelMakePayment.VerifyOTPerrorMessage.Xpath"), error);
		
		return this;
	}

}
