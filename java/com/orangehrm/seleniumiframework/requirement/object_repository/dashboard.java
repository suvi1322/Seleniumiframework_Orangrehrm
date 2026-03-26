package com.orangehrm.seleniumiframework.requirement.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboard {
	WebDriver d;
	public dashboard (WebDriver d){
		PageFactory.initElements(d, this);
	}

	@FindBy(linkText="Recruitment")
	private WebElement recruit;

	public WebElement getRecruit() {
		return recruit;
	}

	public void setRecruit() {
		getRecruit().click();
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
