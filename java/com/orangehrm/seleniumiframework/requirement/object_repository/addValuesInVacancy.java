package com.orangehrm.seleniumiframework.requirement.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addValuesInVacancy {
	WebDriver d;
	public addValuesInVacancy(WebDriver d){
		PageFactory.initElements(d, this);
	}
	@FindBy(xpath="//label[text()='Vacancy Name']/../../..//input")
	private WebElement name;
	@FindBy(xpath="//label[text()='Job Title']/../../..//i")
	WebElement job;
	@FindBy(xpath="//label[text()='Description']/../../..//textarea")
	WebElement description;
	@FindBy(xpath="//label[text()='Hiring Manager']/../../..//input")
	WebElement manager;
	@FindBy(xpath="//label[text()='Number of Positions']/../../..//input")
	WebElement positions;
	@FindBy(css="[type='submit']")
	WebElement save;
	
	//getter and setter
	public WebElement getName() {
		return name;
	}
	public void setName(String name) {
		getName().sendKeys(name);
	}
	public WebElement getJob() {
		return job;
	}
	
	public WebElement getDescription() {
		return description;
	}
	public void setDescription(String description) {
		getDescription().sendKeys(description);
	}
	public WebElement getManager() {
		return manager;
	}
	public void setManager(String manager) {
		getManager().sendKeys(manager);
	}
	public WebElement getPositions() {
		return positions;
	}
	public void setPositions(String positions) {
		getPositions().sendKeys(positions);
	}
	
	public WebElement getSave() {
		return save;
	}
	public void setSave() {
		getSave().click();
	}
	public void ClickSave() {
		setSave();
	}
	

}
