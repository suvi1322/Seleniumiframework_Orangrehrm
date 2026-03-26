package com.orangehrm.seleniumiframework.requirement.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addVacancy {
	WebDriver d;
	public  addVacancy (WebDriver d){
		PageFactory.initElements(d, this);
	}
	@FindBy(css="[class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")
	WebElement add;

	public WebElement getAdd() {
		return add;
	}

	public void addbtn() {
		getAdd().click();
	}
	
	
	

}
