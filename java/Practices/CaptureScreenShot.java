package Practices;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.orangehrm.seleniumiframework.requirement.object_repository.LoginPage;
import com.orangehrm.seleniumiframework.requirement.object_repository.dashboard;

import GenericUtility.ScreenshotUtility;
import GenericUtility.WebDriverUtility;

public class CaptureScreenShot {
	@Test
	public void screenshot() throws IOException, InterruptedException {
		WebDriver d=new ChromeDriver();
		WebDriverUtility wbu=new WebDriverUtility(d);
		LoginPage lp=new LoginPage(d);
		dashboard db=new dashboard(d);
		ScreenshotUtility su=new ScreenshotUtility();
		//Creating a method for time-Stamp
//		String time=new SimpleDateFormat("yyyy-mm-dd[hh-mm-ss]").format(new Date());
		wbu.configMaximizeBrowswer();
		wbu.implicitWaitforBrowser(20);
		wbu.navigatetoApplication("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lp.enterCredentials("Admin", "admin123");
		Thread.sleep(5000);
		//capture the screenshot of home page
//		TakesScreenshot ts=(TakesScreenshot) d;
//		ts.getScreenshotAs(OutputType.FILE);
//		File temp=ts.getScreenshotAs(OutputType.FILE);
//		File perm=new File("./Reports/dashboard"+time+".png");
//		FileHandler.copy(temp, perm);
//		//Capture the screenshot of web Element
//		WebElement recruit=db.getRecruit();
//		File tempsrc=recruit.getScreenshotAs(OutputType.FILE);
//		File permsrc=new File("./Reports/recruit"+time+".png");
//		FileHandler.copy(tempsrc, permsrc);
		//Capture the Screenshot of Home page
		su.captureScreenShot(d, "dashboard");
		//Capture the screenshot of web element
		su.captureScreenShot(db.getRecruit(), "recruit");
	}

}
