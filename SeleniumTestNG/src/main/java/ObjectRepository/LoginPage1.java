package ObjectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage1 {
	WebDriver d;
	public LoginPage1(WebDriver d) {
		this.d=d;
		PageFactory.initElements(d, this);
	}

	@FindBy(id="user-name")
	private WebElement username;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login-button")
	WebElement login;
	@FindBy(id="react-burger-menu-btn")
	WebElement burger;
	@FindBy(id="logout_sidebar_link")
	WebElement logout;
	public WebElement getUsername() {
		return username;
	}

	public void setUsername(String un) {
		getUsername().sendKeys(un);
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String pwd) {
		getPassword().sendKeys(pwd);;
	}
	
	public WebElement getLogin() {
		return login;
	}

	public void setLogin() {
		getLogin().click();
	}

	public WebElement getBurger() {
		return burger;
	}

	public void setBurger() {
		 getBurger().click();
	}

	public WebElement getLogout() {
		return logout;
	}

	public void setLogout() {
		getLogout().click();
	}

	//business logic to login
	public void currenturl(String url) {
		d.get(url);
	}
	
	public void enterUsername(String un) {
		username.sendKeys(un);
	}
	public void enterPass(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickLogin() {
		login.click();
	}
	public void logout() {
		burger.click();
		logout.click();
		
	}
	

	
	
	

}
