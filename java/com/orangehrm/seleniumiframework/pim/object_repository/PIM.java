package com.orangehrm.seleniumiframework.pim.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIM {
	WebDriver d;
	public PIM(WebDriver d){
		PageFactory.initElements(d, this);
	}
	@FindBy(xpath="//span[text()='Configuration ']/..//i")
	private WebElement config;
	@FindBy(linkText="Termination Reasons")
	private WebElement termination;
	@FindBy(css="[class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")
	private WebElement add;
	@FindBy(xpath="//label[text()='Name']/../../..//input")
	private WebElement reason;
	@FindBy(css="[type=\"submit\"]")
	private WebElement save;
	public WebElement getConfig() {
		return config;
	}
	public void setConfig() {
		getConfig().click();
	}
	public WebElement getTermination() {
		return termination;
	}
	public void setTermination() {
		getTermination().click();
	}
	public WebElement getAdd() {
		return add;
	}
	public void setAdd() {
		getAdd().click();
	}
	public WebElement getReason() {
		return reason;
	}
	public void setReason(String reason) {
		getReason().sendKeys(reason);
	}
	public WebElement getSave() {
		return save;
	}
	public void setSave() {
		getSave().click();
	}
	

}
