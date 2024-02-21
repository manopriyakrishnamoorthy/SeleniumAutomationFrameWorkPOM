package com.salesforce.pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesforce.pages.base.BasePage;

public class LoginPage extends BasePage {
	
	@FindBy(id="username") WebElement userNameElement;
	@FindBy(id="password") WebElement passwordElement;
	@FindBy(xpath="//input[@id='Login']") WebElement clickbutton;
	@FindBy(css="//div[text()='Please enter your password.']") WebElement ErrMsg;
	@FindBy(xpath="//input[@id='rememberUn']") WebElement clickRememberMeButton;
	//@FindBy(xpath="//span[text()='priya@tekarch.com']")WebElement userNameTextBoxField;
	//idcard-identity
	@FindBy(xpath="//span[@id='idcard-identity']")WebElement userNameTextBoxField;
	@FindBy(xpath="//a[text()='Forgot Your Password?']") WebElement forgotPassword;
	@FindBy(xpath="//h1[text()='Forgot Your Password']") WebElement forpageHeader;
	@FindBy(xpath="//input[@id='un']") WebElement forgotPageUserName;
	@FindBy(xpath="//input[@id='continue']") WebElement continueButton;
	@FindBy(xpath="//h1[text()='Check Your Email']") WebElement ErrorEmailHeader;
	@FindBy(xpath="//div[@id='error']") WebElement InvalidErrorMsg;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void enterUserName(String data) {
		enterText(userNameElement, data, "username field");
	}
	
	public void clearPassword() {
		clearElement(passwordElement, "password");
	}
	
	public void enterPassword(String data) {
		enterText(passwordElement, data, "password field");
	}
	
	public void clickLoginButton() {
		clickElement(clickbutton, "loginButton");
	}
	
	public String getLoginErrorMsg() {
		return getTextFromElement(ErrMsg, "login errorMessage");
	}
	
	public void clickRememberMeButton() {
		clickElement(clickRememberMeButton, "RememberMeButton");
	}
	
	public boolean isUserNameDisplayed() {
		return isDisplayed(userNameTextBoxField, "userName TextBoxField");
	}
	
	public String getUserNameFieldText() {
		return getTextFromElement(userNameTextBoxField, "userNamefiledtext");
	}
	
	public void forgetPasswordLink() {
		clickElement(forgotPassword, "forgotpasswordlink");
	}
	
	public String getForgotPasswordMsg() {
		return getTextFromElement(forpageHeader, "forgotPageMsg");
	}
	
	public void enterUserNameInForgotPage(String data) {
		enterText(forgotPageUserName, data , "userName");
	}
	
	public void clickContinueButton() {
		clickElement(continueButton, "continue");
	}
	
	public String getEmailError() {
		return getTextFromElement(ErrorEmailHeader, "EmailError");
	}
	
	public String getInvalidLoginErrorMsg() {
		return getTextFromElement(InvalidErrorMsg, "LoginErrorMsg");
	}
}


