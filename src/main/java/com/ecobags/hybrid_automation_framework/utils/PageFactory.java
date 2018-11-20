package com.ecobags.hybrid_automation_framework.utils;

import org.apache.commons.compress.archivers.zip.ScatterStatistics;

import com.ecobags.hybrid_automation_framework.pageLayer.ChangeStorePage;
import com.ecobags.hybrid_automation_framework.pageLayer.CustomerServicePage;
import com.ecobags.hybrid_automation_framework.pageLayer.HomePage;
import com.ecobags.hybrid_automation_framework.pageLayer.ImagePage;
import com.ecobags.hybrid_automation_framework.pageLayer.LoginPage;
import com.ecobags.hybrid_automation_framework.pageLayer.RegistrationPage;
import com.ecobags.hybrid_automation_framework.pageLayer.SearchPage;
import com.ecobags.hybrid_automation_framework.pageLayer.ShoppingCartPage;
import com.ecobags.hybrid_automation_framework.pageLayer.WholeSalePage;

public class PageFactory {
	
	private static PageFactory instance = null;
	private HomePage homePage;
	private ChangeStorePage changeStorePage;
	private CustomerServicePage customerServicePage;
	private ImagePage imagePage;
	private LoginPage loginPage;
	private RegistrationPage registrationPage;
	private SearchPage searchPage;
	private ShoppingCartPage shoppingCartPage;
	private WholeSalePage wholeSalePage;
	
	
	private PageFactory() {
		
	}
	
	public static PageFactory getInstance() {
		
		if(instance ==null) {
			instance =new PageFactory();
		}
		
		return instance;
	}
	
	public void reset(){
		
		homePage =null;
		changeStorePage =null;
		customerServicePage = null;
		imagePage = null;
		loginPage = null;
		registrationPage = null;
		searchPage = null;
		shoppingCartPage = null;
		wholeSalePage = null;
		
		}
	
	
	public HomePage homePage() {
		if(homePage ==null) {
			
			homePage = new HomePage();
		}
		return homePage;
	}
	
	public ChangeStorePage changeStorePage() {
		
		if(changeStorePage ==null) {
			changeStorePage = new ChangeStorePage();
		}
		return changeStorePage;
		
	}
	
	public CustomerServicePage customerServivePage() {
		
		if (customerServicePage ==null) {
			
			customerServicePage = new CustomerServicePage();
			
		}
		return customerServicePage;
	}
	
	public ImagePage imagePage() {
		
		if (imagePage == null) {
			imagePage = new ImagePage();
		}
		return imagePage();
	}
	
	public LoginPage loginPage() {
		
		if (loginPage ==null) {
			
			loginPage =new LoginPage();
		}
		return loginPage();
	}
	
	public RegistrationPage registrationPage() {
		if(registrationPage ==null) {
			
			registrationPage =new RegistrationPage();
		}
		
		return registrationPage();
	}
	
	public SearchPage searchPage() {
		if(searchPage == null) {
			
			searchPage =new SearchPage();
		}
		return searchPage();
	}
	
	
	public ShoppingCartPage shoppingCartPage() {
		
		if(shoppingCartPage ==null) {
			
			shoppingCartPage =new ShoppingCartPage();
		}
		
		return shoppingCartPage();
	}
	
	public WholeSalePage wholeSalePage() {
		if (wholeSalePage ==null) {
			wholeSalePage =new WholeSalePage();
		}
		return wholeSalePage();
	}
	
	
	
	

}
