package com.SauceDemo.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class VerifyPasswordForUserTextOnLogInPage extends SauceDemoBaseClass
{

	         @Test
	         public void VerifyPasswordForUserTextOnLoginPage()
	         {
	        	 System.out.println("\n--Verify Password for all users Text--");
	        	 WebElement passwordForUsers=saucedemo.findElement(By.xpath("//div[@class='login_password']"));
	        	 String actText=passwordForUsers.getText();
	        	 String expText="Password for all users:\n"
	        	 		           +  "secret_sauce";
	        	 System.out.println("Actual Text--"+actText);
	        	 System.out.println("Expected Text--"+expText);
	        	 
	        	 if (actText.equals(expText))
	        	 {
	        		 System.out.println("Test case is Passed");
	        	 }
	        	 else
	        	 {
	        		 System.out.println("Test case is Failed"); 
	        	 }
	        	 
	        	 System.out.println("-Verification Of Password for all users Text Is complete- ");
	         }
	
}
