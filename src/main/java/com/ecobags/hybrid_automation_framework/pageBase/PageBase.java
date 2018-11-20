package com.ecobags.hybrid_automation_framework.pageBase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.ecobags.hybrid_automation_framework.utils.SeleniumUtils;

public class PageBase extends SeleniumUtils {
	
	protected WebDriver driver = null;
	
	
	public PageBase(WebDriver driver) {
		
		
		this.driver =driver;
		
		
	}
	public void verifyPageTitle(String expectedTitle) {
		
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle,expectedTitle);
	}
	

}
