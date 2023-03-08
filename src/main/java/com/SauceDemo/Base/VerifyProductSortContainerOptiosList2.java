package com.SauceDemo.Base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class VerifyProductSortContainerOptiosList2 extends SauceDemoBaseClass2
{
	@Test
    public void VerifyOptionNameZtoAList()
    {
 	   
 	   System.out.println("\n---Verification of Test product Sort Container List Of Option->[ Name (Z to A) ]---\n");
 	   WebElement productSortContainer=saucedemo.findElement(By.xpath("//select[@class='product_sort_container']"));
        productSortContainer.click();
 	   
       
        
		   WebElement containerOPN=saucedemo.findElement(By.xpath("//option[@value='za']"));
        containerOPN.click();
        List<WebElement> list=saucedemo.findElements(By.xpath("//html//div[2]//div//a//div"));
        for(int i=0;i<list.size();i++)
        {
			String a=list.get(i).getText();	
		
			System.out.println(a);
			switch(i)
			{
			
			case 0:
			{
				System.out.println("--TC01- option no"+(i+1));
				String l="Test.allTheThings() T-Shirt (Red)";
				if (a.equals(l))
					System.out.println("TC0"+(i+1)+"-Test case is Passed");
				else
					System.out.println("TC0"+(i+1)+"-Test case is Failed");
				System.out.println("------------------------------------------");
			}
			break;
			case 1:
			{
				System.out.println("--TC02- option no"+(i+1));
				String l="Sauce Labs Onesie";
				if (a.equals(l))
					System.out.println("TC0"+(i+1)+"-Test case is Passed");
				else
					System.out.println("TC0"+(i+1)+"-Test case is Failed");
				System.out.println("------------------------------------------");
			}
			break;
			
			case 2:
			{
				System.out.println("--TC03- option no"+(i+1));
				String l="Sauce Labs Fleece Jacket";
				if (a.equals(l))
					System.out.println("TC0"+(i+1)+"-Test case is Passed");
				else
					System.out.println("TC0"+(i+1)+"-Test case is Failed");
				System.out.println("------------------------------------------");
			}
			break;
			
			
			case 3:
			{
				
				System.out.println("--TC04- option no"+(i+1));
				String l="Sauce Labs Bolt T-Shirt";
				if (a.equals(l))
					System.out.println("TC0"+(i+1)+"-Test case is Passed");
				else
					System.out.println("TC0"+(i+1)+"-Test case is Failed");
				System.out.println("------------------------------------------");
			}
			break;
			
			
			case 4:
			{
				
				System.out.println("--TC05- option no"+(i+1));
				String l="Sauce Labs Bike Light";
				if (a.equals(l))
					System.out.println("TC0"+(i+1)+"-Test case is Passed");
				else
					System.out.println("TC0"+(i+1)+"-Test case is Failed");
				System.out.println("------------------------------------------");
			}
			break;
			
			case 5:
			{
				
				System.out.println("--TC06- option no"+(i+1)+"-Test case for Name (A to Z)-- ");
				String l="Sauce Labs Backpack";
				if (a.equals(l))
					System.out.println("TC0"+(i+1)+"-Test case is Passed");
				else
					System.out.println("TC0"+(i+1)+"-Test case is Failed");
				System.out.println("------------------------------------------");
			}
			break;
			
			
			}
			
			}

  	   System.out.println("\n---Verification of Test product Sort Container List Of Option->[ Name (Z to A) ]  Is Compleated---\n");
        
		
		
    }
	
	
}
