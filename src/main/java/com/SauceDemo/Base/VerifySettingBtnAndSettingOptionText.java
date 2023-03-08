package com.SauceDemo.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class VerifySettingBtnAndSettingOptionText extends SauceDemoBaseClass2
{
           @Test
           public void VerifySettingBtnAndSettingOptionText()
           {
        	   System.out.println("\n--Verify Setting Button Is clickable Or Not--");
        	 WebElement menuBTN= saucedemo.findElement(By.xpath("//Button[@id='react-burger-menu-btn']"));
        	 menuBTN.click();
   			 
   			 WebElement menuOPN= saucedemo.findElement(By.xpath("//a[@class='bm-item menu-item'][1]"));
   			 boolean b=menuOPN.isDisplayed();
   			 
   			 if (b==true)
   			 {
   				 System.out.println("TC01-Setting Button Is Clicked TC Is Passed\n");
   			 }
   			 else 
   			 {
   				System.out.println("TC01-Setting Button Is Not Clicked TC Is Failed\n");
   			 }

   			 
   			System.out.println("--Verify Text's Available In The Setting Option--");
   			 
   			 for(int x=1;x<=4;x++)
   			 {
   				WebElement list= saucedemo.findElement(By.xpath("//a[@class='bm-item menu-item']["+x+"]"));
   				String a=list.getText();
   				System.out.println(a);
         
   			    String l="All Items";
				String m="About";
				String n="Logout";
				String o="Reset App State";
   				
   				if (a.equals(l)||a.equals(m)||a.equals(n)||a.equals(o))
			         {
				           System.out.println("TC0"+(x+1)+"-test case is passed");
			         }
   				else
   				 {
   					System.out.println("TC0"+(x+1)+"-test case is failed");
   				 }
   					
   			   }
   			
   			 
   			 System.out.println("\n---Verification Is Complete---\n");
           }
	
	
	
	
	
}
