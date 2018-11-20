package com.ecobags.hybrid_automation_framework.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ecobags.hybrid_automation_framework.utils.SeleniumUtils;

public class SearchPage extends SeleniumUtils {
	
	@FindBy(xpath="//form[@id='searchportlet2']//input[@id='input_header']")
	private WebElement searchBoxLink;
	
	@FindBy(xpath="//form[@id='searchportlet2']//input[@id='go']")
	private WebElement submitButtonLink; 
	
	
	
	public void searchProduct(String productName) {
		
		searchBoxLink.sendKeys(productName);
		submitButtonLink.click();
	}
	
	public void searchPageTitle() {
		
		
	}
	
	
	

}
