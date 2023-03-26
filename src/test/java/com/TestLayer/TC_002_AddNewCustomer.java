package com.TestLayer;

import org.testng.annotations.Test;

import com.PageObjects.AddNewCustomerPage;
import com.PageObjects.LogOutPAge;
import com.PageObjects.LoginPage;

public class TC_002_AddNewCustomer extends BaseClass
{
	@Test
	public void AddNewCustomer() throws InterruptedException
	{
		LoginPage obj=new LoginPage(driver);
		obj.enterusername(login);
		obj.enterpass(password);
		obj.clickloginbutton();
		
		Thread.sleep(3000);
		
		AddNewCustomerPage obj2=new AddNewCustomerPage(driver);
		obj2.clickonAddNewCust();
		
		//Thread.sleep(2000);
		System.out.println("clicked");
		
		//obj2.enterCustNAme("rahul");
		System.out.println("name entered");
		
	}
	
	
	
	
	
	
}
