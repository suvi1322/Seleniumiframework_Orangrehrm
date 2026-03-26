package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase4 {
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
	public void Myinfo() throws InterruptedException {
		d.findElement(By.xpath("//span[text()='My Info']")).click();
		Thread.sleep(2000);
		WebElement name = d.findElement(By.cssSelector("[placeholder='First Name']"));
	    name.sendKeys(Keys.CONTROL + "a");
	    name.sendKeys(Keys.DELETE);
	    name.sendKeys("Loreal");

	    WebElement last = d.findElement(By.cssSelector("[placeholder='Last Name']"));
	    last.sendKeys(Keys.CONTROL + "a");
	    last.sendKeys(Keys.DELETE);
	    last.sendKeys("Nelson");

	    WebElement id = d.findElement(By.xpath("//label[text()='Employee Id']/../../..//input"));
	    id.sendKeys(Keys.CONTROL + "a");
	    id.sendKeys(Keys.DELETE);
	    id.sendKeys("1322");
		d.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p orangehrm-form-hint\"]/..//button")).click();
	}
	@Test(priority = 3)
	public void logout() {
		d.findElement(By.cssSelector("[class=\"oxd-userdropdown-tab\"]")).click();
		d.findElement(By.linkText("Logout")).click();
		d.findElement(By.name("username")).sendKeys("Admin");
		d.findElement(By.name("password")).sendKeys("admin123");
		d.findElement(By.cssSelector("[type=\"submit\"]")).click();
		
	}
	@Test(priority = 4)
	public void valid() throws InterruptedException {
		d.findElement(By.xpath("//span[text()='My Info']")).click();
		Thread.sleep(2000);
		WebElement check = d.findElement(By.xpath("//div[@class=\"orangehrm-edit-employee-name\"]/../..//h6"));
		String actualValue=check.getText().trim();
		String expectedValue="Loreal Nelson";
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actualValue, expectedValue);
		if(actualValue.equals(expectedValue)) {
			System.out.println("Staus: Pass");
		}
		else {
			System.out.println("Status: Fail");
				
		}
		sa.assertAll();
		Thread.sleep(2000);
		d.findElement(By.cssSelector("[class=\"oxd-userdropdown-tab\"]")).click();
		d.findElement(By.linkText("Logout")).click();
		
	}

}
