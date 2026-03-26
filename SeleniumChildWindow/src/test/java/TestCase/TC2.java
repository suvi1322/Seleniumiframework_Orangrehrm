package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		d.findElement(By.name("username")).sendKeys("Admin");
		d.findElement(By.name("password")).sendKeys("admin123");
		d.findElement(By.cssSelector("[type=\"submit\"]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//span[text()='Admin']")).click();
     	Thread.sleep(2000);
		d.findElement(By.xpath("//button[normalize-space()='Add']")).click();
     	Thread.sleep(2000);
		WebElement a=d.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]"));
		a.click();
		d.findElement(By.xpath("//div[text()='Admin']")).click();
		Thread.sleep(2000);
		String admin=a.getText();
		if(admin.contains("Admin")) {
			System.out.println("Displayed");
		}
		else {
			System.out.println("Not??");
		}
		a.click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[text()='ESS']")).click();
		Thread.sleep(2000);
		String ess=a.getText();
		if(ess.contains("ESS")) {
			System.out.println("Selected");
		}
		else {
			System.out.println("Not!!!");
		}
		Thread.sleep(3000);
		d.findElement(By.xpath("(//button[@type=\"button\"])[4]")).click();
		d.findElement(By.cssSelector("[class=\"oxd-userdropdown-name\"]")).click();
		Thread.sleep(2000);
		d.findElement(By.partialLinkText("Logout")).click();
		d.close();

	}

}
