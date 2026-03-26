package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase5 {
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
	public void buzz() {
		d.findElement(By.xpath("//span[text()='Buzz']")).click();
		d.findElement(By.cssSelector("[placeholder=\"What's on your mind?\"]")).sendKeys("Hii all,Everyone looking good");
		d.findElement(By.cssSelector("[type=\"submit\"]")).click();
		WebElement check=d.findElement(By.xpath("(//div[@class=\"orangehrm-buzz-post-body\"]/..//p[@class=\"oxd-text oxd-text--p orangehrm-buzz-post-body-text\"])[1]"));
		String expect="Hii all,Everyone looking good";
		String actual=check.getText().trim();
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
