package Practices;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearningExtentReports {
	@Test
	public void practice() {
		//create a new test
		ExtentReports test =new ExtentReports();
		//create a  reporter
		ExtentSparkReporter spark=new ExtentSparkReporter("./Reports/report.html");
		test.attachReporter(spark);
		ExtentTest ref=test.createTest("Sample test");
		//Logging
		ref.info("Started test execution");
		ref.pass("The test step has been passed");
		ref.fail("The test step has been failed");
		//write the report
		test.flush();
	}
}	

