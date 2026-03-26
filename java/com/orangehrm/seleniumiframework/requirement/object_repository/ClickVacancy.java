package com.orangehrm.seleniumiframework.requirement.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickVacancy {
	WebDriver d;
	public  ClickVacancy(WebDriver d){
		PageFactory.initElements(d, this);
	}
	@FindBy(linkText="Vacancies")
	WebElement vacancy;

	public WebElement getVacancy() {
		return vacancy;
	}

	public void setVacancy() {
		getVacancy().click();
	}
	
	

}
