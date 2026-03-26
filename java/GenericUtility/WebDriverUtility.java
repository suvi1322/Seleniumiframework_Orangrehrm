package GenericUtility;


import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	WebDriver d;
	WebDriverWait wait;
	public WebDriverUtility(WebDriver d) {
		this.d=d;
	}
	//Manage
	//maximize
	public void configMaximizeBrowswer() {
		d.manage().window().maximize();
	}
	//minimize
	public void configMinimizeBrowswer() {
		d.manage().window().minimize();
	}
	//fullscreen
	public void configFullscreenBrowswer() {
		d.manage().window().fullscreen();
	}
	//getSize
	public Dimension FetchBroswerSize(){
		Dimension diemension= d.manage().window().getSize();
		return diemension;
	//Setsize	
	}
	public void configBrowserSize(int width,int height) {
		d.manage().window().setSize(new Dimension(width,height));
		
	}
	//getPosition
	public Point fetchBrowserCoordinates() {
		Point p=d.manage().window().getPosition();
		return p;
	}
	//SetPosition
	public void configBroswerPosition(int x,int y) {
		d.manage().window().setPosition(new Point(x,y));
	}
	//navigate
	//navigate to
	public void navigatetoApplication(String fullURl) {
		d.navigate().to(fullURl);
	}
	//forward
	public void navigateForward() {
		d.navigate().forward();
	}
	//backward
	public void navigateBack() {
		d.navigate().back();
	}
	//refreah
	public void refreshCurrentPage() {
		d.navigate().refresh();
	}
	//Get
	public void EnterUrl(String url) {
		d.get(url);
	}
	//Get tittle
	public String fetchApplicationTittle() {
		String tittle=d.getTitle();
		return tittle;
	}
	//Get current url
	public String fetchApplicationCurrentURL() {
		String url=d.getCurrentUrl();
		return url;
	}
	//close
	public void ClosingBrowserTab() {
		d.close();
	}
	public void QuitBrowserTab() {
		d.quit();
	}
	//timeouts
	//implicitWaits
	public void implicitWaitforBrowser(long timeInSeconds) {
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeInSeconds));
	}
	//explicit wait
	//elementtobeClickable
	public void ExplicitWaitForBrowser(Long Seconds,WebElement element ) {
		WebDriverWait wait=new WebDriverWait(d, Duration.ofSeconds(Seconds));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	//visibilityOf
	public void ExplicitWaitForBrowserTab(Long Seconds,WebElement element ) {
		WebDriverWait wait=new WebDriverWait(d, Duration.ofSeconds(Seconds));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	//Popups
	//Alert
	public void aClcikOnAccept() {
		d.switchTo().alert().accept();
	}
	//comfirmation
	public void ClickOnDismiss() {
		d.switchTo().alert().dismiss();
	}
	//Prompt
	public void TypeMessageInJavascriptPopup(String text) {
		d.switchTo().alert().sendKeys(text);
	}
	public String PrintJavaScriptPopupMessage() {
		String message=d.switchTo().alert().getText();
		return message;
	}
	//ChildWindowSwitching
	public void ChildWindowByTittle(String childApllicationTittle) {
		Set<String> window=d.getWindowHandles();
		String parent=d.getWindowHandle();
		window.remove(parent);

		for(String child:window) {
			d.switchTo().window(child);
			String tittle=d.getTitle();
			if(tittle.contains(childApllicationTittle)) {
				break;
			}
		
			
		}
		
	}
	public void ChildWindowByURL(String childApllicationURL) {
		Set<String> window=d.getWindowHandles();
		String parent=d.getWindowHandle();
		window.remove(parent);

		for(String child:window) {
			d.switchTo().window(child);
			String URL=d.getCurrentUrl();
			if(URL.contains(childApllicationURL)) {
				break;
			}
		
			
		}
		
	}
	
	//iFrame
	//frames
	public void switchtoFrameByIndex(int indexno) {
		d.switchTo().frame(indexno);
		
	}
	public void switchtoFrameByIdOrName(int IdOrName) {
		d.switchTo().frame(IdOrName);
		
	}
	public void switchtoFrameByFrameElements(int FrameElement) {
		d.switchTo().frame(FrameElement);
		
	}
	public void switchBacktheControlToPreviousFrame() {
		d.switchTo().parentFrame();
		
	}
	public void switchBacktheControlToMainPage() {
		d.switchTo().defaultContent();
		
	}
	

}
