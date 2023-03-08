package com.SauceDemo.Base;

import org.testng.annotations.Test;

import com.SauceDemo.POM.SauceDemoPomClass;

public class Class2 extends SauceDemoBaseClass2
{
       
	@Test 
	public void m1()
	{	
		SauceDemoPomClass lp=new SauceDemoPomClass(saucedemo); 
 	   
   	 lp.usersendN("prakash");
     	 System.out.println("Invalid username is entered");
     	 lp.passsendN("jadhav");
     	 System.out.println("Invalid password is entered");
     	 lp.loginclick();
     	 System.out.println("login Button is clicked");
	}
	@Test (dependsOnMethods={"m1"})
	public void m2()
	{
		
		System.out.println("prakash");
		
		
		
		
	}
	
	
	
}
