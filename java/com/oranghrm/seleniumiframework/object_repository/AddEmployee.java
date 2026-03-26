package com.oranghrm.seleniumiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployee {
	WebDriver d;
	public AddEmployee(WebDriver d) {
		this.d=d;
		PageFactory.initElements(d, this);
	}
	@FindBy(name="firstName")
	WebElement fn;
	public WebElement getFn() {
		return fn;
	}
	public void setFn(String fn) {
		getFn().sendKeys(fn);
	}
	@FindBy(name="middleName")
	WebElement mn;
	public WebElement getMn() {
		return mn;
	}
	public void setMn(String mn) {
		getMn().sendKeys(mn);
	}
	@FindBy(name="lastName")
	WebElement ln;
	public WebElement getLn() {
		return ln;
	}
	public void setLn(String ln) {
		getLn().sendKeys(ln);
	}
	@FindBy(xpath="//label[text()='Employee Id']/../../..//input")
	WebElement id;
	public WebElement getId() {
		return id;
	}
	public void setId(String id) {
		getId().sendKeys(id);
	}
	@FindBy(css="[class=\"oxd-switch-input oxd-switch-input--active --label-right\"]")
	WebElement createlogin;
	public WebElement getCreatelogin() {
		return createlogin;
	}
	public void setCreatelogin() {
		getCreatelogin().click(); 
	}
	@FindBy(xpath="//label[text()='Username']/../../..//input")
	WebElement user;
	public WebElement getUser() {
		return user;
	}
	public void setUser(String user) {
		getUser().sendKeys(user);
	}
	@FindBy(xpath="(//input[@type=\"password\"])[1]")
	WebElement pass;
	public WebElement getPass() {
		return pass;
	}
	public void setPass(String pass) {
		getPass().sendKeys(pass);
	}
	@FindBy(xpath="(//input[@type=\"password\"])[2]")
	WebElement confirmpass;
	public WebElement getConfirmpass() {
		return confirmpass;
	}
	public void setConfirmpass(String confirmpass) {
		getConfirmpass().sendKeys(confirmpass);
	}
	@FindBy(css="[type=\"submit\"]")
	WebElement save;
	
	public WebElement getSave() {
		return save;
	}
	public void setSave() {
		getSave().click();
	}
	
	public void Enter(String fn,String mn,String ln,String id) {
		setFn(fn);
		setMn(mn);
		setLn(ln);
		setId(id);
		
   }
	public void clicks() {
		setCreatelogin();
	}
	public void user(String user, String pass, String comfirmpass) {
		setUser(user);
		setPass(pass);;
		setConfirmpass(comfirmpass);
	}
	public void save() {
		setSave();
	}
	
	
	

}
