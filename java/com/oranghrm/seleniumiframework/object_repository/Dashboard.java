package com.oranghrm.seleniumiframework.object_repository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	WebDriver d;
	public Dashboard(WebDriver d) {
		this.d=d;
		PageFactory.initElements(d, this);
	}
	@FindBy(linkText="PIM")
	WebElement pim;
	
	public WebElement getPim() {
		return pim;
	}

	public void setPim() {
		getPim().click();
	}
	@FindBy(css="[class=\"oxd-userdropdown\"]")
	WebElement logoutdrop ;

	public WebElement getLogoutdrop() {
		return logoutdrop;
	}

	public void setLogoutdrop() {
		getLogoutdrop().click();
	}
	public void pim() {
		setPim();
		setLogoutdrop();
	}
	
	

}
