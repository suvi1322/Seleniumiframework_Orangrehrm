package com.oranghrm.seleniumiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver d;
	public LoginPage(WebDriver d) {
		this.d=d;
		PageFactory.initElements(d, this);
	}
	@FindBy(name="username")
	private WebElement Username;
	@FindBy(name="password")
	private WebElement Password;
	@FindBy(css="[type='submit']")
	private WebElement login;
	@FindBy(css="[class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]")
	private WebElement forget;
	@FindBy(xpath="//a[@href=\"https://www.linkedin.com/company/orangehrm/mycompany/\"]")
	private WebElement Linkdin;
	@FindBy(xpath="//a[@href=\"https://www.facebook.com/OrangeHRM/\"]")
	private WebElement Facebook;
	@FindBy(xpath="//a[@href=\"https://twitter.com/orangehrm?lang=en\"]")
	private WebElement Twitter;
	@FindBy(xpath="//a[@href=\"https://www.youtube.com/c/OrangeHRMInc\"]")
	private WebElement Youtube;
	@FindBy(linkText="OrangeHRM, Inc")
	private WebElement orange;
	public WebElement getUsername() {
		return Username;
	}
	public void setUsername(String Username) {
		getUsername().sendKeys(Username);
	}
	public WebElement getPassword() {
		return Password;
	}
	public void setPassword(String Password) {
		getPassword().sendKeys(Password);
	}
	public WebElement getLogin() {
		return login;
	}
	public void setLogin() {
		getLogin().click();
	}
	public WebElement getForget() {
		return forget;
	}
	public void setForget() {
		getForget().click();
	}
	public WebElement getLinkdin() {
		return Linkdin;
	}
	public void setLinkdin() {
		getLinkdin().click();
	}
	public WebElement getFacebook() {
		return Facebook;
	}
	public void setFacebook() {
		getFacebook().click();
	}
	public WebElement getTwitter() {
		return Twitter;
	}
	public void setTwitter() {
		getTwitter().click();
	}
	public WebElement getYoutube() {
		return Youtube;
	}
	public void setYoutube() {
		getYoutube().click();
	}
	public WebElement getOrange() {
		return orange;
	}
	public void setOrange() {
		getOrange().click();
	}
	//buisness logic
	public void EnterCredentials(String Username,String Password) {
		setUsername(Username);
		setPassword(Password);
		
		
	}
	public void log() {
		setLogin();
	}
	
	

}
