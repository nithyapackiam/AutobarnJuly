
package org.Stepdefinition;

import java.util.List;
import java.util.Map;
import java.io.IOException;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

import cucumber.api.java.en.*;

public class StepDefinition extends BaseClass{
	
	
	@Given("user should open the chrome browser and launch the url--due to hooks before annotation")
	public void user_should_open_the_chrome_browser_and_launch_the_url_due_to_hooks_before_annotation() {
	    browserlaunch();
	    maxWindow();
	    launchurl("https://www.autobarn.net/");
	}

	@When("user should enter invalid username and the invalid password")
	public void user_should_enter_invalid_username_and_the_invalid_password() {
	   
		   LoginPojo l=new LoginPojo();

		   WebElement txtEmail = l.getTxtEmail();
		   txtEmail.sendKeys("nithya@123");
		   WebElement txtPass = l.getTxtPass();
		   txtPass.sendKeys("12345678");
		
	}

	@When("user should click login button")
	public void user_should_click_login_button() throws InterruptedException {
	   LoginPojo l=new LoginPojo();
	   WebElement btnlog = l.getSubmit();
		btnlog.click();
		Thread.sleep(1000);
	}

	@When("user should get the title of the webpage")
	public void user_should_get_the_title_of_the_webpage() {
		String title = driver.getTitle();	   
		System.out.println(title);
	}
	
	@When("you should click the signin button")
	public void you_should_click_the_signin_button() throws InterruptedException {
		   LoginPojo l=new LoginPojo();
WebElement signIn = l.getSignIn();
	signIn.click();
	Thread.sleep(1000);
	}
	


	@Then("validate user should navigate to incorrect credential page")
	public void validate_user_should_navigate_to_incorrect_credential_page() {
	   
		   
		String actual = driver.getCurrentUrl();
		Assert.assertTrue(actual.contains("login"));
		System.out.println("Passed");
		
	}
//Scenario Outline
	
	@When("user should enter valid username {string} and invalid password{string}")
	public void user_should_enter_valid_username_and_invalid_password(String n, String p) {
	    
		LoginPojo l=new LoginPojo();

		   WebElement txtEmail = l.getTxtEmail();
		   txtEmail.sendKeys(n);
		   WebElement txtPass = l.getTxtPass();
		   txtPass.sendKeys(p);

	}

	@When("user should click button")
	public void user_should_click_button() throws InterruptedException {
		LoginPojo l=new LoginPojo();
		   WebElement btnlog = l.getSubmit();			
		   btnlog.click();
			Thread.sleep(1000);
	    
	}

	@When("you should get the current url of the webpage")
	public void you_should_get_the_current_url_of_the_webpage() {
	   
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
	}
// 1D---List
	@When("You should enter invalid username and valid Password")
	public void you_should_enter_invalid_username_and_valid_Password(io.cucumber.datatable.DataTable d1) {
	
		List<String> li = d1.asList();
		String username = li.get(2);
		String password = li.get(4);
			
		LoginPojo l=new LoginPojo();
		   WebElement txtEmail = l.getTxtEmail();
		   txtEmail.sendKeys(username);
		   WebElement txtPass = l.getTxtPass();
		   txtPass.sendKeys(password);

	}
//2D---List
	@When("You should enter invalid username value and invalid Password")
	public void you_should_enter_invalid_username_value_and_invalid_Password(io.cucumber.datatable.DataTable d2) {
	    	
	
	List<List<String>> l2 = d2.asLists();
	String username = l2.get(0).get(4);
	String password = l2.get(1).get(2);
	LoginPojo l=new LoginPojo();
	   WebElement txtEmail = l.getTxtEmail();
	   txtEmail.sendKeys(username);
	   WebElement txtPass = l.getTxtPass();
	   txtPass.sendKeys(password);

	
	}

	// 1D---Map
	@When("Enter the invalid username and invalid Password")
	public void enter_the_invalid_username_and_invalid_Password(io.cucumber.datatable.DataTable d3) {
	    	
	Map<String, String> m = d3.asMap(String.class, String.class);
	String username = m.get("mobile");
	String password = m.get("laptop");
	
	LoginPojo l=new LoginPojo();
	   WebElement txtEmail = l.getTxtEmail();
	   txtEmail.sendKeys(username);
	   WebElement txtPass = l.getTxtPass();
	   txtPass.sendKeys(password);

	
	}

	//2D---Map
	@When("You should enter the invalid username and invalid Password")
	public void you_should_enter_the_invalid_username_and_invalid_Password(io.cucumber.datatable.DataTable d4) {
	

		List<Map<String, String>> mp = d4.asMaps();
		String username = mp.get(0).get("test");
		String password = mp.get(1).get("name");
		
		LoginPojo l=new LoginPojo();
		   WebElement txtEmail = l.getTxtEmail();
		   txtEmail.sendKeys(username);
		   WebElement txtPass = l.getTxtPass();
		   txtPass.sendKeys(password);

	}


}
