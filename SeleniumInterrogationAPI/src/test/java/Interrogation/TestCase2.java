package Interrogation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	Thread.sleep(null);d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(9000);
	WebElement username=d.findElement(By.xpath("//input[starts-with(@name,'u')]"));
	username.sendKeys("Admin");
	Thread.sleep(2000);
	WebElement pass=d.findElement(RelativeLocator.with(By.tagName("input")).below(username));
	pass.sendKeys("admin123"); 
	Thread.sleep(4000);
	d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	Thread.sleep(4000);
	WebElement profile = d.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']"));
    profile.click();
    Thread.sleep(2000);
    d.findElement(By.linkText("Change Password")).click();
    Thread.sleep(2000);
    d.navigate().back();
    Thread.sleep(2000);
    System.out.println("After Back - Title: " + d.getTitle());
    d.navigate().forward();
    Thread.sleep(2000);
    System.out.println("After Forward - Title: " + d.getTitle());
    d.navigate().refresh();
    Thread.sleep(2000);
    String currentURL = d.getCurrentUrl();
    System.out.println("Current URL is: " + currentURL);
    Thread.sleep(2000);
    if(currentURL.contains("orangehrm")) {
        System.out.println("URL Validation - PASS");
    } else {
        System.out.println("URL Validation - FAIL");
    }
    Thread.sleep(2000);
    d.quit();
	

	}

}
