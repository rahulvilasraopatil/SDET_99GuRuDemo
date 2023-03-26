package com.TestLayer;

import org.testng.annotations.Test;

import com.PageObjects.LogOutPAge;
import com.PageObjects.LoginPage;

public class TC_003_LogoutTest extends BaseClass
{
	
	@Test
	public void secondtrial() throws InterruptedException
	{
		LoginPage obj=new LoginPage(driver);
		System.out.println("1");
		obj.enterusername(login);
		System.out.println("2");
		obj.enterpass(password);
		System.out.println("3");
		obj.clickloginbutton();
		System.out.println("4");
		
		Thread.sleep(3000);
		System.out.println("5");
		LogOutPAge obj1=new LogOutPAge(driver);
		System.out.println("6");
		obj1.clickonLogout();
		System.out.println("7");
		
	}

}
