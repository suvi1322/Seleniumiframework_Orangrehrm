package practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ObjectRepository.BaseClasslogin;
import ObjectRepository.LoginPage1;




public class login1 extends BaseClasslogin{
	
	@Test
	public void login() {
	LoginPage1 lp=new LoginPage1(d);
	//login action
	lp.currenturl("https://www.saucedemo.com");
	lp.enterUsername("standard_user");
    lp.enterPass("secret_sauce");
	lp.clickLogin();
	lp.logout();
	}

}
