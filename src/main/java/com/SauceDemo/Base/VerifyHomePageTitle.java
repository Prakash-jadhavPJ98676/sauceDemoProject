package com.SauceDemo.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyHomePageTitle extends SauceDemoBaseClass2
{
           
	        @Test
	        public void verifyHomePageTitle()
	        {
	        	
	        	System.out.println("\nVerify The Title Of Home Page\n");
	        	
	        	WebElement title=saucedemo.findElement(By.xpath("//span[@class='title']"));
	        	String actText=title.getText();
	        	System.out.println(actText);
	        	System.out.println("Actual Title-"+actText);
	        	String expText="Products";
	        	System.out.println("Expected Title-"+expText+"\n");
	        	
//	        	if (actText.equals(expText))
//	        		System.out.println("TC01--Title test case is Passed\n");
//	        	else
//	        		System.out.println("TC01--Title test case is Failed\n");
	        	
	        	
	        	Assert.assertEquals(actText,expText,"Test case is Failed");
	        	
	        	Assert.assertEquals(actText,expText);
	        	System.out.println("Test case is passed");
	        	
	        	
	        	
	        	System.out.println("--Verification Of Home Page Title Is Complete--");
	        }
	   
}
