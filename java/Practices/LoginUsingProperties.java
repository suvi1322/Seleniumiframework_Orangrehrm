package Practices;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginUsingProperties {
	WebDriver d;
	@Test
	public void login() throws IOException {
		FileInputStream fis= new FileInputStream("D:\\SELENIUM\\SeleniumUIFramework.OrangeHRM\\src\\main\\resources\\DemoObjectRepository\\LoginPage.properties");
		Properties po=new Properties();
		po.load(fis);
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.findElement(By.name(po.getProperty("un").split(":")[1])).sendKeys("Admin");
		d.findElement(By.name(po.getProperty("pas").split(":")[1])).sendKeys("admin123");
		d.findElement(By.cssSelector(po.getProperty("loginbutton").split(":")[1])).click();
	}

}
