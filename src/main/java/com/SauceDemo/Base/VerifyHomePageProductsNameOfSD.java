package com.SauceDemo.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class VerifyHomePageProductsNameOfSD extends SauceDemoBaseClass2
{

	      @Test
	      public void productNameVerification()
	      {
	    	  
	    	  System.out.println("\n-Product Name TestCase Verification-");
	    	  System.out.println("TC01-Sauce Labs Bike Light\n"
	    	  		+ "TC02-Sauce Labs Bolt T-Shirt\n"
	    	  		+ "TC03-Sauce Labs Onesie\n"
	    	  		+ "TC04-Test.allTheThings() T-Shirt (Red)\n"
	    	  		+ "TC05-Sauce Labs Backpack\n"
	    	  		+ "TC06-Sauce Labs Fleece Jacket\n\n");
	    	  for (int x=0;x<=5;x++)
	    	  {
	    	  WebElement productN=saucedemo.findElement(By.xpath("//a[@id='item_"+x+"_title_link']"));
	    	  String ActualText=productN.getText();
              
	    	  String a="Sauce Labs Bike Light";
	    	  String b="Sauce Labs Bolt T-Shirt";
	    	  String c="Sauce Labs Onesie";
	    	  String d="Test.allTheThings() T-Shirt (Red)";
	    	  String e="Sauce Labs Backpack";
	    	  String f="Sauce Labs Fleece Jacket";
	    	  
	    	  if (ActualText.equals(a)||ActualText.equals(b)||ActualText.equals(c)||ActualText.equals(d)||ActualText.equals(e)||ActualText.equals(f))
	    	  {
	    		  System.out.println("TC0"+(x+1)+"-Test case is passed");
	    	  }
	    	  else
	    	  {
	    		  System.out.println("TC0"+(x+1)+"-Test case is failed");
	    	  }
	    	  
	    	  }
	    	  System.out.println("-Product Name Verification is Compleated-\n");
	      }
	      
	
	
	
	 
}
