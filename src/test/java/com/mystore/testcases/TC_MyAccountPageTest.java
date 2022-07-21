package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobject.AccountCreationDetails;
import com.mystore.pageobject.Indexpage;
import com.mystore.pageobject.Myaccount;
import com.mystore.pageobject.RegisteredUserAccount;

public class TC_MyAccountPageTest extends BaseClass {
	@Test
	public void verifyRegistrationAndLogin()
	{
		//open url
		driver.get(url);
		logger.info("url open");
		
		Indexpage pg= new Indexpage(driver);
		pg.clickOnSignIn();
		logger.info("Clicked on sign in link");
		
		Myaccount myAcpg= new Myaccount(driver);
		myAcpg.enterCreateEmailAddress("ayanmukherjee211@gmail.com");
		logger.info("Email address entered in create account section");
		myAcpg.clickSubmitCreate();
		logger.info("clicked on create an account button");
		
	 AccountCreationDetails	accCreationPg = new AccountCreationDetails(driver);
	 accCreationPg.selectTitleMrs();
	 accCreationPg.enterCustomerFirstName("Dweep");
	 accCreationPg.enterCustomerLastName("Bhowmick");
	 accCreationPg.enterAddressFirstName("Dweep");
	 accCreationPg.enterAddressLastName("Bhowmick");
	 accCreationPg.enterPassword("Dweep@123");
	 accCreationPg.enterAddressFirstName("Dweep");
	 accCreationPg.enterAddressLastName("Bhowmick");
	 accCreationPg.enterAddress("389/b Anandamath Ichhapur");
	 
	 accCreationPg.enterCity("Kolkata");
	 accCreationPg.SelectState("Alabama");
	 accCreationPg.enterPostcode("00000");
	 accCreationPg.selectCountry("United States");
	 accCreationPg.enterMobilePhone("7980871703");
	 accCreationPg.enterAlias("Home");
	 
	 logger.info("enterd user details on account creation page");
	accCreationPg.clickOnRegister();
	 logger.info("clicked on Register button");
	 
	 RegisteredUserAccount regUser=new RegisteredUserAccount(driver);
	 String username = regUser.getUserName();
	 
	 Assert.assertEquals("Dweep Bhowmick", username);
	
	
	}

}
