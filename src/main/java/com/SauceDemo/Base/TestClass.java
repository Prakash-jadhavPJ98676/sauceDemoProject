package com.SauceDemo.Base;




import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.SauceDemo.POM.SauceDemoPomClass;

public class TestClass 
{

//	public static void main(String[] args) throws InterruptedException, IOException 
//	{
//		
//		
//		
		
//		System.setProperty("webdriver.chrome.driver",
//				"D:\\15 oct class\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
//
//    			WebDriver saucedemo =  new ChromeDriver();
//    			
//    			
//    			saucedemo.get("https://www.saucedemo.com/");
//    			
//    			saucedemo.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//    			
//    			SauceDemoPomClass b=new SauceDemoPomClass(saucedemo);
//		        
////    			b.usersend("fgf");
//    			System.out.println("username is Entered");
//    			b.passsend();
//    			System.out.println("password is Entered");
//    			b.loginclick();
//    			System.out.println("clicked on login button\n");
////    			
////    			System.out.println("To check the title of home-page is same as per the document");
////    			
////    			String Etitle = "Swag Lab";
////    			String Atitle= saucedemo.getTitle();
////    			System.out.println(Etitle.equals(Atitle));
//    			
////    			for (int x=1;x<=6;x++)
////    			{
////    				WebElement id=saucedemo.findElement(By.xpath("//div[@class='inventory_item']["+x+"]"));
////    				System.out.println(id.getText());
////    				
////    				
////    				System.out.println("===================================================================");
//////    				WebElement id=saucedemo.findElement(By.xpath("//div[@class='inventory_item_name'"));
//////    				System.out.println(id.getText());
////    			}
//    			
//    			
//    			// first test case settings option
//    			WebElement menu= saucedemo.findElement(By.xpath("//Button[@id='react-burger-menu-btn']"));
//    			menu.click();
//
//    			for(int x=1;x<=4;x++)
//    			{
//    				WebElement list= saucedemo.findElement(By.xpath("//a[@class='bm-item menu-item']["+x+"]"));
//    				String a=list.getText();
//    				System.out.println(a);
//
//    			String l="ALL ITEMS";
//				String m="ABOUT";
//				String n="LOGOUT";
//				String o="RESET APP STATE";
//    				
//    				if (a.equals(l)||a.equals(m)||a.equals(n)||a.equals(o))
//			         {
//				           System.out.println(x+"-test case is passed");
//			         }
//    				else
//    				 {
//    					System.out.println(x+"-test case is failed");
//    				 }
//    					
//    			}
//    			
//    			
//    			
//    			
//    			
//    			
//    			
//    			
//    			
//    			
//    			
//    			
//    			
//    			
//    			// second test case username text
//    			WebElement c=saucedemo.findElement(By.xpath("//div[@id='login_credentials']"));
//    			String w= c.getText();
//    			System.out.println(w);
//    			
//    			 String exp="Accepted usernames are:\r\n"
//    			 		+ "standard_user\r\n"
//    			 		+ "locked_out_user\r\n"
//    			 		+ "problem_user\r\n"
//    			 		+ "performance_glitch_user";
//    			
//    			if (w.equals(exp))
//    				System.out.println("test case is passed");
//    			else
//    				System.out.println("test case is failed");
//    			
//    			
//    			
//    			
//    			
//    			
//    			
////    			WebElement list= saucedemo.findElement(By.xpath("//nav[@class=\"bm-item-list\"]"));
////				String List=list.getText();
////    			
////    			System.out.println(List);
//    			
//    			
//    			WebElement menu= saucedemo.findElement(By.xpath("//Button[@id='react-burger-menu-btn']"));
//    			menu.click();
//    			
//    			List<WebElement> list=saucedemo.findElements(By.xpath("//html//div//nav//a"));
//    			for (int i=0;i<list.size();i++)
//    			{
//    				String a=list.get(i).getText();	
//    				System.out.println(a);
//    				String l="ALL ITEMS";
//    				String m="ABOUT";
//    				String n="LOGOUT";
//    				String o="RESET APP STATE";
//  	
//    				if (a.equals(l)||a.equals(m)||a.equals(n)||a.equals(o))
//    				{
//    					System.out.println(i+"-test case is passed");
//    				}
//    				else
//    				{
//    					System.out.println(i+"-test case is failed");
//    				}
//    				
//    			}
//    			
//    			b.SS("looogin");
//    			
//    			
//    			
//    			
//    			
//    			
//				
//    			
//	
//	
//	
	}
	
	
	
	
	

