
package org.Stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

import cucumber.api.java.en.*;

public class ForgottonStep extends BaseClass {
	@Given("user should open the chrome and the url")
	public void user_should_open_the_chrome_and_the_url() {
	   
		browserlaunch();
		launchurl("https://www.autobarn.net/");
		maxWindow();
	}
	@When("click the signin button")
	public void click_the_signin_button() {
	    		LoginPojo l=new LoginPojo();
	    		WebElement signIn = l.getSignIn();
	    		signIn.click();

	}
	@When("user should click the forgotten password link")
	public void user_should_click_the_forgotten_password_link() throws InterruptedException {
	   
		LoginPojo l=new LoginPojo();
		WebElement forgot = l.getForgot();
		forgot.click();
		Thread.sleep(1000);
	}

	@When("user should enter invalid mobile number")
	public void user_should_enter_invalid_mobile_number() {
		LoginPojo l=new LoginPojo();
WebElement id = l.getRetrieveEmail();
id.sendKeys("Jeevan@1234");
	}

	@When("user should get the current url of the page")
	public void user_should_get_the_current_url_of_the_page() {

		crturl();
	
	}

	@When("user should click search button")
	public void user_should_click_search_button() throws InterruptedException{
	   
		LoginPojo l=new LoginPojo();

		WebElement submit = l.getSubmit();
		submit.click();
		Thread.sleep(2000);

	}

	@Then("validate user should navigate to password reset page")
	public void validate_user_should_navigate_to_password_reset_page() {
	    
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Selenium"));
		System.out.println("Passed");
		
		
	}



}
