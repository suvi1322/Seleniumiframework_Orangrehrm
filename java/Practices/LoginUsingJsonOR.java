package Practices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginUsingJsonOR {
	@Test
	public void login() throws IOException {
		String data=new String(Files.readAllBytes(Paths.get("D:\\SELENIUM\\SeleniumUIFramework.OrangeHRM\\src\\main\\resources\\DemoObjectRepository\\LoginPage.json")));
		JSONObject obj=new JSONObject(data);
		JSONObject loginPage=obj.getJSONObject("login");
		//extracting the data to check
		String userTextField = loginPage.getString("un");
		String passwordTextField=loginPage.getString("pass");
		String loginbtn = loginPage.getString("loginbutton");
		//Splitting the string values to use in locator
		String[] userloc=userTextField.split(":");
		String[] passloc=passwordTextField.split(":");
		String[] loginbtnloc=loginbtn.split(":");
		//Test script
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		//Username
		if(userloc[0].equals("name")) {
			d.findElement(By.name(userloc[1])).sendKeys("Admin");
		}
		if(passloc[0].equals("name")) {
			d.findElement(By.name(passloc[1])).sendKeys("admin123");
		}
		if(loginbtnloc[0].equals("cssSelector")) {
			d.findElement(By.cssSelector(loginbtnloc[1])).click();
		}
		
	}

}
