package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{
	WebDriver d;
	public LoginPage(WebDriver d) {
		this.d=d;
	}
	By username=By.id("user-name");
	By password=By.id("password");
	By Login=By.id("login-button");
	//business logic (Login action)
	public void EnterURL(String URL) {
		d.get(URL);
	}
	public void enterCredentials(String un,String pwd) {
		d.findElement(username).sendKeys(un);
		d.findElement(password).sendKeys(pwd);
	}
	public void clickLogin() {
		d.findElement(Login).click();	
	}


}
