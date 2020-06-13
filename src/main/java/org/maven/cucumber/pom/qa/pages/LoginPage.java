package org.maven.cucumber.pom.qa.pages;

import org.apache.tools.ant.property.GetProperty;
import org.maven.cucumber.pom.qa.util.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

	@FindBy(className = "mailicon")
	WebElement rediffmailIcon;
	
	@FindBy(id = "login1")
	WebElement email;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(name = "proceed")
	WebElement loginBtn;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyLoginPageTitle() {
		return driver.getTitle();
	}

	public HomePage login(String uname, String pswd) {
		rediffmailIcon.click();
		email.sendKeys(uname);
		password.sendKeys(pswd);
		return new HomePage();
	}
}
