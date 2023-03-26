package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import com.TestLayer.BaseClass;

public class AddNewCustomerPage  extends BaseClass
{
	WebDriver driver;
	
	public AddNewCustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@CacheLookup
	//@FindBy(xpath="//a[text()='New Customer']")
	@FindBy( how= How.XPATH, using="//a[text()='New Customer']")
	private WebElement NewCustButton;
	
	@CacheLookup
	@FindBy(xpath="(//input[@type=\"text\"])[1]")
	private WebElement customernamElement;
	
	
	public void clickonAddNewCust()
	{
		NewCustButton.click();
	}
	
	public void enterCustNAme(String name)
	{
		customernamElement.sendKeys(name);
	}
	
	
}
