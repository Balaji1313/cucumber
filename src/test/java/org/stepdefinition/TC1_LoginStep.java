package org.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.base.BaseClass;
import org.junit.Assert;
import org.pages.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginStep extends BaseClass{
	
	PageObjectManager pom = new PageObjectManager();
	
	

	@Given("User is on adactin hotel page")
	public void userIsOnAdactinHotelPage() throws FileNotFoundException, IOException {
		
		getDriver(getPropertyFilevalue("browserType"));
		enterUrl(getPropertyFilevalue("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
	}

	@When("User should perform Login {string},{string}")
	public void userShouldPerformLogin(String username, String password) {

		pom.getLoginPage().Login(username, password);
		
	}

	

	@When("User should perform Login {string},{string} with enter key")
	public void userShouldPerformLoginWithEnterKey(String username, String password) throws AWTException {
		
		pom.getLoginPage().loginWithEnter(username, password);
		
		
	}

	@Then("User should verify after Login error contain {string}")
	public void userShouldVerifyAfterLoginErrorContain(String error) {
		
		String invaliderror = pom.getLoginPage().getInvaliderrormsg().getText();
		
		Assert.assertTrue("ivalidlogingmsg",invaliderror.contains(error) );
		

	}

}
