package com.SauceDemo.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class VerifyProductsAddToCartBackToProductBTN extends SauceDemoBaseClass2
{

		@Test
         public void addToCart()
         {
        	 System.out.println("Product Are clickable / Add To Cart BTN Clickable / Back To Products BTN clickable-TEST CASES \n ");
        	 for (int x=0;x<=5;x++)
        	 {
        	 WebElement productNameClick=saucedemo.findElement(By.xpath("//a[@id='item_"+x+"_title_link']"));
        	 String b=productNameClick.getText();
        	 productNameClick.click();
        	
        	
        	 
        	 WebElement productclicked=saucedemo.findElement(By.xpath("//button[@data-test='back-to-products']"));
        	 boolean a=productclicked.isDisplayed();
        	 
        	 if (a==true)
        	 {
        		 System.out.println("TC0"+(x+1)+"-"+b+"-Product is clickable TC is Passed");
        	 }
        	 else
        	 {
        		 System.out.println("TC0"+(x+1)+"-"+b+"-Product is clickable TC is Failed");
        	 }
        	 
        	 WebElement AddToCartBTN=saucedemo.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
        	 AddToCartBTN.click();
        	 
        	 WebElement Cart=saucedemo.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
        	 String f=Cart.getText();
        	 System.out.println("your Cart Quantity->"+f);
             String j="1";String k="2";String l="3";String m="4";String n="5";String o="6";
        	 
        	 if (f.equals(j)||f.equals(k)||f.equals(l)||f.equals(m)||f.equals(n)||f.equals(o))
        	 {
        		 System.out.println("Add to cart test case is passed BTN Is Clickable");
        	 }
        	 else
        	 {
        		 System.out.println("Add to cart test case is Failed BTN Is Not Clickable");
        	 }
        	
        	 
        	 
        	 WebElement backToProdButton=saucedemo.findElement(By.xpath("//button[text()='Back to products']"));
        	 backToProdButton.click();
        	 
        	 WebElement settingBTN=saucedemo.findElement(By.xpath("//div[@class='bm-burger-button']"));
        	 boolean d= settingBTN.isDisplayed();
        	 
        	 if (d==true)
        	 {
        		 System.out.println("TC0"+(x+1)+"-PBTC--Back to Product Button is clickable TC is Passed\n");
        	 }
        	 else
        	 {
        		 System.out.println("TC0"+(x+1)+"-PBTC---Back to Product Button is clickable TC is Failed\n");
        	 }
        	 
        	  
        	 
        	 }
        	 
        	 
        	 
         }
       
}
