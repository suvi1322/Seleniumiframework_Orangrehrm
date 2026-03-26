package Assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testcase1 {
	
	@Test
	public void login() {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.findElement(By.name("username")).sendKeys("Admin");
		d.findElement(By.name("password")).sendKeys("admin123");
		d.findElement(By.cssSelector("[type=\"submit\"]")).click();
		WebElement ele=d.findElement(By.xpath("//h6[text()='Dashboard']"));
		String Expected="Dashboard";
		String Actual=ele.getText();
		//Hard
//		Assert.assertEquals(Expected.equals(Actual), true);
//		if(Expected.equals(Actual)) {
//			System.out.println("PASS");
//		}
//		else {
//			System.out.println("FAIL");
//		}
		//Soft
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(Expected.equals(Actual), true);
		if(Actual.equals(Expected)) {
			System.out.println("Status : Pass");
		}
		else {
			System.out.println("Status : Fail");
		}
		sa.assertAll();
	}

}
