package Task;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCase1 {
	WebDriver d=null;
	@Test(priority = 0)
	public void launchinbrowser() {
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--incognito");
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
    public void PIM() {
		d.findElement(By.xpath("//a[@href=\"/web/index.php/pim/viewPimModule\"]/..//span")).click();
		d.findElement(By.cssSelector("[class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
		d.findElement(By.name("firstName")).sendKeys("Swetha");
		d.findElement(By.name("middleName")).sendKeys("Kumari");
		d.findElement(By.name("lastName")).sendKeys("B");
		d.findElement(By.xpath("//label[text()='Employee Id']/../..//input")).sendKeys("1322");
		WebElement  ele=d.findElement(By.cssSelector("[class=\"oxd-switch-input oxd-switch-input--active --label-right\"]"));
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("arguments[0].click()",ele);
		d.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[3]")).sendKeys("swe1322");
		d.findElement(By.xpath("(//input[@type=\"password\"])[1]")).sendKeys("#Swe*1304");
		d.findElement(By.xpath("(//input[@type=\"password\"])[2]")).sendKeys("#Swe*1304");
		d.findElement(By.xpath("//button[@type=\"submit\" ]")).click();
		
	}
	@Test(priority = 3)
	public void admin() {
		d.findElement(By.xpath("//span[text()='Admin']")).click();
		d.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]")).sendKeys("swe1322");
		WebElement drop=d.findElement(By.xpath("//div[@class=\"oxd-select-text--after\"]/../..//i"));
		Actions act=new Actions(d);
		act.click(drop).pause(1000).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).perform();
		WebElement name=d.findElement(By.cssSelector("[placeholder=\"Type for hints...\"]"));
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("arguments[0].value='Swetha Kumari B'",name);
		WebElement select=d.findElement(By.xpath("//label[text()='Status']/../../..//i"));
		act.click(select).pause(1000).sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
		d.findElement(By.cssSelector("[type=\"submit\"]")).click();
		WebElement record =d.findElement(By.xpath("//span[text()='(1) Record Found']"));
		String str=record.getText();
		if(str.contains("(1) Record Found")) {
			System.out.println("successfull!!");
			
		}
		else {
			System.out.println("Failed");
		}
		
	}
	@Test(priority = 4)
	public void logOut() {
		d.findElement(By.cssSelector("[class=\"oxd-userdropdown-name\"]")).click();
		d.findElement(By.linkText("Logout")).click();
	}
	

}
