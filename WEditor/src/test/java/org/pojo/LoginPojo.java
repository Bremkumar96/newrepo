package org.pojo;
import org.base.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {

	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (id = "email")
	private WebElement txtUser;
	
	@FindBy (id = "password")
	private WebElement txtPassword;
	
	@FindAll({
		@FindBy(id = "u_0_5_LA"),
		@FindBy(name = "login")
	})
	private WebElement loginButton;
	
	@FindBy (id = "uncontrolled-native")
	private WebElement darkMode;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getDarkMode() {
		return darkMode;
	}

}
