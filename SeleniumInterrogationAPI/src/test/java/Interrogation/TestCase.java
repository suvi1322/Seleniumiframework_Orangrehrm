package Interrogation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
//		String parentID=d.getWindowHandle();
//		System.out.println("ParentID:"+parentID);
//		Set<String> all=d.getWindowHandles();
//		System.out.println("BOTH Parent and Child:"+all);
//		String FB="";
//		d.findElement(By.partialLinkText("Facebook")).click();
//		Set<String> face=d.getWindowHandles();
//		face.remove(parentID);
//		for(String f:face) {
//			FB=f;
//			System.out.println("Facebook:"+FB);
//		}
//		String T="";
//		d.findElement(By.partialLinkText("Twitter")).click();
//		Set<String> Twit=d.getWindowHandles();
//		Twit.remove(parentID);
//		Twit.remove(FB);
//		for(String TT:Twit) {
//			T=TT;
//			System.out.println("Twitter:"+T);
//		}
		d.findElement(By.partialLinkText("Facebook")).click();
		Thread.sleep(2000);
		d.findElement(By.partialLinkText("Twitter")).click();
		Thread.sleep(2000);
		Set<String> All=d.getWindowHandles();
		for(String str:All) {
			d.switchTo().window(str);
			String tittle=d.getTitle();
			Thread.sleep(2000);
			System.out.println("ID"+str);
			System.out.println("Tittle"+tittle);
		}
		d.quit();
		
	
		

	}

}
