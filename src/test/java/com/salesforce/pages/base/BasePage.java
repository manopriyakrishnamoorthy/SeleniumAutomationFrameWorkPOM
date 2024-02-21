package com.salesforce.pages.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
// getTitle, switchToAlert acceptAlert DismissAlert getTextFromAlert
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;

import com.google.common.io.Files;
import com.salesforce.utilities.ExtentReportsUtility;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(com.salesforce.utilities.ListenerUtility.class)

public class BasePage {
	public WebDriver driver = null;
	protected Wait<WebDriver> wait = null;
	protected Logger baseTestlog=LogManager.getLogger();
	protected ExtentReportsUtility extentReport=ExtentReportsUtility.getInstance();

	public BasePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterText(WebElement element, String data, String objectName) {
		if (element.isDisplayed()) {
			element.clear();
			element.sendKeys(data);
			baseTestlog.info("data is entered in " + objectName );
			extentReport.logTestInfo("data is entered in " + objectName );
			
		} else {
			baseTestlog.info(objectName + " element is not displayed");
		}
	}
	
	public void clickElement(WebElement ele, String objectName) {
		if (ele.isEnabled()) {
			ele.click();
			baseTestlog.info(objectName + "button is clicked");
			extentReport.logTestInfo(objectName + "button is clicked");
			
		} else {
			baseTestlog.info(objectName+" element is not enabled");
			
		}
	}
	
	public String getTextFromElement(WebElement ele, String objectName) {
		String data = ele.getText();
		baseTestlog.info("text is extracted from "+objectName);
		extentReport.logTestInfo("text is extracted from "+objectName);
		return data;
	}
	
	

	public void maximiseBrowser() {
		driver.manage().window().maximize();
		baseTestlog.info("browser window has maximized");
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void refreshPage() {
		driver.navigate().refresh();
		baseTestlog.info("page is refreshed");

	}

	public void clearElement(WebElement ele, String ObjectName) {
		if (ele.isDisplayed()) {
			ele.clear();
			baseTestlog.info(ObjectName + " is cleared");
		} else {
			baseTestlog.info(ObjectName + " element is not displayed");
		}
	}
	
	public WebDriver getDriverInstance() {
		return this.driver;
	}
	
	public boolean isDisplayed(WebElement element, String ObjectName) {
		if(element.isDisplayed()) {
			baseTestlog.info(ObjectName + " is displayed");
	    	return true;
	    }
	    else {
	    	baseTestlog.info(ObjectName + " is not displayed");
	    	return false;
	    }
	}

	public void select(WebElement element, String visibleText,String ObjectName) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
		baseTestlog.info("option : " + visibleText + " is selected " + ObjectName);
	}
	
	
}
