package com.ecobags.hybrid_automation_framework.utils;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {
	
	 private static DriverFactory instance = null;

	 public static final String USERNAME = "muhammad142";
	  public static final String AUTOMATE_KEY = "U5TrDDM4upEyizsXxy4h";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	    public static final String LOCAL_GRID_URL = "http://10.10.20.70:4444/wd/hub";

	    
	    
	    
	    

	    
	    
	    
	    private DriverFactory() {
	        //Do-nothing..Do not allow to initialize this class from outside
	    }

	    public static DriverFactory getInstance() 
	    
	    
	   {
	        if(instance == null){
	            instance = new DriverFactory();   //Singleton design pattern
	        }
	        return instance;
	    }

	    public static DriverFactory getInstance(String browserName)
	    {
	        if(instance == null) {
	            instance = new DriverFactory();
	        }

	        if(instance.driver.get() == null) {
	            if (browserName.equalsIgnoreCase("chrome")) {
	             //   ChromeDriverManager.getInstance().setup();
	               System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/driver/chromedriver.exe");
	                instance.driver.set(new ChromeDriver());
	            }
	            else if (browserName.equalsIgnoreCase("firefox")) {
//	                FirefoxDriverManager.getInstance().setup();
	                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/resources/driver/geckodriver.exe");
	                instance.driver.set(new FirefoxDriver());
	            }
	            else if (browserName.equalsIgnoreCase("cloud_win8.1_chrome_66")) {
	                DesiredCapabilities caps = new DesiredCapabilities();
	                caps.setCapability("browser", "Chrome");
	                caps.setCapability("browser_version", "66.0");
	                caps.setCapability("os", "Windows");
	                caps.setCapability("os_version", "8.1");
	                caps.setCapability("resolution", "1366x768");

	                try {
	                    instance.driver.set(new RemoteWebDriver(new URL(URL), caps));
	                } catch (MalformedURLException e) {
	                    e.printStackTrace();
	                }
	            }
	            else if (browserName.equalsIgnoreCase("cloud_win8.1_firefox_60")) {
	                DesiredCapabilities caps = new DesiredCapabilities();
	                caps.setCapability("browser", "Firefox");
	                caps.setCapability("browser_version", "60.0");
	                caps.setCapability("os", "Windows");
	                caps.setCapability("os_version", "8.1");
	                caps.setCapability("resolution", "1366x768");

	                try {
	                    instance.driver.set(new RemoteWebDriver(new URL(URL), caps));
	                } catch (MalformedURLException e) {
	                    e.printStackTrace();
	                }
	            }
	            else if (browserName.equalsIgnoreCase("cloud_win8.1_ie_11")) {
	                DesiredCapabilities caps = new DesiredCapabilities();
	                caps.setCapability("browser", "IE");
	                caps.setCapability("browser_version", "11.0");
	                caps.setCapability("os", "Windows");
	                caps.setCapability("os_version", "8.1");
	                caps.setCapability("resolution", "1366x768");

	                try {
	                    instance.driver.set(new RemoteWebDriver(new URL(URL), caps));
	                } catch (MalformedURLException e) {
	                    e.printStackTrace();
	                }
	            }
	            else if (browserName.equalsIgnoreCase("grid_chrome_32")) {
	                DesiredCapabilities caps = new DesiredCapabilities();
	                caps.setPlatform(Platform.ANY);
	                caps.setBrowserName("chrome");

	                try {
	                    instance.driver.set(new RemoteWebDriver(new URL(LOCAL_GRID_URL), caps));
	                } catch (MalformedURLException e) {
	                    e.printStackTrace();
	                }
	            }
	            else if (browserName.equalsIgnoreCase("grid_firefox_32")) {
	                DesiredCapabilities caps = new DesiredCapabilities();
	                caps.setPlatform(Platform.ANY);
	                caps.setBrowserName("firefox");

	                try {
	                    instance.driver.set(new RemoteWebDriver(new URL(LOCAL_GRID_URL), caps));
	                } catch (MalformedURLException e) {
	                    e.printStackTrace();
	                }
	            }
	            else if (browserName.equalsIgnoreCase("grid_ie_32")) {
	                DesiredCapabilities caps = new DesiredCapabilities();
	                caps.setPlatform(Platform.ANY);
	                caps.setBrowserName("internet explorer");

	                try {
	                    instance.driver.set(new RemoteWebDriver(new URL(LOCAL_GRID_URL), caps));
	                } catch (MalformedURLException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	        return instance;
	    }

	    ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>()
	    {
	        // thread local driver object for webDriver
	        @Override
	        protected WebDriver initialValue()
	        {
//	            ChromeDriverManager.getInstance().setup();
//	            return new ChromeDriver();
	            return null;  //Have to make it null to run on cloud/grid, otherwise it runs on chrome by default
	        }
	    };

	    public WebDriver getDriver() // call this method to get the driver object and launch the browser
	    {
	        return driver.get();
	    }

	    public void removeDriver() // Quits the driver and closes the browser
	    {
	        driver.get().quit();
	        driver.remove();
	    }

		
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
}
