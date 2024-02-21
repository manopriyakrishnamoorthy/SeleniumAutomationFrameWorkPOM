package com.salesforce.automation.scripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.salesforcce.pages.createOpty.CreateOptyPage;
import com.salesforce.base.SalesforceBaseTest;
import com.salesforce.pages.home.HomePage;
import com.salesforce.pages.login.LoginPage;
import com.salesforce.utilities.Constants;
import com.salesforce.utilities.PropertiesUtility;

public class CreateOptyModule extends SalesforceBaseTest {
	
	@Test
	public void TC15() {
		LoginPage login = new LoginPage(driver);
		String userName = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "username");
		login.enterUserName(userName);
		String password = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "password");
		login.enterPassword(password);
		login.clickLoginButton();
		HomePage home = new HomePage(driver);
		String Expecttitle = "Opportunities: Home ~ Salesforce - Developer Edition";
		String Actualtitle = home.getPageTitle();
		Assert.assertEquals(Actualtitle, Expecttitle);
		CreateOptyPage createOpty = new CreateOptyPage(driver);
		createOpty.clickOptyLink();
		createOpty.clickOptyDropdown();
		List<WebElement> actualOptions=createOpty.getOptyOptions();
		List<String> Expected = List.of("Closing Next Month","Closing This Month","My Opportunities","New Last Week","New This Week","Opportunity Pipeline","Private","Recently Viewed Opportunities","Won","view");
		for(String element : Expected) {
			boolean notfound = false;
			for(WebElement actualOption : actualOptions) {
				if(actualOption.getText().trim().equalsIgnoreCase(element)) {
					System.out.println("Opportunities dropDownOption: " + element );
					notfound = true;
					break;
				}
			}
			if(!notfound) {
				System.out.println("Opportunities dropDownOption notfound :" + element);
			}
		}
	}
		
	
	public void TC16() {
		
	}

}
