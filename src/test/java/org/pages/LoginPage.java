package org.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(xpath = "//b[text()='Invalid Login details or Your Password might have expired. ']")
	private WebElement invaliderrormsg;
	
	@FindBy(id = "username")
	private WebElement txtusername;

		@FindBy(id = "password")
	private WebElement txtpassword;

	@FindBy(id = "login")
	private WebElement btnlogin;
	
	public WebElement getInvaliderrormsg() {
		return invaliderrormsg;
	}

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public void Login(String username, String password) {

		elementSendKeys(getTxtusername(), username);
		elementSendKeys(getTxtpassword(), password);
		click(getBtnlogin());
	}

	public void loginWithEnter(String username, String password) throws AWTException {

		elementSendKeys(getTxtusername(), username);
		elementSendKeys(getTxtpassword(), password);

		Robot robut = new Robot();

		robut.keyPress(KeyEvent.VK_ENTER);
		robut.keyRelease(KeyEvent.VK_ENTER);

	}

}
