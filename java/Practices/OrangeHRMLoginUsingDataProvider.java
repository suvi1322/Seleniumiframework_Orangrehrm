package Practices;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangehrm.seleniumiframework.requirement.object_repository.LoginPage;

public class OrangeHRMLoginUsingDataProvider {
	WebDriver d;
	@DataProvider(name="LoginData")
	Object[][] getCredentials(){
		return new Object[][] {
			{"Admin","admin123"}
	};
	}
	@Test(dataProvider = "LoginData")
	public void login(String user,String pass) {
		d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		LoginPage lp=new LoginPage(d);
		lp.enterCredentials(user, pass);
		lp.setLogin();
		
				
	}

}
