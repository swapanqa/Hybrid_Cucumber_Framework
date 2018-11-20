package com.ecobags.hybrid_automation_framework.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.ecobags.hybrid_automation_framework.pageBase.*;
import com.ecobags.hybrid_automation_framework.utils.DriverFactory;
import com.ecobags.hybrid_automation_framework.utils.SeleniumUtils;
import org.testng.Assert;

public class ChangeStorePage extends SeleniumUtils {
	
	@FindBy(xpath="")
	private WebElement customerPrintLink;
	
	
	public ChangeStorePage() {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
		
	}


    public void verifyStoryTitle(){
        String title = driver.getTitle();
        Assert.assertEquals("EcoBags - Select Store",title);
    }
	
	public void goTOCustomerPrintPage() {
		
		customerPrintLink.click();
	}
	
	
}
