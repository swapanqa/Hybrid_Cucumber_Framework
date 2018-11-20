package com.ecobags.hybrid_automation_framework.pageLayer;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecobags.hybrid_automation_framework.utils.DriverFactory;
import com.ecobags.hybrid_automation_framework.utils.SeleniumUtils;

import org.testng.Assert;

public class LoginPage extends SeleniumUtils {
	
	@FindBy(id="login-email")
    private WebElement emailTextBox;
	
	@FindBy(id="login-password")
	private WebElement passwordTextBox;
	
	@FindBy(xpath="//button[contains(text(),'Sign In')]")
	private WebElement loginButton;
	
	@FindBy(xpath="//div[@class='alert alert-error']")
	private WebElement errorMessage;
	
	@FindBy(xpath="//li[@class='last']//a[@title='Log Out'][contains(text(),'Log Out')]")
	private WebElement singOutButton;
	
	public LoginPage() {
		
		WebDriver driver = DriverFactory.getInstance().getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void setEmailAddress(String email) {
		emailTextBox.clear();
		emailTextBox.sendKeys(email);
	}
	
	public void setPassword(String password) {
		passwordTextBox.clear();
		passwordTextBox.sendKeys(password);
		
	}
	
	public void clickLogin() {
		loginButton.click();
	}
	
	public void login(String email,String Password) {
		
		setEmailAddress(email);
		setPassword(Password);
		clickLogin();
	}
	
	public void clickSingOut() {
		
		singOutButton.click();
	}
	
	
public void verifyPageTitle() {
	
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}