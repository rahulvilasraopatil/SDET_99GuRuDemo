package com.TestLayer;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObjects.LoginPage;

public class TC_001_LoginTest extends BaseClass
{
	
	@Test
	public void logincheck() throws IOException      
	{
		
		
		LoginPage obj=new LoginPage(driver);
		
		logger.info(" enter username ");
		obj.enterusername(login);
		
		logger.info(" enter password ");
		obj.enterpass(password);
		obj.clickloginbutton();
		
		
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}
		else 
		{	captureScreen(driver,"TC_001_LoginTest");
			Assert.assertTrue(false);
		}
	}

}
