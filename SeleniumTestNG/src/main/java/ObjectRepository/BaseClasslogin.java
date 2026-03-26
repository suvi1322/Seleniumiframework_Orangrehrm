package ObjectRepository;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

public class BaseClasslogin{
	public WebDriver d;
	@BeforeMethod
	public void beforeclass() {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		//headless is used for only we can see in console it will not open the browser
		//opt.addArguments("--headless");
		d=new ChromeDriver(opt);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.saucedemo.com/");
		}	

}
