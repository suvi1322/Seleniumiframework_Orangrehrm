package ChildWindow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://demo.automationtesting.in/Frames.html");
		//frame switching by index
		d.switchTo().frame(0);
		//frame switching by name or id
//		d.switchTo().frame("singleframe");
		//frame switching by frame element
//		WebElement frame=d.findElement(By.cssSelector("[src=\"SingleFrame.html\"]"));
//		d.switchTo().frame(frame);
		d.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("Hello");
	}

}
