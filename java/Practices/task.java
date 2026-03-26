package Practices;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class task {
	@FindAll({@FindBy(name="username"),@FindBy(name="user-name")})
	WebElement ele;

	public WebElement getEle() {
		return ele;
	}

	public void setEle(String ele) {
		getEle().sendKeys(ele);
	}
	@FindAll({@FindBy(name="password"),@FindBy(name="password")})
	WebElement pass;
	
	
	

}
