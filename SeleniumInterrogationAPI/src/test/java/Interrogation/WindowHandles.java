package Interrogation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
	  WebDriver d=new ChromeDriver();
	  d.manage().window().maximize();
	  d.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
	  Thread.sleep(2000);
	  //fetching the window ID of parent widow
	  String parentID=d.getWindowHandle();
	  System.out.println("ParentID:"+parentID);
	  //click on a tab to get child window popup
	  d.findElement(By.xpath("//h2[.='Watches']/..//button")).click();
	  Thread.sleep(2000);
	  Set<String> all=d.getWindowHandles();
	  System.out.println("BOTH Parent and Child:"+all);
	  //removing the parent is from all windos
	  all.remove(parentID);
	  //child id is still in set<String>
	  System.out.println("After removing the parent ID:"+all);
	  //fecthing the child id out of the collection
	  for(String string:all) {
		  System.out.println(string);
	  }
	  Thread.sleep(2000);
	  d.quit();
	  

	}

}
