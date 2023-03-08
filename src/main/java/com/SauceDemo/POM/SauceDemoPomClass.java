package com.SauceDemo.POM;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SauceDemoPomClass 
{

    WebDriver saucedemo;
	
	
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement usersendP;
	public void usersendP()
	{
		usersendP.sendKeys("standard_user");
	}
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement usersendN;
	public void usersendN(String a)
	{
		usersendN.sendKeys(a);
	}
	
	@FindBy(xpath="//input[@id='password']")
	WebElement passsend;
	public void passsend()
	{
		passsend.sendKeys("secret_sauce");
	}
	
	@FindBy(xpath="//input[@id='password']")
	WebElement passsendN;
	public void passsendN(String b)
	{
		passsend.sendKeys(b);
	}
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement loginclick;
	public void loginclick()
	{
		loginclick.click();
	}
	
	@FindBy(xpath="//input[@data-test='firstName']")
	WebElement checkoutfirstname;
	public void checkoutfirstname(String c)
	{
		checkoutfirstname.sendKeys(c);
	}
	
	@FindBy(xpath="//input[@id='last-name']")
	WebElement checkoutlastname;
	public void checkoutlastname(String d)
	{
		checkoutlastname.sendKeys(d);
	}
	
	@FindBy(xpath="//input[@id='postal-code']")
	WebElement checkoutpostalcode;
	public void checkoutpostalcode(String e)
	{
		checkoutpostalcode.sendKeys(e);
	}
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement continueclick;
	public void continueclick()
	{
		continueclick.click();
	}
	
	
	
	
	public  void SS(String s) throws IOException 
	{

		 TakesScreenshot pr= (TakesScreenshot)saucedemo;
     	 File f= pr.getScreenshotAs(OutputType.FILE);
     	 File a=new File("D:\\15 oct class\\Eclips\\"+s+".png");
     	 FileHandler.copy(f, a);
		
	}
	
	public SauceDemoPomClass(WebDriver saucedemo)
	{
		
		this.saucedemo = saucedemo;
		
		PageFactory.initElements(saucedemo, this);
	}
	

	
	
	
	
	
}
