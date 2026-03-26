package com.orangehrm.seleniumiframework.pim.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dash {
	WebDriver d;
	public Dash (WebDriver d){
		PageFactory.initElements(d, this);
	}

	@FindBy(xpath="//a[@class=\"oxd-main-menu-item\"]/../../../..//span[text()='PIM']")
	private WebElement pim;

	public WebElement getPim() {
		return pim;
	}

	public void setPim() {
		 getPim() .click();
	}
	@FindBy(css="[class=\"oxd-userdropdown\"]")
	private WebElement logoutdrop ;

	public WebElement getLogoutdrop() {
		return logoutdrop;
	}
	public void setLogoutdrop() {
		getLogoutdrop().click();
	}
	@FindBy(linkText="Logout")
	private WebElement logout;
	public WebElement getLogout() {
		return logout;
	}

	public void setLogout() {
		getLogout().click();
	}
	public void logOutClick() {
		setLogoutdrop();
		setLogout();
	}
	
}
