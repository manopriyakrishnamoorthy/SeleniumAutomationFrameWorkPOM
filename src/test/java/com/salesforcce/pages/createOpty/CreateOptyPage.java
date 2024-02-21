package com.salesforcce.pages.createOpty;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesforce.pages.base.BasePage;

public class CreateOptyPage extends BasePage {
	@FindBy(xpath="//a[text()='Opportunities']") WebElement opty;
	@FindBy(xpath="//*[@id=\\\"fcf\\\"]") WebElement optyDropdown;
	@FindBy(xpath="//select[@id='fcf']/option") List<WebElement> actualoptions;
	
	public CreateOptyPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickOptyLink() {
		clickElement(opty, "opty link");
	}
	
	public void clickOptyDropdown() {
		clickElement(optyDropdown, "opty dropdown");
	}
	
	public List<WebElement> getOptyOptions() {
		return actualoptions;
	}
	
	public List<String> getOptyOptionsAsText() {
		List<String> options = new ArrayList<String>();
		for(WebElement option:actualoptions) {
			//option.getText();
			options.add(option.getText());
		}
		return options;
		
	}
	

}
