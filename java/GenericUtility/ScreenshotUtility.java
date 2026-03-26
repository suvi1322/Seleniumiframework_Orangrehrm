package GenericUtility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility {
	//capture web page
	public String captureScreenShot(WebDriver d,String testname) {
		//Creating a method for a time-stamp
		String time=new SimpleDateFormat("yyyy-MM-dd[hh-mm-ss]").format(new Date());
		String path="./Reports/"+testname+"_"+time+".png";
		TakesScreenshot ts=(TakesScreenshot) d;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		try {
			File perm=new File(path);
			FileHandler.copy(temp, perm);
			System.out.println(path);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return path;
	}
	//Capture web Element
	public String captureScreenShot(WebElement element ,String Elementname) {
		String time=new SimpleDateFormat("yyyy-mm-dd[hh-mm-ss]").format(new Date());
		String path="./Reports/"+Elementname+"_"+time+".png";
		File temp=element.getScreenshotAs(OutputType.FILE);
		try {
			File perm=new File(path);
			FileHandler.copy(temp, perm);
			System.out.println(path);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return path;
		
	}
	
}
