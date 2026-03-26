package GenericUtility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportUtility {
	public static ExtentReports extent;
	public static ExtentReports getExtendInstance() {
		if(extent==null) {
			ExtentSparkReporter spark=new ExtentSparkReporter("./Reports/Test_result.html");
			//ReporterConfiguration
			spark.config().setReportName("OrangeHRM UI Automation Report");
			spark.config().setDocumentTitle("Test Results");
			extent=new ExtentReports();
			extent.attachReporter(spark);
			extent.setSystemInfo("Automation Tester", "Swetha Babu");
			extent.setSystemInfo("UI_Automation_Framework", "Selenium+Testing");
		}
		return extent;
	}
	

}
