package TestCase;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		d.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
		Thread.sleep(2000);
		String parent=d.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(2000);
     	Set<String> all=d.getWindowHandles();
     	System.out.println(all);
		for(String allw:all) {
			d.switchTo().window(allw);
		}
		Thread.sleep(2000);
		String expected="https://www.orangehrm.com/";
		String URL=d.getCurrentUrl();
		if(URL.contains(expected)) {
			System.out.println("Test case passed");
		}
	    else {
		System.out.println("Failed");
	     }
		Thread.sleep(2000);
		String tittle=d.getTitle();
		System.out.println(d.getTitle());
		if(tittle.isEmpty()) {
			System.out.println("empty");
		}
		else {
			System.out.println("not empty");
		}
		d.close();
		Thread.sleep(2000);
		d.switchTo().window(parent);
		Thread.sleep(2000);
		WebElement login=d.findElement(By.cssSelector("[class=\"oxd-text oxd-text--h5 orangehrm-login-title\"]"));
		if(login.isDisplayed()) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Failed");
		}
		d.close();	
	}

}
