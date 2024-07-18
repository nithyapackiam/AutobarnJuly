package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{
	
	
	public LoginPojo() {
		PageFactory.initElements(driver,this);

	}
	
	@FindBy(xpath="//a[text()='Sign In']")
	private WebElement signIn;
	
	@FindBy(xpath="//input[@id='pdLogin-email']")
	private WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='pdLogin-password']")
	private WebElement txtPass;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	
	
	@FindBy(xpath="//a[text()='Forgot your Password?']")
	private WebElement forgot;
	
	
	@FindBy(xpath="//input[@id='pdRetrieveEmail']")
	private WebElement retrieveEmail;
	
	@FindBy(xpath="//input[@value='Send Password Reset Email']")
	private WebElement emailClick;
	
	@FindBy(xpath="(//a[text()='My Account'])[1]")
	private WebElement accClick;
	
	@FindBy(xpath="//a[text()='Create an Account']")
	private WebElement creAcc;
	
	@FindBy(xpath="//input[@id='pdReg-firstName']")
	private WebElement fName;
	
	@FindBy(xpath="//input[@id='pdReg-lastName']")
	private WebElement lName;
	
	@FindBy(xpath="//input[@id='pdReg-email']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@id='pdReg-password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='Create My Account']")
	private WebElement creAccClick;
	
	@FindBy(xpath="//input[@class='searchIn']")
	private WebElement searchbtn;
	
	@FindBy(xpath="//input[@class='searchGo']")
	private WebElement gobtn;

	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getForgot() {
		return forgot;
	}

	public WebElement getRetrieveEmail() {
		return retrieveEmail;
	}

	public WebElement getEmailClick() {
		return emailClick;
	}

	public WebElement getAccClick() {
		return accClick;
	}

	public WebElement getCreAcc() {
		return creAcc;
	}

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getCreAccClick() {
		return creAccClick;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getGobtn() {
		return gobtn;
	}
	

	
	
	
}
	
	

	