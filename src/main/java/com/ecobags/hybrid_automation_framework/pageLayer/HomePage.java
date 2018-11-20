package com.ecobags.hybrid_automation_framework.pageLayer;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ecobags.hybrid_automation_framework.utils.SeleniumUtils;

public class HomePage extends SeleniumUtils {
	
	
	@FindBy(xpath="//ul[@id='user-links']//li[1]")
	private WebElement loginLink;
	
	@FindBy(xpath="//ul[@id='user-links']//a[@title='Home'][contains(text(),'Home')]")
	private WebElement homeLink;
	
	@FindBy(xpath="//ul[@id='user-links']//a[@title='Wholesale Store'][contains(text(),'Wholesale')]")
	private WebElement wholeSaleLink ;
   
	@FindBy(xpath="//ul[@id='user-links']//li[1]")
	private WebElement checkoutLink  ;
   
	@FindBy(xpath="//ul[@id='user-links']//li[1]")
	private WebElement myAccountLink ;
   
	@FindBy(xpath="//a[@title='Change Store']")
	private WebElement changeStoreLink ;
	
	
	@FindBy(xpath="//a[@title='Customer Service']")
	private WebElement customerServiceLink ;
	
	@FindBy(xpath="//a[@title='About Us']")
	private WebElement aboutUsLink ;
	
	
	@FindBy(xpath="//a[@title='Contact Us']")
	private WebElement contactUsLink ;

	@FindBy(xpath="//button[contains(text(),'No, Thanks')]")
	private WebElement popUpClose;
	
	@FindBy(xpath="//input[@placeholder='Your email address']")
	private WebElement emailAdd;
	
	
	@FindBy(xpath="//button[contains(text(),'Join Now')]")
	private WebElement jointNow;
	
	
	
	
	public void sendEmail(String e) {
		
		
	}
	
	
	
	
	
	
	
	
	 public void browseToTheSite() {
		 driver.navigate().to("https://www.ecobags.com/");
		 
	 }
	 
	 

	    public void closeEmailPopUp(){
	        WebElement firstToKnowPopUpWindow = null;

	        try {
	            firstToKnowPopUpWindow = driver.findElement(By.xpath( "//div[@class='sumome-wysiwyg-gridRow-contents']//div[@class='sumome-react-wysiwyg-component sumome-react-wysiwyg-outside-horizontal-resize-handles sumome-react-wysiwyg-outside-vertical-resize-handles sumome-react-wysiwyg-welcome-mat-gridColumn sumome-react-wysiwyg-gridColumn sumome-gridColumn-small-12']"));
	            System.out.println("Found iframe");

	        }catch (Exception ex){
	            System.out.println(ex.getMessage());
	        }
	        if(firstToKnowPopUpWindow != null){
	            WebElement emailPopUpContainerIframe = firstToKnowPopUpWindow.findElement(By.xpath("./iframe"));
	            driver.switchTo().frame(emailPopUpContainerIframe);
	            System.out.println("Switched to iframe");

	            WebElement closeButton = driver.findElement(By.xpath("//button[contains(text(),'No, Thanks')]"));
	            highlight(closeButton);
	            closeButton.click();
	        }
	        
	        
	        
	        
	        
	        
	    }

	 

	 
	 
	 
	public void popUpClose() {
		
		popUpClose.click();
	}
	
	public void goToLoginPage() {
		loginLink.click();
		
	}
	
	public void goToHomePage() {
		homeLink.click();
		
	}
    
	public void goToWholeSalePage() {
		
		wholeSaleLink.click();
	}
	
	public void checkOut() {
		
		checkoutLink.click();
	}
	
	public void myAccout() {
		myAccountLink.click();
		
	}
	public void goToChangeStorePage() {
		
		changeStoreLink.click();
	}
	
	public void goToCustomerServicePage() {
		
		customerServiceLink.click();
	}
	
	
	public void goToAboutUsPage() {
		
		aboutUsLink.click();
	}
	
	public void goToContactUsPage() {
		
		contactUsLink.click();
	}
	
	
	
	
}
