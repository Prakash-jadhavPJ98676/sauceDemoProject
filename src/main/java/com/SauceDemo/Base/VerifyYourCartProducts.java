package com.SauceDemo.Base;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.SauceDemo.POM.SauceDemoPomClass;

public class VerifyYourCartProducts extends SauceDemoBaseClass2
{
      
	       @Test
	       public void yourCartProductsAvailable() throws IOException
	       {
	    	   
	    	   for (int x=0;x<=5;x++)
	        	 {
	        	 WebElement productNameClick=saucedemo.findElement(By.xpath("//a[@id='item_"+x+"_title_link']"));
	        	 productNameClick.click();
	        	
	        	
	        	 WebElement AddToCartBTN=saucedemo.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
	        	 AddToCartBTN.click();
	    	   
	        	 WebElement backToProdButton=saucedemo.findElement(By.xpath("//button[text()='Back to products']"));
	        	 backToProdButton.click();
	        
	        	 }
	    		 System.out.println("\nAll products add to cart task is complete.\n");
	    	    System.out.println("--To Verify the all products are added in your cart or not--\n");
	    	   
	    	    for(int y=0;y<=5;y++)
	    	    {
	    	    	WebElement yourCartBTN=saucedemo.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	    	    	yourCartBTN.click();
	    	    	
	    	    	WebElement productNameClick=saucedemo.findElement(By.xpath("//a[@id='item_"+y+"_title_link']"));
	    	    	String a=productNameClick.getText();
	    	    	
		        	boolean b=productNameClick.isDisplayed();
		        	
		        	if (b==true)
		        	{
		        		System.out.println("TC0"+(y+1)+"-"+a+"--Product is Available in Your Cart\n Test Case is Passed");
		        	}
		        	else
		        	{
		        		System.out.println("TC0"+(y+1)+"-"+a+"--Product is Not Available in Your Cart\n Test Case is Failed");
		        	}
		        	
		        	
	    	    }
	    	   
	    	    SauceDemoPomClass s=new SauceDemoPomClass(saucedemo);
	    	    s.SS("YourCartProducts");
	    	    System.out.println("ScreenShot is Taken");
	    	   
	    	   
	    	   
	    	   
	       }
	
	
}
