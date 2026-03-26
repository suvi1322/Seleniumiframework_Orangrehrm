package Assertions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemHardAssert {
	@Test
	public void testMethod() {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.google.com/");
		String ExpectedTittle="Google";
		String ActualTittle=d.getTitle();
		//Hard Assertion
		Assert.assertEquals(ExpectedTittle.equals(ActualTittle), true);
		
	}

}
