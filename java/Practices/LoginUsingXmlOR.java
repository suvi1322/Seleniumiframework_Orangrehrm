package Practices;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class LoginUsingXmlOR {
	@Test
	public void login() throws SAXException, IOException, ParserConfigurationException {
		//Read data from xml file
		Document file=DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("D:\\SELENIUM\\SeleniumUIFramework.OrangeHRM\\src\\main\\resources\\DemoObjectRepository\\LoginPage.xml"));
		//fetching the string values
		String username=file.getElementsByTagName("UsernameField").item(0).getTextContent();
		String password=file.getElementsByTagName("PasswordField").item(0).getTextContent();
		String loginbtn=file.getElementsByTagName("loginButton").item(0).getTextContent();
		//Splitting the locator and value
		String userloc=username.split(":")[0];
		String userlocValue=username.split(":")[1];
		String passloc=password.split(":")[0];
		String PasslocValue=password.split(":")[1];
		String loginbtnloc=loginbtn.split(":")[0];
		String LoginlocValue=loginbtn.split(":")[1];
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		//Username
		if(userloc.equals("name")) {
			d.findElement(By.name(userlocValue)).sendKeys("Admin");
		}
		if(passloc.equals("name")) {
			d.findElement(By.name(PasslocValue)).sendKeys("admin123");
		}
		if(loginbtnloc.equals("cssSelector")) {
			d.findElement(By.cssSelector(LoginlocValue)).click();
		}
	}
	

}
