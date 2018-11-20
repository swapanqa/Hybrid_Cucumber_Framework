package com.ecobags.hybrid_automation_framework.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ecobags.hybrid_automation_framework.utils.SeleniumUtils;

import org.junit.Assert;

public class RegistrationPage extends SeleniumUtils {
	
	public void clickMyAccountLink() {
		
		WebElement element =driver.findElement(By.xpath("//ul[@id='user-links']//li[1]"));
		element.click();
		delayFor(2000);
	}
public void verifyRegistrationTitle() {
	
	String title =driver.getTitle();
	Assert.assertEquals("ECOBAGS | Login-Register", title);
	delayFor(2000);
	
}

public void enterFirstNameForRegistration(String firstName) {
	
	WebElement element =driver.findElement(By.id("register-firstname"));
	    element.sendKeys(firstName);
	    delayFor(2000);
}

public void  enterLastNameForRegistration(String lastName) {
	
	WebElement element =driver.findElement(By.id("register-lastname"));
	  element.sendKeys(lastName);
	  delayFor(2000);
	
}

public void enterCompanyNameForRegistration(String companyName) {
	WebElement element =driver.findElement(By.id("register-company"));
	  element.sendKeys(companyName);
	  delayFor(2000);
}

public void enterEmailAddress(String emailAddress) {
 WebElement element =driver.findElement(By.id("register-email"));
   element.sendKeys(emailAddress);
	delayFor(2000);
}

public void enterPassword(String password) {
	
	WebElement element =driver.findElement(By.id("register-password"));
	  element.sendKeys(password);
	 delayFor(2000); 
	  
}

public void enterRePassword(String rePassword) {
	WebElement element =driver.findElement(By.id("register-password2"));
	    element.sendKeys(rePassword);
	   delayFor(2000);
}

public void clickCreateAccountButton() {
	
	WebElement element =driver.findElement(By.xpath("//button[contains(text(),'Create Account')]"));
	    element.click();
}





}
