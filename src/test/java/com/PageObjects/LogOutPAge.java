package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestLayer.BaseClass;

public class LogOutPAge extends BaseClass
{
	WebDriver driver;
	
	public LogOutPAge(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='Log out']")
	private WebElement logoutButton;
	
	public void clickonLogout()
	{
		logoutButton.click();
	}
	
	
}
