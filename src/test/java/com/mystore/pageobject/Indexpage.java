package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Indexpage {
	
	// create object of webdriver
	
	WebDriver ldriver;
	
	
	public Indexpage(WebDriver rdriver)
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	//identify webelements
	@FindBy(linkText="Sign in")
	WebElement signIn;
	
	//identify action on webelemt
	public void clickOnSignIn()
	{
		signIn.click();
	}
	

}
