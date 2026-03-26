package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Week3Test2 {
	WebDriver d=null;
	 @Test(priority = 0)
	 public void launching() {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		d=new ChromeDriver(opt);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
	 }
	 @Test(priority = 1)
	 public void login() {
		 d.get("https://www.saucedemo.com/");
		 d.findElement(By.name("user-name")).sendKeys("standard_user");
		 d.findElement(By.name("password")).sendKeys("secret_sauce");
		 d.findElement(By.cssSelector("[type=\"submit\"]")).click();
	 }
	 @Test(priority = 2)
	 public void price() {
		Actions act=new Actions(d);
		WebElement sel=d.findElement(By.cssSelector("[class=\"right_component\"]"));
		act.click(sel).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).perform();
		d.findElement(By.xpath("//div[text()='Sauce Labs Onesie']/../../../..//button")).click();
		d.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]/..//span")).click();
		WebElement cart=d.findElement(By.cssSelector("[class=\"inventory_item_name\"]"));
		 String expect="Sauce Labs Onesie";
		 String actual=cart.getText();
		 SoftAssert sa=new SoftAssert();
		 sa.assertEquals(actual, expect);
			if(actual.equals(expect)) {
				System.out.println("Staus: Pass");
			}
			else {
				System.out.println("Status: Fail");
					
			}
	 }
	 @Test(priority = 3)
	 public void checkout() {
		 d.findElement(By.id("checkout")).click();
			d.findElement(By.name("firstName")).sendKeys("Swetha");
			d.findElement(By.name("lastName")).sendKeys("B");
			d.findElement(By.id("postal-code")).sendKeys("600116");
			d.findElement(By.id("continue")).click();
			WebElement order=d.findElement(By.xpath("//span[text()='Checkout: Overview']"));
			String expect1="Checkout: Overview";
			String actual1=order.getText();
			 SoftAssert sa1=new SoftAssert();
			 sa1.assertEquals(actual1, expect1);
				if(actual1.equals(expect1)) {
					System.out.println("Validated sucessfully!");
				}
				else {
					System.out.println("not validated");
						
				}
				d.findElement(By.id("finish")).click();
				
		 }
	 @Test(priority = 5)
	 public void logout() {
		 d.findElement(By.id("back-to-products")).click();
		 d.findElement(By.id("react-burger-menu-btn")).click();
		 d.findElement(By.linkText("Logout")).click();
		 
	 }
}
