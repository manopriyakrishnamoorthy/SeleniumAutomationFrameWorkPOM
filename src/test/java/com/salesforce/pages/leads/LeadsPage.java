package com.salesforce.pages.leads;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesforce.pages.base.BasePage;

public class LeadsPage extends BasePage {
     @FindBy(id="fcf") WebElement dropdwonLeads;
     @FindBy(xpath="//input[@value=' Go! ']") WebElement Go;
     @FindBy(xpath="//input[@value=' New ']") WebElement newButton;
     @FindBy(id="name_lastlea2") WebElement lastname;
     @FindBy(id="lea3") WebElement company;
     @FindBy(id="//input[@name='save']") WebElement saveButton;
     
	
	
	public LeadsPage(WebDriver driver) {
		super(driver);
	}
	
	public void dropdownLeads() {
		clickElement(dropdwonLeads, "LeadsDropDown");
	}
	
	public String getLeadsdropDownText() {
		return getTextFromElement(dropdwonLeads, "dropDownLeads");
	}
	
	public void selectOption() {
		select(dropdwonLeads, "Today's Leads", "view dropDown");
	}
	
	public void clickGo() {
		clickElement(Go, "go button");
	}
	
	public void clickNew() {
		clickElement(newButton, "new button");
	}
	
	public void enterLastName(String data) {
		enterText(lastname, data, "lastName field");
	}
	
	public void enterCompany(String data) {
		enterText(company, data, "Company name");
	}
	
	public void clickSave() {
		clickElement(saveButton, "save button");
	}
	
	public void cleartext() {
		clearElement(lastname, "last name");
	}
	public void clearTxt() {
		clearElement(company, "company");
	}
	
	
}
