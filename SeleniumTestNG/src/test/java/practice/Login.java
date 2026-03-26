package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import ObjectRepository.BaseClass;
import ObjectRepository.LoginPage;

public class Login extends BaseClass{
	@Test
	public void Login() {
		LoginPage lp=new LoginPage(d);
		//login action
		lp.EnterURL("https://www.saucedemo.com");
		lp.enterCredentials("standard_user","secret_sauce");
		lp.clickLogin();
		
	}
	

}
