package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountCreationDetails {
	

	WebDriver ldriver;
	
	
	public AccountCreationDetails(WebDriver rdriver)
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="id_gender2")
	WebElement titleMrs;
	
	@FindBy(id="customer_firstname")
	WebElement custfirstName;
	
	@FindBy(id="customer_lastname") 
	WebElement custlastName;
	
	@FindBy(id="passwd")
	WebElement password;
	
	@FindBy(id="firstname")
	WebElement addFirstname;
	
	@FindBy(id="lastname")
	WebElement addLastname;
	
	@FindBy(id="address1")
	WebElement address1;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="id_state")
	WebElement state;
	
	@FindBy(id="postcode")
	WebElement postcode;
	
	@FindBy(id="id_country")
	WebElement country;
	
	@FindBy(id="phone_mobile")
	WebElement phone_mobile;
	
	@FindBy(id="alias")
	WebElement alias;
	
	@FindBy(id="submitAccount")
	WebElement register;
	
	public void selectTitleMrs()
	{
		titleMrs.click();
	}
	
	public void enterCustomerFirstName(String fname)
	{
		custfirstName.sendKeys(fname);
	}

	public void enterCustomerLastName(String lname)
	{
		custlastName.sendKeys(lname);
	}
	
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void enterAddressFirstName(String fName)
	{   addFirstname.clear();
		addFirstname.sendKeys(fName);
	}
	
	public void enterAddressLastName(String lName)
	{   addLastname.clear();
		addLastname.sendKeys(lName);
	}
	
	public void enterAddress(String address)
	{
		address1.sendKeys(address);
	}
	
	public void enterCity(String cityName)
	{
		city.sendKeys(cityName);
	}
	
	public void SelectState(String text)
	{
		Select obj = new Select(state);
		obj.selectByVisibleText(text);
	}
	
	public void enterPostcode(String postcodeData)
	{
		postcode.sendKeys(postcodeData);
	}
	
	public void selectCountry(String text)
	{
		Select obj = new Select(country);
		obj.selectByVisibleText(text);
	}
	
	public void enterMobilePhone(String mobile)
	{
	   phone_mobile.sendKeys(mobile);
	}
	
	public void enterAlias(String text)
	{
	   alias.clear();
	   alias.sendKeys(text);
	}
	
	public void clickOnRegister()
	{
	   register.click();
	}
	
	
	
   
	
	
	
	
	
	
	
	

}
