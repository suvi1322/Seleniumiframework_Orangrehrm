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

import GenericUtility.BaseClassTest3;

public class TestCase3{
	WebDriver d;
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
	@Test
    public void Recuit() {
		Actions act=new Actions(d);
		d.findElement(By.xpath("//span[text()='Recruitment']")).click();
		d.findElement(By.linkText("Vacancies")).click();
		d.findElement(By.cssSelector("[class=\"oxd-icon bi-plus oxd-button-icon\"]")).click();
		d.findElement(By.xpath("//label[text()='Vacancy Name']/../../..//input")).sendKeys("SoftwareEngineers");
		WebElement job=d.findElement(By.xpath("//label[text()='Job Title']/../../..//i"));
		act.click(job).pause(4000).sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
		//another method
//		act.moveToElement(job).click().keyDown(Keys.DOWN).keyDown(Keys.ENTER).perform();
		d.findElement(By.xpath("//label[text()='Description']/../../..//textarea")).sendKeys("HIIII!!!!!!");
		WebElement drop=d.findElement(By.cssSelector("[placeholder=\"Type for hints...\"]"));
		drop.sendKeys("Russel  Hamilton");
		act.pause(2000).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		d.findElement(By.xpath("//label[text()='Number of Positions']/../../..//input")).sendKeys("3");
		d.findElement(By.cssSelector("[type=\"submit\"]")).click();	
	}

}
