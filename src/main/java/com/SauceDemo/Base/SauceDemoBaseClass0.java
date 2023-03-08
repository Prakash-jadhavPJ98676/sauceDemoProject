package com.SauceDemo.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class SauceDemoBaseClass0
{

	
	protected static WebDriver saucedemo;
   
	 @BeforeMethod
    public  void urlOpen()
    {
      
   	
		       System.setProperty("webdriver.chrome.driver",
				       "D:\\15 oct class\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		       saucedemo=new ChromeDriver();
   	
		
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
