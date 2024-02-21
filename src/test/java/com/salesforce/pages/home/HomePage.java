package com.salesforce.pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesforce.pages.base.BasePage;

public class HomePage extends BasePage {
	
	@FindBy(id="userNav-arrow") WebElement userMenuDropDown;
	@FindBy(xpath="//a[text()='Logout']") WebElement logOut;
	@FindBy(xpath="//a[text()='Leads']") WebElement LeadsTab;
	@FindBy(xpath="//a[text()='Contacts']") WebElement contactTab;
	
	

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public void ClickdropDown() {
		clickElement(userMenuDropDown, "UserMenuDropDown");
	}
	
	public void clickLogOut() {
		clickElement(logOut, "logOutLink");
	}
	
	public void clicktab() {
		clickElement(LeadsTab, "click leadsTab");
	}
	
	public void clickContactTab() {
		clickElement(contactTab, "contact Tab Button");
	}
	
}
