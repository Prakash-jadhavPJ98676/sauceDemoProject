package com.SauceDemo.Base;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.SauceDemo.POM.SauceDemoPomClass;

public class VerifyCheckOutBtnCheckOutDataContinueBtnFinishBtnBackHomeBtn extends SauceDemoBaseClass2
{
           
	       @Test(priority=-5)
	       public void checkOutBTN()
	       {
	    	    System.out.println("--Test Case For--Checkout BTN Is Clicking Or Not--");
	    	   WebElement cart=saucedemo.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	    	   cart.click();
	    	   
	    	 
	    	   WebElement checkout=saucedemo.findElement(By.xpath("//button[@id='checkout']"));
	    	   checkout.click();
	    	   
	    	   WebElement checkoutTitle=saucedemo.findElement(By.xpath("//span[@class='title']"));
	    	   boolean a=checkoutTitle.isDisplayed();
	    	   
	    	   if(a=true)
	    	      System.out.println("TC01--Checkout BTN is Clicked--Test Case Is Passed"); 
	    	   else
	    	      System.out.println("TC01--Checkout BTN is Not Clicked--Test Case Is Falied"); 
	    		   
	    		 
	       }
	       
	       @Test(priority=0)
	       public void checkOutData() throws IOException
	       {
	    	   System.out.println("--Test Case for--Check FirstName/LastName/ZipCode Textbox--");
	    	   WebElement addToCart=saucedemo.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']"));
	    	   addToCart.click();
	    	   
	    	   WebElement cart=saucedemo.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	    	   cart.click();
	    	   
	    	   WebElement checkout=saucedemo.findElement(By.xpath("//button[@id='checkout']"));
	    	   checkout.click();
	    	   
	    	   SauceDemoPomClass check=new SauceDemoPomClass(saucedemo);
	    	   check.checkoutfirstname("prakash");
	    	   System.out.println("-FirstName Is Entered");
	    	   check.checkoutlastname("jadhav");
	    	   System.out.println("-LastName Is Entered");
	    	   check.checkoutpostalcode("413405");
	    	   System.out.println("-PinCode Is Entered");
	    	   
	    	   check.SS("CheckOutData");
	    	   
	    	  
	       }
	       
	       @Test(priority=0)
	       public void continueBTN() throws IOException
	       {
	    	   System.out.println("Test case for--Continue BTN Is Clicking Or Not");
	    	   WebElement addToCart=saucedemo.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']"));
	    	   addToCart.click();
	    	   
	    	   WebElement cart=saucedemo.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	    	   cart.click();
	    	   
	    	   WebElement checkout=saucedemo.findElement(By.xpath("//button[@id='checkout']"));
	    	   checkout.click();
	    	   
	    	   SauceDemoPomClass check=new SauceDemoPomClass(saucedemo);
	    	   check.checkoutfirstname("prakash");
	    	   System.out.println("-FirstName Is Entered");
	    	   check.checkoutlastname("jadhav");
	    	   System.out.println("-LastName Is Entered");
	    	   check.checkoutpostalcode("413405");
	    	   System.out.println("-PinCode Is Entered");
	    	   
	    	   check.SS("CheckOutData");
	    	   
	    	   
               check.continueclick();
	    	   
	    	   WebElement checkoutOverview=saucedemo.findElement(By.xpath("//span[@class='title']"));
	    	   boolean a=checkoutOverview.isDisplayed();
	    	 
	    	   if (a)
	    		   System.out.println("--Clicked On Continue BTN--Test Case Is Passed \n");
	    	   else
	    	       System.out.println("--Not Clicked On Continue BTN--Test Case Is Failed\n");
	    	   
	       }
	       
	       
	       @Test(priority=4)
	       public void finishBTN()
	       {
	    	   System.out.println("Test case for-- Finish BTN is Clicking Or Not");
	    	   WebElement addToCart=saucedemo.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']"));
	    	   addToCart.click();
	    	   
	    	   WebElement cart=saucedemo.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	    	   cart.click();
	    	   
	    	   WebElement checkout=saucedemo.findElement(By.xpath("//button[@id='checkout']"));
	    	   checkout.click();
	    	   
	    	   SauceDemoPomClass check=new SauceDemoPomClass(saucedemo);
	    	   check.checkoutfirstname("prakash");
	    	   System.out.println("-FirstName Is Entered");
	    	   check.checkoutlastname("jadhav");
	    	   System.out.println("-LastName Is Entered");
	    	   check.checkoutpostalcode("413405");
	    	   System.out.println("-PinCode Is Entered");
               check.continueclick();
               System.out.println("-Clicked On Continue BTN");
	    	   
               WebElement finishBTN=saucedemo.findElement(By.xpath("//button[@id='finish']"));
               finishBTN.click();
	    	   
               WebElement checkOutCompletePage=saucedemo.findElement(By.xpath("//h2[@class='complete-header']"));
               boolean a=checkOutCompletePage.isDisplayed();
	    	   
               if(a=true)
            	   System.out.println("--Finish BTN is Clicked-- Test Case Is Passed");
               else
            	   System.out.println("--Finish BTN is Not Clicked-- Test Case Is Failed");
            	   
	       }
	       
	       @Test(priority=5)
	       public void backHomeBTN()
	       {
	    	   System.out.println("--Test Case for--BackHome Button Is Clicking Or Not--");
	    	   
	    	   
	    	   System.out.println("Test case for-- Finish BTN is Clicking Or Not");
	    	   WebElement addToCart=saucedemo.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']"));
	    	   addToCart.click();
	    	   
	    	   WebElement cart=saucedemo.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	    	   cart.click();
	    	   
	    	   WebElement checkout=saucedemo.findElement(By.xpath("//button[@id='checkout']"));
	    	   checkout.click();
	    	   
	    	   SauceDemoPomClass check=new SauceDemoPomClass(saucedemo);
	    	   check.checkoutfirstname("prakash");
	    	   check.checkoutlastname("jadhav");
	    	   check.checkoutpostalcode("413405");
	    	   check.continueclick();
	    	   
	    	   WebElement backHome=saucedemo.findElement(By.xpath("//button[@id='finish']"));
	    	   backHome.click();
               
               WebElement backToBTn=saucedemo.findElement(By.xpath("//button[@name='back-to-products']"));
               backToBTn.click();
               
               WebElement productVerify=saucedemo.findElement(By.xpath("//a[@id='item_4_title_link']"));
               boolean a=productVerify.isDisplayed();
               
               if(a)
            	   System.out.println("BackHome button is clicked--Test case is Passed");
               else
            	   System.out.println("BackHome button is Not clicked--Test case is Failed");
             
	       }
	       
	       
	       
	       
	       
	       
	       
}
