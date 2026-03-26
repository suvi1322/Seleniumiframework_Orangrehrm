package Practices;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.orangehrm.seleniumiframework.requirement.object_repository.LoginPage;

import GenericUtility.FileUtility;
import GenericUtility.WebDriverUtility;

public class LoginTest {
	@Test
	public void login() throws IOException {
		ExtentReports extent =new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("./Reports/login_report.html");
		extent.attachReporter(spark);
		ExtentTest test=extent.createTest("Login Test");
		WebDriver d=new ChromeDriver();
		WebDriverUtility wbu=new WebDriverUtility(d);
		FileUtility fu=new FileUtility();
		LoginPage lp=new LoginPage(d);
		wbu.configMaximizeBrowswer();
		wbu.implicitWaitforBrowser(20);
		String urlpath=fu.getPropertyKeyValue("url");
		String un=fu.getPropertyKeyValue("username");
		String pass=fu.getPropertyKeyValue("password");
		//navigating to application
		wbu.navigatetoApplication(urlpath);
		test.log(Status.INFO, "Naviagte to orangeHRM login page");
//		test.info("Naviagte to orangeHRM login page");
		lp.enterCredentials(un, pass);
//		test.log(Status.PASS, "Login Successfull!!");
//		test.pass("Naviagte to orangeHRM login page");
		test.log(Status.FAIL, "Login Successfull!!");
		extent.flush();
		}

}
