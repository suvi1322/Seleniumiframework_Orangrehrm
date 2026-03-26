package Weeklyassesment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://icehrmpro.gamonoid.com/login.php");
		WebElement a=d.findElement(By.cssSelector("[class=\"btn btn-info btn-medium w-100 text-uppercase\"]"));
		a.click();
		String login=a.getText();
		if(login.contains("username and password")) {
			System.out.println("Test case passed!!");
		}
		else {
			System.out.println("Test case failed");
		}
		d.findElement(By.name("username")).sendKeys("admin");
		d.findElement(By.name("password")).sendKeys("admin");
		WebElement a1=d.findElement(By.cssSelector("[class=\"btn btn-info btn-medium w-100 text-uppercase\"]"));
		a1.click();
		String dash=d.getCurrentUrl();
		if(dash.contains("https://icehrmpro.gamonoid.com/?g=admin&n=dashboard&m=admin_Admin")) {
			System.out.println("Succesful!!");
		}
		else {
			System.out.println("failed");
		}
		d.navigate().to("https://icehrmpro.gamonoid.com/?g=admin&n=employees&m=admin_Employees");
		d.findElement(By.linkText("Skills")).click();
		d.findElement(By.cssSelector("[class=\"anticon anticon-plus-circle\"]")).click();
		d.findElement(By.cssSelector("[class=\"ant-modal-close\"]")).click();
		WebElement skill=d.findElement(By.xpath("//span[text()='Skill']"));
		String sk=skill.getText();
		if(sk.contains("Skills")) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		d.findElement(By.xpath("//span[text()='IceHrm ']")).click();
		d.findElement(By.partialLinkText("Sign out")).click();
	}

}
