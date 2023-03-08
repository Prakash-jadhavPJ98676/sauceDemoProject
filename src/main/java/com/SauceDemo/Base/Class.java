package com.SauceDemo.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Class extends SauceDemoBaseClass2
{
         
	       @Test(priority=1)
	       public void  m1()
	       {
	    	   
	    	   WebElement menuBTN=saucedemo.findElement(By.xpath("//div[@class='bm-burger-button']"));
	    	   menuBTN.click();
	    	   
	    	   WebElement aboutOption=saucedemo.findElement(By.xpath("//a[@id='about_sidebar_link']"));
	    	   aboutOption.click();
	    	   
	    	   WebElement menuBTNverify=saucedemo.findElement(By.xpath("//img[@alt='Saucelabs']"));
	    	   boolean a=menuBTNverify.isDisplayed();
	    	 
	    	   if (a)
	    		   System.out.println("About Option Is Clicked--Test Case Is Passed--");
	    	   else
	    		   System.out.println("About Option Is Not Clicked--Test Case Is Failed--");
	    	   
	       }
	       
	       @Test(priority=2)
	       public void logOutOption()
	       {
	    	   
	    	   WebElement menuBTN=saucedemo.findElement(By.xpath("//div[@class='bm-burger-button']"));
	    	   menuBTN.click();
	    	   
	    	   
	    	   WebElement logOutOption=saucedemo.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
	    	   logOutOption.click();
	    	   System.out.println("Logout is clicked");
	    	   
	    	   WebElement loginBTN=saucedemo.findElement(By.xpath("//input[@type='submit']"));
	    	   boolean a=loginBTN.isDisplayed();
	    	   
	    	   if (a)
	    		   System.out.println("LogOut Option Is Clicked--Test Case Is Passed--");
	    	   else
	    		   System.out.println("LogOut Option Is Not Clicked--Test Case Is Failed--");
	       }
	       
	       
	       @Test(priority=3)
	       public void resetAppState()
	       {
	    	  System.out.println("Verify Reset App State Option Is Clickable Or Not--");
	    	   for (int x=0;x<=5;x++)
	        	 {
	        	 WebElement productNameClick=saucedemo.findElement(By.xpath("//a[@id='item_"+x+"_title_link']"));
	        	 productNameClick.click();
	        	
	        	 WebElement AddToCartBTN=saucedemo.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
	        	 AddToCartBTN.click();
	        	 
	        	 WebElement backToProdButton=saucedemo.findElement(By.xpath("//button[text()='Back to products']"));
	        	 backToProdButton.click();
	        	 
	        	 
	        	 }
	    	   
	    	   
	    	    WebElement Cart=saucedemo.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
	        	String f=Cart.getText();
	        	System.out.println("your Cart Quantity->"+f);
	    	   
	        	WebElement menuBTN=saucedemo.findElement(By.xpath("//div[@class='bm-burger-button']"));
		    	menuBTN.click();
		    	   
	    	    WebElement resetAppOption=saucedemo.findElement(By.xpath("//a[@id='reset_sidebar_link']"));
	    	    resetAppOption.click();
	    	    
	    	    WebElement cross=saucedemo.findElement(By.xpath("//button[@id='react-burger-cross-btn']"));
	    	    cross.click();
	    	    
	    	   
//	    	    WebElement Cartt=saucedemo.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
//	        	String b=Cart.getText();
//	        	System.out.println("your Cart Quantity->"+b);
	        	
	    	    WebElement mm=saucedemo.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	    	    mm.click();
	    	    
	    	    WebElement nn=saucedemo.findElement(By.xpath("//a[@id='item_4_title_link']"));
	    	    boolean c=nn.isDisplayed();
	    	  
//	        	WebElement mm=saucedemo.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
//	        	boolean c=mm.isEnabled();
//	    	   
////	    	    String c="0";
//	    	   
	    	   if (c=true)
	    	   {
	    		   System.out.println("Reset App Option Is Clicked--Test Case Is Passed--");
	    	   }
	    	   else
	    	   {
	    		   System.out.println("Reset App Option Is Not Clicked--Test Case Is Failed--");
	    	   }
	    		   
	       }
	       
	       
	       
	       
	       
	     
	       
	       
	       
	       
	     
	       
	       
	       
	           
}
