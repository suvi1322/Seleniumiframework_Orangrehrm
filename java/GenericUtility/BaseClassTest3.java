package GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.orangehrm.seleniumiframework.requirement.object_repository.ClickVacancy;
import com.orangehrm.seleniumiframework.requirement.object_repository.LoginPage;
import com.orangehrm.seleniumiframework.requirement.object_repository.addVacancy;
import com.orangehrm.seleniumiframework.requirement.object_repository.addValuesInVacancy;
import com.orangehrm.seleniumiframework.requirement.object_repository.dashboard;
import com.orangehrm.seleniumiframework.requirement.object_repository.recruitment;


public class BaseClassTest3 {
	ScreenshotUtility sc=new ScreenshotUtility();
	public WebDriver d;
	FileInputStream file;
	Properties prop;
	
	@BeforeSuite
	public void beforesuite() {
		Reporter.log("Executing BeforeSuite", true);
		
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("Executing BeforeTest", true);
	}
	@BeforeClass
	public void beforeclass() throws IOException {
		FileInputStream file=new FileInputStream("./src/test/resources/Orangehrm_CommonData/commondata.properties");
		Properties prop=new Properties();
		prop.load(file);
		String Browser=prop.getProperty("browser");
		if(Browser.contains("chrome")) {
			d=new ChromeDriver();
		}
		else if(Browser.contains("firefox")) {
			d=new FirefoxDriver();
		}
		else if(Browser.contains("edge")) {
			d=new EdgeDriver();
		}
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@BeforeMethod
	public void beforeMethod() throws IOException {
		Reporter.log("Executing BeforeMethd", true);
		FileInputStream file=new FileInputStream("./src/test/resources/Orangehrm_CommonData/commondata.properties");
		Properties prop=new Properties();
		prop.load(file);
		String URL=prop.getProperty("url");
		String Username=prop.getProperty("username");
		String Password=prop.getProperty("password");
		//login
		d.get(URL);
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));
		LoginPage lp=new LoginPage(d);
		wait.until(ExpectedConditions.visibilityOf(lp.getUsername()));
		lp.enterCredentials(Username, Password);
		sc.captureScreenShot(d, "AfterLogin");
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type='submit']")));
		lp.setLogin();
		
		
		
	}
	@AfterMethod
	public void afterMethod() {
		Reporter.log("Executing AfterMethod", true);
		dashboard db=new dashboard(d);
		db.logOutClick();
	}
	@AfterClass
	public void AfterClass() {
		Reporter.log("Executing AfterClass", true);
		d.quit();
		
	}
	@AfterTest
	public void AfterTest() {
		Reporter.log("Executing AfterTest", true);
	}
	@AfterSuite
	public void AfterSuite() {
		Reporter.log("Executing AfterSuite", true);
	}

}
