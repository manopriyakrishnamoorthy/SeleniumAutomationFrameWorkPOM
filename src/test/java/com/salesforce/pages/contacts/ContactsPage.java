package com.salesforce.pages.contacts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import com.salesforce.pages.base.BasePage;

public class ContactsPage extends BasePage {
	@FindBy(xpath="//input[@value=' New ']") WebElement newButton;
	@FindBy(xpath="//input[@id='name_lastcon2']") WebElement lastName;
	@FindBy(xpath="//input[@id='con4']") WebElement Account;
	@FindBy(xpath="//input[@value=' Save ']") WebElement saveButton;
	@FindBy(xpath="//a[text()='Create New View']") WebElement ClickCreateNewView;
	@FindBy(xpath="//input[@id='fname']") WebElement viewName;
	@FindBy(xpath="//input[@id='devname']") WebElement uniqViewName;
	@FindBy(xpath="//input[@value=' Save ']") WebElement save; 
	@FindBy(xpath="//select[@id='hotlist_mode']") WebElement recentlyView;
	@FindBy(xpath="//select[@id='fcf']") WebElement contactDropDown;
	@FindBy(xpath="//a[text()='geeta']") WebElement contactName;
	@FindBy(xpath="//a[text()='Create New View']") WebElement viewpage;
	@FindBy(xpath="//input[@id='devname']") WebElement uniqViewName1;
	@FindBy(xpath="//input[@value=' Save ']") WebElement saveButton1;
	@FindBy(xpath="//div[text()=' You must enter a value']") WebElement ErrorMsg;
	@FindBy(xpath="//input[@value='Cancel']") WebElement cancel;
	@FindBy(xpath="//input[@value='Save & New']") WebElement saveNew;
	
	public ContactsPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickNewButton() {
		clickElement(newButton, "click new button");
	}
	
	public void enterLastName(String data) {
		enterText(lastName, data, "last name");
	}
	
	public void enterAccount(String data) {
		enterText(Account, data, "account name");
	}
	
	public void clickSaveButton() {
		clickElement(saveButton, "save button");
	}
	
	public void clickCreateViewButton() {
		clickElement(ClickCreateNewView, "create new view");
	}
	
	public void enterViewName(String data) {
		enterText(viewName, data, "view name");
	}
	
	public void enterUniqViewName(String data) {
		enterText(uniqViewName, data, "uniq view name");
	}
	
	public void save() {
		clickElement(save, "save button");
	}
	
	public void clickRecentlyViewedDropDownSelector() {
		select(recentlyView, "Recently Created", "recently created");
	}
	
	public void clickContactDropdown() {
		clickElement(contactDropDown, "contact dropdown");
	}
	
	public void selectmyContact() {
		select(contactDropDown, "My Contacts", "my contacts from dropdown");
	}
	
	public void clickContactName() {
		clickElement(contactName, "contact name");
	}
	
	public void clickViewNewHyperlink() {
		clickElement(viewpage, "clickView New Hyperlink");
	}
	
	public void enteruniqName(String data) {
		enterText(uniqViewName, data, "uniqview name");
	}
	
	public void clickSave() {
		clickElement(saveButton1, "save button");
	}
	
	public String getErrorMsg() {
		return getTextFromElement(ErrorMsg, "Error msg");
	}
	
	public void ClickCancelButton() {
		clickElement(cancel, "cancel button");
	}
	
	public void clickSaveNewButton() {
		clickElement(saveNew, "save and new button");
	}
}
