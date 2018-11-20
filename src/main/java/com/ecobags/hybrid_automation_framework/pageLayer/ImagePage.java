package com.ecobags.hybrid_automation_framework.pageLayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.ecobags.hybrid_automation_framework.utils.SeleniumUtils;

public class ImagePage extends SeleniumUtils {
	
	public void countAllImage() {
		
		WebElement imageFile =driver.findElement(By.xpath("//img[@src='/c.340019/site/TT_SB2_Files/img/home/Banner3-B2C.jpg']"));
		
		Boolean ImagePresent =(Boolean)((JavascriptExecutor)driver).executeScript
				("return arguments[0].complete && typeof arguments[0].naturalWith != \"undefined\" && agruments[0].naturalWith >0",imageFile);
		
		if(!ImagePresent) {
			
			System.out.println("Image not displayed.");
			
		}else {
			System.out.println("Image displayed.");
			
		}
		
		List <WebElement> allImages = driver.findElements(By.tagName("img"));
		
		int countAllImages =allImages.size();
		
		System.out.println("Total number of images is :" + countAllImages);
		
		for (int x=0;x >= countAllImages;x++) {
			
			System.out.println(allImages.get(x));
		}
		
		
	}
	

}
