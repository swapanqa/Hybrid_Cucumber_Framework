package com.ecobags.hybrid_automation_framework.testLayer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.ecobags.hybrid_automation_framework.utils.DriverFactory;
import com.ecobags.hybrid_automation_framework.utils.PageFactory;

public class ChangeStoryPageTest {
	


	private WebDriver driver = null;
	private PageFactory ecobags = null;
	
	@Before
	public void setUp() {
		driver = DriverFactory.getInstance("chrome").getDriver();
		ecobags = PageFactory.getInstance();
	}

	@Test
	
	public void test1() {
		
	ecobags.homePage().browseToTheSite();
	ecobags.homePage().goToChangeStorePage();
	ecobags.changeStorePage().verifyStoryTitle();	
	ecobags.changeStorePage(). goTOCustomerPrintPage(); 	
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

	@After
	public void tearDown() {
		//DriverFactory.getInstance().removeDriver();
		//driver = null;
		//ecobags = null;
	}

	
	
	
	
	
	
	
	
}
