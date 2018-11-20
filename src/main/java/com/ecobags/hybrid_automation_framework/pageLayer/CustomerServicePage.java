package com.ecobags.hybrid_automation_framework.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ecobags.hybrid_automation_framework.utils.SeleniumUtils;

public class CustomerServicePage extends SeleniumUtils {
	
	@FindBy(xpath="//a[@class='f_mainColor_body product-name'][contains(text(),'Shipping Information')]")
	private WebElement shippingInformationLink;
	
	@FindBy(xpath="//a[@class='f_mainColor_body product-name'][contains(text(),'Eco-Bags Conditions of Use')]")
	
	private WebElement conditionLink;
	
	@FindBy(xpath="//a[@class='f_mainColor_body product-name'][contains(text(),'ECOBAGS.COM Returns / Exchanges')]")
	private WebElement exchangePageLink;
	
	@FindBy(xpath="//a[@class='f_mainColor_body product-name'][contains(text(),'ECOBAGS.COM Privacy Policy')]")
	private WebElement privacyPolicyLink;
	
	
	
	public void verifyCustomerServiceTitle() {
		
		
		
		
	}
	
	
	
	public void goTOShippingInformationPage() {
		shippingInformationLink.click();
		
	}
	
	public  void goToConditionPage() {
		
		conditionLink.click();
		
		
	}
	
	public void goToexchangePage() {
		
		
		exchangePageLink.click();
	}
	
	public void goToPrivacyPolicyPage() {
		
		privacyPolicyLink.click();
		
	}
	
	
	

}
