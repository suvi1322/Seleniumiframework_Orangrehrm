package Practice;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

//public class addToCartTest {
   // @Test(priority = 1 )
//    public void login() {
//    	d.get("https://www.saucedemo.com/?utm_source=chatgpt.com");
//    	d.findElement(By.name("user-name")).sendKeys("standard_user");
//    	d.findElement(By.name("password")).sendKeys("secret_sauce");
//    	d.findElement(By.id("login-button")).click();
//    	WebElement SL=d.findElement(By.xpath("//div[text()='Swag Labs']"));
//    	if(SL.getText().contains("Swag Labs")) {
////    		System.out.println("Login Successful!!");
//    		Reporter.log("validated", true);
//    		
//    	}
//    	else {
////    		System.out.println("Login Failed");
//    		Reporter.log("not validated", false);
//    	}
//    }
//    @Test(priority = 2)
//    public void addToCart() {
//    	d.findElement(By.xpath("//div[.='Sauce Labs Backpack']/../../..//button")).click();
//    	d.findElement(By.xpath("//div[.='Sauce Labs Bike Light']/../../..//button")).click();
//     	d.findElement(By.id("shopping_cart_container")).click();
//    	List<WebElement> cart=d.findElements(By.cssSelector("[class='inventory_item_name']"));
//    	String two="";
//    	for(WebElement CartProducts:cart) {
//    		two+=CartProducts.getText();
//    	}
//    	if(two.contains("Sauce Labs Backpack") && two.contains("Sauce Labs Bike Light")) {
////    		System.out.println("Pass");
//    		Reporter.log("validated", true);
//    	}
//    	else {
////    		System.out.println("Failed");
//    		Reporter.log("not validated", false);
//    	}
//    }
//    	
//    
//    
//}
