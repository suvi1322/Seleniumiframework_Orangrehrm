package navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateForwardandBack {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.myntra.com/");
		Thread.sleep(2000);
		d.navigate().to("https://www.bigbasket.com/");
		Thread.sleep(2000);
		d.navigate().to("https://www.ajio.com/b/ajio");
		Thread.sleep(2000);
		d.navigate().back();
		System.out.println(d.getTitle());
		Thread.sleep(2000);
		d.navigate().forward();
		System.out.println(d.getTitle());
		
		

	}

}
