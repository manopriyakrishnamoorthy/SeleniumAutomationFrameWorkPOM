package com.salesforce.automation.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.salesforce.base.SalesforceBaseTest;
import com.salesforce.pages.home.HomePage;
import com.salesforce.pages.leads.LeadsPage;
import com.salesforce.pages.login.LoginPage;
import com.salesforce.utilities.Constants;
import com.salesforce.utilities.PropertiesUtility;

public class LeadsModule extends SalesforceBaseTest {
	
	@Test
	public void  TC20_leadsTab() {
		LoginPage login = new LoginPage(driver);
		String userName = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "username");
		login.enterUserName(userName);
		String password = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "password");
		login.enterPassword(password);
		login.clickLoginButton();
		HomePage home = new HomePage(driver);
		home.clicktab();
		String ExpectedTitle = "Leads: Home ~ Salesforce - Developer Edition";
		String ActualTitle = home.getPageTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	
	}
	
	@Test
	public void  TC21_leadsSelectView() throws InterruptedException {
		TC20_leadsTab();
		LeadsPage leads = new LeadsPage(driver);
		Thread.sleep(5000);
		leads.dropdownLeads();
		leads.getLeadsdropDownText();
	}

	@Test
	public void TC22_defaultView() throws InterruptedException {
		TC21_leadsSelectView();
		LeadsPage leads = new LeadsPage(driver);
		leads.selectOption();
		logOutApp();
		logInApp();
		HomePage home = new HomePage(driver);
		home.clicktab();
		String ExpectedTitle = "Leads: Home ~ Salesforce - Developer Edition";
		String ActualTitle = home.getPageTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		LeadsPage page = new LeadsPage(driver);
		page.clickGo();
		
	}
	
	@Test
	public void TC23() throws InterruptedException {
		TC20_leadsTab();
		LeadsPage leads = new LeadsPage(driver);
		Thread.sleep(5000);
		leads.dropdownLeads();
		leads.selectOption();
		String ExpectedTitle = "Leads ~ Salesforce - Developer Edition";
		String ActualTitle = leads.getPageTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
	
	@Test
	public void TC24() throws InterruptedException {
		TC20_leadsTab();
		logInApp();
		HomePage home = new HomePage(driver);
		home.clicktab();
		LeadsPage leads = new LeadsPage(driver);
		String ExpectedTitle = "Leads: Home ~ Salesforce - Developer Edition";
		String ActualTitle = leads.getPageTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		leads.clickNew();
		Thread.sleep(5000);
		String lastname = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "lastname");
		leads.cleartext();
		leads.enterLastName(lastname);
		String company = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "company");
		leads.clearTxt();
		leads.enterCompany(company);
		leads.clickSave();
		String ExpectedTitle1 = "Lead: ABCD ~ Salesforce - Developer Edition";
		String ActualTitle1 = leads.getPageTitle();
		Assert.assertEquals(ExpectedTitle1, ActualTitle1);
	}
}
