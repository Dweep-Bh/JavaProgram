package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myaccount {
	
	
WebDriver ldriver;
	
	
	public Myaccount(WebDriver rdriver)
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	//identify webelements
	@FindBy(id="email_create")
	WebElement createEmaild;
	
	@FindBy(id="SubmitCreate")
	WebElement SubmitCreate;
	
	
	//identify action on webelemt
	public void enterCreateEmailAddress(String emailAdd)
	{
		createEmaild.sendKeys(emailAdd);
	}
	
	public void clickSubmitCreate()
	{
		SubmitCreate.click();
	}
	

}
