package com.ecobags.hybrid_automation_framework.scriptBase.hook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.ecobags.hybrid_automation_framework.pageBase.PageBase;
import com.ecobags.hybrid_automation_framework.utils.DriverFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BeforeAfterHook extends PageBase {
	
	
	 public BeforeAfterHook(WebDriver driver) {
		super(driver);
		
	}

	@Before
	    public void setup() {

	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

	        driver.manage().window().maximize();
	    }

	    @After
	    public void tearDown(){

	    	
	    		DriverFactory.getInstance().removeDriver();
	    		
	    }
	
}

