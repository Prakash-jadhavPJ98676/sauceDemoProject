package com.SauceDemo.Base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class VerifyProductSortContainerAndOptions extends SauceDemoBaseClass2
{

	          @Test
	          public void verifyProductSortContainer()
	          {
	        	  WebElement productSortContainer=saucedemo.findElement(By.xpath("//select[@class='product_sort_container']"));
	        	  productSortContainer.click();
	        	  
	        	  WebElement containerOPN=saucedemo.findElement(By.xpath("//option[@value='az']"));
	        	  boolean y=containerOPN.isDisplayed();
	        	  
	        	  if (y)
	        		  System.out.println("\nTC01-Product Sort Container Button is Clicked TC is Pass\n");
	        	  else
	        		  System.out.println("\nTC01-Product Sort Container Button is Not Clicked TC is Fail\n");
	        	  
	        	  String a = null;
	        	  String expText=null;
	        	  for (int x=1;x<=4;x++)
	        	  {
	        		  
	        		  if(x==1)
	        		  {
	        		     a="//option[@value='az']";
	        		     expText="Name (A to Z)";
	        		  }
	        		  else if(x==2)
	        		  {
	        			 a="//option[@value='za']";
	        			 expText="Name (Z to A)";
	        		  }
	        		  else if(x==3)
	        		  {
	        			 a="//option[@value='lohi']";
	        			 expText="Price (low to high)";
	        		  }
	        		  else if(x==4)
	        		  {
	        			 a="//option[@value='hilo']";
	        			 expText="Price (high to low)";
	        		  }
	        		  
	        		  WebElement productSortOptions=saucedemo.findElement(By.xpath(""+a+""));
	        		  String actualText=productSortOptions.getText();
	        		  System.out.println(actualText);
		        	  boolean c=productSortOptions.isDisplayed();
	        		  
	        		  if (c==true)
	        		  {
	        			  System.out.println("TC0"+(x+1)+"--"+expText+"--Option is Available TC is Passed");
	        		  }
	        		  else
	        		  {
	        			  System.out.println("TC0-"+(x+1)+"--"+expText+"--Option is Not Available TC is Failed");
	        			  
	        		  }
	        		  
	        		  if (actualText.equals(expText))
	        		  {
	        			  System.out.println("TC0"+(x+1)+"--"+expText+"--Available Option Text Is Valid");
	        		  }
	        		  else
	        		  {
	        			  System.out.println("TC0"+(x+1)+"--"+expText+"--Available Option Text Is InValid");
	        		  }
	        		  
	        	  }
	        	  
	        	  
	          }
	     
}
