package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase6 {
	WebDriver d=null;
	@Test(priority = 0)
	public void launchinbrowser() {
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test(priority = 1)
	public void login() {
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.findElement(By.name("username")).sendKeys("Admin");
		d.findElement(By.name("password")).sendKeys("admin123");
		d.findElement(By.cssSelector("[type=\"submit\"]")).click();
	}
	@Test(priority = 2)
	public void pim() {
		d.findElement(By.xpath("//a[@href=\"/web/index.php/pim/viewPimModule\"]/..//span")).click();
		d.findElement(By.xpath("//span[text()='Configuration ']/..//i")).click();
		d.findElement(By.linkText("Termination Reasons")).click();
		d.findElement(By.cssSelector("[class=\"oxd-icon bi-plus oxd-button-icon\"]")).click();
		d.findElement(By.xpath("//label[text()='Name']/../..//input")).sendKeys("NetworkIssuesdetected");
		d.findElement(By.cssSelector("[type=\"submit\"]")).click();
		d.findElement(By.cssSelector("[class=\"oxd-text oxd-text--span\"]"));
		String expect="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewTerminationReasons";
		String actual=d.getCurrentUrl();
		Assert.assertEquals(expect.equals(actual), true);
		if(actual.equals(expect)) {
			System.out.println("Successful!!");
		}
		else {
			System.out.println("Failed");
		}
		d.findElement(By.cssSelector("[class=\"oxd-userdropdown-tab\"]")).click();
		d.findElement(By.linkText("Logout")).click();
	}
	
	
	
}
