package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	
	@Test
	public void generateReport() {
		
		// Start Report
		ExtentReports report = new ExtentReports("./reports/Result.html", false);
		
		
		// start Test
		ExtentTest test = report.startTest("TC004", "To verify IRCTC Registration");
		
		test.assignAuthor("Senthil");
		test.assignCategory("Functional");
		test.log(LogStatus.PASS	, "The applciation got laucnhed successfully");
		test.log(LogStatus.PASS	, "The applciation got laucnhed successfully");
		test.log(LogStatus.PASS	, "The applciation got laucnhed successfully");
		test.log(LogStatus.PASS	, "The applciation got laucnhed successfully");
		test.log(LogStatus.PASS	, "The applciation got laucnhed successfully");
		test.log(LogStatus.PASS	, "The applciation got laucnhed successfully");
		test.log(LogStatus.PASS	, "The applciation got laucnhed successfully");
		test.log(LogStatus.PASS	, "The applciation got laucnhed successfully");
		test.log(LogStatus.PASS	, "The applciation got laucnhed successfully");
		test.log(LogStatus.PASS	, "The applciation got laucnhed successfully");
		test.log(LogStatus.PASS	, "The applciation got laucnhed successfully");
		test.log(LogStatus.PASS	, "The applciation got laucnhed successfully");
		test.log(LogStatus.PASS	, "The applciation got laucnhed successfully");
		test.log(LogStatus.PASS	, "The applciation got laucnhed successfully");
		test.log(LogStatus.PASS	, "The applciation got laucnhed successfully");
		test.log(LogStatus.PASS	, "The applciation got laucnhed successfully");
		test.log(LogStatus.PASS	, "The applciation got laucnhed successfully");
		test.log(LogStatus.PASS	, "The applciation got laucnhed successfully");
		test.log(LogStatus.PASS	, "The applciation got laucnhed successfully");
		test.log(LogStatus.PASS	, "The applciation got laucnhed successfully");
		
		//end test
		report.endTest(test);
		//endreport
		report.flush();
		
	}

}
