package GenericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.orangehrm.seleniumiframework.pim.object_repository.Dash;
import com.orangehrm.seleniumiframework.pim.object_repository.Login;
import com.orangehrm.seleniumiframework.requirement.object_repository.dashboard;

public class BaseClassPimReason {
	public WebDriver d;
	FileUtility fiu=new FileUtility();
	WebDriverUtility wdu;
	Login lp;
	Dash db=new Dash(d);
	private String Browser;
	
	@BeforeSuite
	public void configbeforesuite() {
		Reporter.log("Executing BeforeSuite", true);
		
	}
	@BeforeTest
	public void configbeforeTest() {
		Reporter.log("Executing BeforeTest", true);
	}
	
	
	@BeforeClass
	public void configbeforeclass() throws IOException  {
		Reporter.log("Executing BeforeClass", true);
		Browser=fiu.getPropertyKeyValue("browser");
	
		if(Browser.contains("chrome")) {
			d=new ChromeDriver();
		}
		else if(Browser.contains("firefox")) {
			d=new FirefoxDriver();
		}
		else if(Browser.contains("edge")) {
			d=new EdgeDriver();
		}
		
		wdu=new WebDriverUtility(d);
		
		wdu.configMaximizeBrowswer();
		wdu.implicitWaitforBrowser(30);
		
//		d=new ChromeDriver();
//		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@BeforeMethod
	public void configbeforeMethod() throws IOException {
		Reporter.log("Executing BeforeMethod ", true);
//		FileInputStream file=new FileInputStream("./src/test/resources/Orangehrm_CommonData/commondata.properties");
//		Properties prop=new Properties();
//		prop.load(file);
		String URL=fiu.getPropertyKeyValue("url");
		String Username=fiu.getPropertyKeyValue("username");
		String Password=fiu.getPropertyKeyValue("password");
		//login
//		d.get(URL);
//		LoginPage lp=new LoginPage(d);
//		lp.enterCredentials(Username, Password);
//		lp.setLogin();
		wdu.navigatetoApplication(URL);
		lp=new Login(d);
		lp.enterCredentials(Username, Password);
		lp.Log();
		
		
	}
	@AfterMethod
	public void configafterMethod() {
		Reporter.log("Executing AfterMethod", true);
		db=new Dash(d);
		db.logOutClick();
		
	}
	@AfterClass
	public void configAfterClass() {
		Reporter.log("Executing AfterClass", true);
		wdu.QuitBrowserTab();
		
		
	}
	@AfterTest
	public void configAfterTest() {
		Reporter.log("Executing AfterTest", true);
	}
	@AfterSuite
	public void configAfterSuite() {
		Reporter.log("Executing AfterSuite", true);
	}




}
