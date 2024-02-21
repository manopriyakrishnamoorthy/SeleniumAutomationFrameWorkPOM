package com.salesforce.automation.scripts;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.salesforce.base.SalesforceBaseTest;
import com.salesforce.pages.contacts.ContactsPage;
import com.salesforce.pages.home.HomePage;
import com.salesforce.pages.login.LoginPage;
import com.salesforce.utilities.Constants;
import com.salesforce.utilities.PropertiesUtility;

public class ContactsModule extends SalesforceBaseTest {

	@Test
	public void TC25() throws InterruptedException {
		
		LoginPage login = new LoginPage(driver);
		String userName = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "username");
		login.enterUserName(userName);
		String password = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "password");
		login.enterPassword(password);
		login.clickLoginButton();
		HomePage home = new HomePage(driver);
		Thread.sleep(3000);
		home.clickContactTab();
		ContactsPage contacts = new ContactsPage(driver);
		String ExpectedTitle = "Contacts: Home ~ Salesforce - Developer Edition";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		Thread.sleep(3000);
		contacts.clickNewButton();
		String ExpectedTitle1 = "Contact Edit: New Contact ~ Salesforce - Developer Edition";
		String ActualTitle1 = driver.getTitle();
		Assert.assertEquals(ActualTitle1, ExpectedTitle1);
		contacts.enterLastName("geeta");
		String accountName = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "accountName");
		contacts.enterAccount(accountName);
		Thread.sleep(3000);
		contacts.clickSaveButton();
		Thread.sleep(3000);
		String ExpectedTitle2 = "Contact: geeta ~ Salesforce - Developer Edition";
		String ActualTitle2 = driver.getTitle();
		Assert.assertEquals(ActualTitle2, ExpectedTitle2);
	}
	
	@Test
	public void TC26() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		String userName = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "username");
		login.enterUserName(userName);
		String password = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "password");
		login.enterPassword(password);
		login.clickLoginButton();
		HomePage home = new HomePage(driver);
		Thread.sleep(3000);
		home.clickContactTab();
		ContactsPage contacts = new ContactsPage(driver);
		String ExpectedTitle = "Contacts: Home ~ Salesforce - Developer Edition";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		contacts.clickCreateViewButton();
		Thread.sleep(3000);
		contacts.enterViewName("ABCD");
		Random random = new Random();
		String name = "EFGH" + random.nextInt(12345) + 10000;
		contacts.enterUniqViewName(name);
		contacts.save();
		String ExpectedTitle1 = "Contacts ~ Salesforce - Developer Edition";
		String ActualTitle1 = driver.getTitle();
		Assert.assertEquals(ActualTitle1, ExpectedTitle1);
		
	}
	
	@Test
	public void TC27() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		String userName = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "username");
		login.enterUserName(userName);
		String password = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "password");
		login.enterPassword(password);
		login.clickLoginButton();
		HomePage home = new HomePage(driver);
		Thread.sleep(3000);
		home.clickContactTab();
		ContactsPage contacts = new ContactsPage(driver);
		String ExpectedTitle = "Contacts: Home ~ Salesforce - Developer Edition";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		contacts.clickRecentlyViewedDropDownSelector();
	
	}
	
	@Test
	public void TC28() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		String userName = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "username");
		login.enterUserName(userName);
		String password = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "password");
		login.enterPassword(password);
		login.clickLoginButton();
		HomePage home = new HomePage(driver);
		Thread.sleep(3000);
		home.clickContactTab();
		ContactsPage contacts = new ContactsPage(driver);
		String ExpectedTitle = "Contacts: Home ~ Salesforce - Developer Edition";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		contacts.clickContactDropdown();
		contacts.selectmyContact();
		
	}
	@Test
	public void TC29() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		String userName = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "username");
		login.enterUserName(userName);
		String password = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "password");
		login.enterPassword(password);
		login.clickLoginButton();
		HomePage home = new HomePage(driver);
		Thread.sleep(3000);
		home.clickContactTab();
		ContactsPage contacts = new ContactsPage(driver);
		String ExpectedTitle = "Contacts: Home ~ Salesforce - Developer Edition";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		contacts.clickContactName();
		String ExpectedTitle1 = "Contact: geeta ~ Salesforce - Developer Edition";
		String ActualTitle1 = driver.getTitle();
		Assert.assertEquals(ActualTitle1, ExpectedTitle1);
		
	}
	
	@Test
	public void TC30() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		String userName = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "username");
		login.enterUserName(userName);
		String password = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "password");
		login.enterPassword(password);
		login.clickLoginButton();
		HomePage home = new HomePage(driver);
		Thread.sleep(3000);
		home.clickContactTab();
		ContactsPage contacts = new ContactsPage(driver);
		String ExpectedTitle = "Contacts: Home ~ Salesforce - Developer Edition";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		contacts.clickViewNewHyperlink();
		Random random = new Random();
		String name = "EFGH" + random.nextInt(12345) + 10000;
		contacts.enteruniqName(name);
		contacts.clickSave();
		String ExpectedError= "Error: You must enter a value";
		String ActualError = contacts.getErrorMsg();
		Assert.assertEquals(ActualError, ExpectedError);
	}
	
	@Test
	public void TC31() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		String userName = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "username");
		login.enterUserName(userName);
		String password = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "password");
		login.enterPassword(password);
		login.clickLoginButton();
		HomePage home = new HomePage(driver);
		Thread.sleep(3000);
		home.clickContactTab();
		ContactsPage contacts = new ContactsPage(driver);
		String ExpectedTitle = "Contacts: Home ~ Salesforce - Developer Edition";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		contacts.clickCreateViewButton();
		Thread.sleep(3000);
		contacts.enterViewName("ABCD");
		Random random = new Random();
		String name = "EFGH" + random.nextInt(12345) + 10000;
		contacts.enteruniqName(name);;
		contacts.ClickCancelButton();
		String ExpectedTitle1 = "Contacts: Home ~ Salesforce - Developer Edition";
		String ActualTitle1= driver.getTitle();
		Assert.assertEquals(ActualTitle1, ExpectedTitle1);
	
	}
	
	@Test
	public void TC32() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		String userName = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "username");
		login.enterUserName(userName);
		String password = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "password");
		login.enterPassword(password);
		login.clickLoginButton();
		HomePage home = new HomePage(driver);
		Thread.sleep(3000);
		home.clickContactTab();
		ContactsPage contacts = new ContactsPage(driver);
		String ExpectedTitle = "Contacts: Home ~ Salesforce - Developer Edition";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		Thread.sleep(3000);
		contacts.clickNewButton();
		String ExpectedTitle1 = "Contact Edit: New Contact ~ Salesforce - Developer Edition";
		String ActualTitle1 = driver.getTitle();
		Assert.assertEquals(ActualTitle1, ExpectedTitle1);
		contacts.enterLastName("Indian");
		//String accountName = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "accountName");
		contacts.enterAccount("Global Media");
		Thread.sleep(3000);
		contacts.clickSaveNewButton();
		String ExpectedTitle2 = "Contact Edit: New Contact ~ Salesforce - Developer Edition";
		String ActualTitle2 = driver.getTitle();
		Assert.assertEquals(ActualTitle2, ExpectedTitle2);
	}
}
