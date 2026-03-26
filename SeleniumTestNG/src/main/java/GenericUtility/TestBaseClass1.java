package GenericUtility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
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

public class TestBaseClass1 {
	WebDriver d;
	@BeforeSuite
	public void beforesuite() {
		Reporter.log("Executing BeforeSuite", true);
		
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("Executing BeforeTest", true);
	}
	@Parameters("browser")
	@BeforeClass
	public void beforeclass(String browser) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		opt.addArguments("--headless");
		FirefoxOptions fire=new FirefoxOptions();
		fire.addArguments("--private");
		fire.addArguments("--headless");
		EdgeOptions edge=new EdgeOptions();
		edge.addArguments("--headless");
		edge.addArguments("--inprivate");
		
		Reporter.log("Executing Beforeclass", true);
		if(browser.equalsIgnoreCase("chrome")) {
			d=new ChromeDriver(opt);
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			d=new FirefoxDriver(fire);
		}
		else if(browser.equalsIgnoreCase("edge")){
			d=new EdgeDriver(edge);
		}
		else if(browser.equalsIgnoreCase("opera")){
			
		}
		else {
			System.out.println("Launch any other browser");
		}
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test
	public void beforeMethod() {
		Reporter.log("Executing BeforeMethd", true);
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.findElement(By.name("username")).sendKeys("Admin");
		d.findElement(By.name("password")).sendKeys("admin123");
		d.findElement(By.cssSelector("[type=\"submit\"]")).click();
	}
	@AfterMethod
	public void afterMethod() {
		Reporter.log("Executing AfterMethod", true);
		
	}
	@AfterClass
	public void AfterClass() {
		Reporter.log("Executing AfterClass", true);
		
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
