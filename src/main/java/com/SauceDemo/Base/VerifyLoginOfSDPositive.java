package com.SauceDemo.Base;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.SauceDemo.POM.SauceDemoPomClass;

public class VerifyLoginOfSDPositive extends SauceDemoBaseClass
{
           @Test
           public void loginPositiveScenario() throws IOException
           {
        	   SauceDemoPomClass lp=new SauceDemoPomClass(saucedemo);
        	   
        	 lp.usersendP();
        	 System.out.println("Valid user username is entered");
        	 lp.passsend();
        	 System.out.println("Valid user password is entered");
        	 lp.loginclick();
        	 System.out.println("login Button is clicked");
        	 
        	 WebElement menuBTN=saucedemo.findElement(By.xpath("//div[@class='bm-burger-button']"));
        	 boolean a=menuBTN.isDisplayed();
        	
        	 if (a==true)
        	 {
        		 System.out.println("TC01-Valid login Positive Test Scenario TC is Passed");
        	 }
        	 else
        	 {
        		 System.out.println("TC01-Valid login Positive Test Scenario TC is Failed");
        	 }
        	 
        	 lp.SS("loginPositiveScenarioSD");
        	 System.out.println("ScreenShot is taken");
        	 
           }
}
