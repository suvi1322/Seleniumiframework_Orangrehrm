package GenericUtility;
import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ListenersImplementation implements ITestListener{
//	ExtentReports extent=new ExtentReports();
//	ExtentSparkReporter spark=new ExtentSparkReporter("./Reports/test_result.html");
//	ExtentTest test;
	ExtentReports extent=ExtendReportUtility.getExtendInstance();
	ThreadLocal<ExtentTest> test=new ThreadLocal<>();
	@Override
	public void onTestStart(ITestResult result) {
		test.set(extent.createTest(result.getMethod().getMethodName()));
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.get().pass("Test Status:pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.get().fail("Test Status:Fail");
		test.get().fail(result.getThrowable());
		try{
			Object obj=result.getInstance();
			BaseClassTest3 bc=(BaseClassTest3)obj;
		    WebDriver d=bc.d;
		    ScreenshotUtility sc=new ScreenshotUtility();
		    String path=sc.captureScreenShot(d, result.getMethod().getMethodName());
		    test.get().addScreenCaptureFromPath(path);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.get().skip("Test Status:Skip");
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
	

	

}
