package task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class test1 {
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

	public WebElement getPass() {
		return pass;
	}

	public void setPass(String pass) {
		 getPass().sendKeys(pass);
	}
	@FindAll({@FindBy(css="[type=\"submit\"]"),@FindBy(css="[type=\"submit\"]")})
	WebElement login;

	public WebElement getLogin() {
		return login;
	}

	public void setLogin() {
		 getLogin().click();
		
	}
	

}
