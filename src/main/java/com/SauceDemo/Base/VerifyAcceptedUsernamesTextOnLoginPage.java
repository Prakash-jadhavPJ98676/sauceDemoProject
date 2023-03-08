package com.SauceDemo.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class VerifyAcceptedUsernamesTextOnLoginPage extends SauceDemoBaseClass
{
           @Test
           public void VerifyLoginTextId()
           {
        	   System.out.println("\n--Verify The Login Id Text On Login Page-- ");
        	   WebElement loginText=saucedemo.findElement(By.xpath("//div[@id='login_credentials']"));
        	   String actText=loginText.getText();
        	   
        	   String expText="Accepted usernames are:\n"
        	   		+ "standard_user\n"
        	   		+ "locked_out_user\n"
        	   		+ "problem_user\n"
        	   		+ "performance_glitch_user";
        	   
        	   if (actText.equals(expText))
        	   {
        		   System.out.println("TC01--User's Text Test case is Passed\n");
        	   }
        	   else
        	   {
        		   System.out.println("TC01--User's Text Test case is Failed\n");
        	   }
        	   
        	   System.out.println("Verify The Login Id Text On Login Page Is Complete");
           }
}
