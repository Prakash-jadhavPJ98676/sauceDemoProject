package com.SauceDemo.Base;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.SauceDemo.POM.SauceDemoPomClass;

public class VerifyLoginOfSDNegative extends SauceDemoBaseClass
{
           @Test
           public void loginNegativeScenario() throws IOException
           {
        	 SauceDemoPomClass lp=new SauceDemoPomClass(saucedemo); 
        	   
        	 lp.usersendN("prakash");
          	 System.out.println("Invalid username is entered");
          	 lp.passsendN("jadhav");
          	 System.out.println("Invalid password is entered");
          	 lp.loginclick();
          	 System.out.println("login Button is clicked");
          	 
          	 WebElement error=saucedemo.findElement(By.xpath("//h3[@data-test='error']"));
          	 String errorAText= error.getText();
          	 System.out.println("Actual Error text->"+errorAText);
          	 String errorEText="Epic sadface: Username and password do not match any user in this service";
          	 System.out.println("Expected Error text->"+errorEText);
          	 System.out.println("--TC02-Error Actual/Expected message verification--");
          	 
          	 if(errorAText.equals(errorEText))
          	 {
          		 System.out.println("TC02-Test case is Passed");
          	 }
          	 else
          	 {
          		System.out.println("TC02-Test case is failed"); 
          	 }
          	 lp.SS("loginNegativeScenarioSD");
          	 System.out.println("ScreenShot is taken");
           }
}
  