package com.SauceDemo.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class VerifyHomePageProductsPriceOfSD extends SauceDemoBaseClass2
{
	
	@Test
	public void productPriceVerification()
	{   
		System.out.println("\n-Product price TestCase Verification-");
		  System.out.println("TC01-Sauce Labs Backpack-$29.99\n"
	    	  		+ "TC02-Sauce Labs Bike Light-$9.99\n"
	    	  		+ "TC03-Test.allTheThings() T-Shirt (Red)-$15.99\n"
	    	  		+ "Tc04-Sauce Labs Fleece Jacket-$49.99\n"
	    	  		+ "TC05-Sauce Labs Onesie-$7.99\n"
	    	  		+ "TC05-Sauce Labs Bolt T-Shirt-$15.99\n\n");
		
		for (int x=1;x<=6;x++)
		{
		WebElement price=saucedemo.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div["+x+"]/div[2]/div[2]/div"));
  	    String Actualprice=price.getText();
  	    System.out.println(Actualprice);
  	    
  	    String a="$29.99";
	    String b="$9.99";
	    String c="$15.99";
	    String d="$49.99";
	    String e="$7.99";
	    String f="$15.99";
  	    
  	    if (Actualprice.equalsIgnoreCase(a)||Actualprice.equalsIgnoreCase(b)||Actualprice.equalsIgnoreCase(c)||Actualprice.equalsIgnoreCase(d)||Actualprice.equalsIgnoreCase(e)||Actualprice.equalsIgnoreCase(f))
  	    {
  	    	System.out.println("TC0"+x+"-test case is Passed");
  	    }
  	    else
  	    	System.out.println("TC0"+x+"-test case is Failed");
  	    
		}
		
	}
	
	
}
