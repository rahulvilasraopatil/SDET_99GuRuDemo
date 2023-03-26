package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestLayer.BaseClass;

public class LoginPage extends BaseClass
{
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (name="uid")
	private WebElement username;
	
	@FindBy (name="password")
	private WebElement pass;
	
	@FindBy(name="btnLogin")
	private WebElement loginbutton;
	
	public void enterusername(String user)
	{
		username.sendKeys(user);
	}
	
	public void enterpass(String password)
	{
		pass.sendKeys(password);
	}
	
	public void clickloginbutton()
	{
		loginbutton.click();
	}
	
	
	
}
