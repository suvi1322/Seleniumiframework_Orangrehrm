package com.orangehrm.seleniumiframework.requirement.object_repository;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class recruitment {
	WebDriver d;
	public recruitment(WebDriver d){
		PageFactory.initElements(d, this);
	}
 @FindBy(css="[class=\"oxd-icon bi-plus oxd-button-icon\"]")
 private WebElement add;

public WebElement getAdd() {
	return add;
}

public void setAdd() {
	getAdd().click();
}

 
}
