package com.SauceDemo.Base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SauceDemoBaseClass 
{
  
     
     protected static WebDriver saucedemo;
     @Parameters("BrouserName")
	 @BeforeMethod
     public  void urlOpen(String BrouserName)
     {
       
    	 if (BrouserName.equals("chrome"))
    	 {
		       System.setProperty("webdriver.chrome.driver",
				       "D:\\15 oct class\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		       saucedemo=new ChromeDriver();
    	 }
    	 else if(BrouserName.equals("firefox"))
    	 {
    			System.setProperty("webdriver.gecko.driver",
    					"D:\\15 oct class\\selenium\\geckodriver-v0.32.2-win32\\geckodriver.exe");
    			
    			saucedemo=new FirefoxDriver();
    	  }
    	 
    	 else
    	 {
    		 System.out.println("Brouser error found");
    	 }
		
		saucedemo.get("https://www.saucedemo.com/");
		
		saucedemo.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
		
		System.out.println("Url is opened");
		
		
     }
	 
	
	@AfterMethod
	public void closePage()
	{
		saucedemo.quit();
		System.out.println("Page is closed");
	}
	
	
}
