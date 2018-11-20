package com.ecobags.hybrid_automation_framework.testLayer;



import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


import com.ecobags.hybrid_automation_framework.scriptBase.hook.BeforeAfterHook;
import com.ecobags.hybrid_automation_framework.utils.DriverFactory;
import com.ecobags.hybrid_automation_framework.utils.PageFactory;
import com.ecobags.hybrid_automation_framework.utils.PropertyReaderService;




public class LoginFunctionalityTest   {
	






	private WebDriver driver = null;
	private PageFactory ecobags = null;
	
	@Before
	public void setUp() {
		driver = DriverFactory.getInstance("chrome").getDriver();
		ecobags = PageFactory.getInstance();
		
		driver.navigate().to(PropertyReaderService.getInstance().getProperty("APP_URL"));

	}
	
	@Test
	
	public void test() {
		ecobags.homePage().browseToTheSite();
		
		ecobags.homePage().popUpClose();
		ecobags.homePage().goToLoginPage();
		ecobags.loginPage().login("swapanny79@yahoo.com, ecobags2018", null);
		
		
		
	}
	

	@After
	public void tearDown() {
	//	DriverFactory.getInstance().removeDriver();
		//driver = null;
		//ecobags = null;
	}

}
