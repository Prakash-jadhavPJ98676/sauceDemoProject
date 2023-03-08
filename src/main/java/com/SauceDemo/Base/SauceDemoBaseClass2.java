package com.SauceDemo.Base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POM.SauceDemoPomClass;

public class SauceDemoBaseClass2 
{
	protected static WebDriver saucedemo;
	 @Parameters("BrouserName")
	 @BeforeMethod
    public static void homePageOpen(String BrouserName)
    {
      if (BrouserName.equals("chrome"))
      {
		System.setProperty("webdriver.chrome.driver",
				"D:\\15 oct class\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		saucedemo=new ChromeDriver();
		
		saucedemo.get("https://www.saucedemo.com/");
		
		saucedemo.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
		
		System.out.println("Url is opened");
		
		 SauceDemoPomClass lp=new SauceDemoPomClass(saucedemo);
  	   
    	 lp.usersendP();
    	 System.out.println("Valid user username is entered");
    	 lp.passsend();
    	 System.out.println("Valid user password is entered");
    	 lp.loginclick();
    	 System.out.println("login Button is clicked");
      }
      
      else if (BrouserName.equals("firefox"))
      {
    	  System.setProperty("webdriver.gecko.driver",
					"D:\\15 oct class\\selenium\\geckodriver-v0.32.2-win32\\geckodriver.exe");
			
			saucedemo=new FirefoxDriver();
  		
  		saucedemo.get("https://www.saucedemo.com/");
  		
  		saucedemo.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
  		
  		System.out.println("Url is opened");
  		
  		 SauceDemoPomClass lp=new SauceDemoPomClass(saucedemo);
    	   
      	 lp.usersendP();
      	 System.out.println("Valid user username is entered");
      	 lp.passsend();
      	 System.out.println("Valid user password is entered");
      	 lp.loginclick();
      	 System.out.println("login Button is clicked");
      }
      
      else
 	 {
 		 System.out.println("Brouser error found");
 	 }
      
    }
	 
	
	@AfterMethod
	public static void closePage()
	{
		saucedemo.quit();
		System.out.println("Page is closed");
	}
}
