package Weeklyassesment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://icehrmpro.gamonoid.com/login.php");
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
		d.findElement(By.xpath("//span[text()='Filter Employees']")).click();
//		d.findElement(By.cssSelector("[id=\"rc_select_4\"]")).click();
//		d.findElement(By.cssSelector("[title=\"Software Engineer\"]")).click();
		d.findElement(By.cssSelector("[id=\"rc_select_5\"]")).click();
		d.findElement(By.cssSelector("[title=\"Head Office\"]")).click();
		d.findElement(By.cssSelector("[id=\"rc_select_6\"]")).click();
		d.findElement(By.cssSelector("[title=\"IceHrm Employee\"]")).click();
		d.findElement(By.xpath("//span[text()='Save']")).click();
		WebElement dept=d.findElement(By.xpath("//span[text()='Department = Head Office | Manager = IceHrm Employee']"));
		String dep=dept.getText();
		if(dep.contains("Head Office ")) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		d.findElement(By.xpath("//span[text()='Filter Employees']")).click();
		d.findElement(By.cssSelector("[id=\"rc_select_7\"]")).click();

		d.findElement(By.cssSelector("[id=\"rc_select_7\"]")).click();
		d.findElement(By.cssSelector("[title=\"Software Engineer\"]")).click();
		d.findElement(By.xpath("//span[text()='Save']")).click();
		WebElement dept1=d.findElement(By.xpath("//span[text()='Job Title = Software Engineer | Department = Head Office | Manager = IceHrm Employee']"));
		String dep1=dept1.getText();
		if(dep1.contains("Head Office ")) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
    	d.findElement(By.xpath("//span[text()='IceHrm ']")).click();
		d.findElement(By.partialLinkText("Sign out")).click();
		
		
		

	}

}
