package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCase2 {
	WebDriver d=null;
	@Test(priority = 0)
	public void launchingbrowser() {
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
	public void Recruit() {
		d.findElement(By.xpath("//span[text()='Recruitment']")).click();
		d.findElement(By.cssSelector("[class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
		d.findElement(By.name("firstName")).sendKeys("Swetha");
		d.findElement(By.name("middleName")).sendKeys("Kumari");
		d.findElement(By.name("lastName")).sendKeys("B");
		WebElement drop=d.findElement(By.xpath("//div[text()='-- Select --']/../../../..//i"));
		Actions act=new Actions(d);
		act.click(drop).pause(1000).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).perform();
		d.findElement(By.xpath("//label[text()='Email']/../../..//input")).sendKeys("swethababupec@gmail.com");
		d.findElement(By.xpath("//label[text()='Contact Number']/../../..//input")).sendKeys("9500573968");
		d.findElement(By.cssSelector("[type=\"file\"]")).sendKeys("D:\\CAPGEMINI\\SWETHA B RESUME.pdf");
		d.findElement(By.cssSelector("[placeholder=\"Enter comma seperated words...\"]")).sendKeys("I, Am, Swetha");
		WebElement date =d.findElement(By.cssSelector("[placeholder=\"yyyy-dd-mm\"]"));
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("arguments[0].value='2026-04-11'", date);
		d.findElement(By.cssSelector("[type=\"submit\"]")).click();
	}
	@Test(priority = 3)
	public void candidates() throws InterruptedException {
		Actions act=new Actions(d);
		Thread.sleep(2000);
		d.findElement(By.linkText("Candidates")).click();
		WebElement sel=d.findElement(By.xpath("//label[text()='Job Title']/../../..//i"));
		act.click(sel).pause(3000).sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
		WebElement sel1=d.findElement(By.xpath("//label[text()='Vacancy']/../../..//i"));
		act.click(sel1).pause(4000).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).perform();
//		WebElement sel2=d.findElement(By.xpath("//label[text()='Hiring Manager']/../../..//i"));
//		act.click(sel2).pause(4000).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).perform();
		WebElement sel3=d.findElement(By.xpath("//label[text()='Status']/../../..//i"));
		act.click(sel3).pause(4000).sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
		WebElement name=d.findElement(By.cssSelector("[placeholder=\"Type for hints...\"]"));
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("arguments[0].value='Swetha Kumari B'",name);
		WebElement from=d.findElement(By.cssSelector("[placeholder=\"From\"]"));
		js.executeScript("arguments[0].value='2025-06-11'",from);
		WebElement to=d.findElement(By.cssSelector("[placeholder=\"To\"]"));
		js.executeScript("arguments[0].value='2026-05-11'",to);
		d.findElement(By.cssSelector("[type=\"submit\"]")).click();
		WebElement record =d.findElement(By.xpath("//div[@class=\"orangehrm-horizontal-padding orangehrm-vertical-padding\"]/..//span"));
		String str=record.getText();
		if(str.contains("Record Found")) {
			System.out.println("successfull!!");
			
		}
		else {
			System.out.println("Failed");
		}
	}
	@Test(priority = 4)
	public void logOut() {
		d.findElement(By.xpath("//span[@class=\"oxd-userdropdown-tab\"]/../../..//p")).click();
		d.findElement(By.linkText("Logout")).click();
	}
}
