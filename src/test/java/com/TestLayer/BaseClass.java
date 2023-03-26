package com.TestLayer;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.Utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	ReadConfig readconfig= new ReadConfig();
	
	public String basURL=readconfig.getURL();
	public String login=readconfig.getusername();
	public String password=readconfig.getpassword();
	
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup (String br)
	{
//		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
//		driver=new ChromeDriver();
	 
		logger = Logger.getLogger("Demo99 website");
		PropertyConfigurator.configure("Log4j.properties");
		
		if (br.equalsIgnoreCase("chrome"))
		{
		 ChromeOptions option = new ChromeOptions();
         option.addArguments("--remote-allow-origins=*");
         WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver(option);
         driver.manage().window().maximize();
		}
		else if (br.equalsIgnoreCase("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		else if (br.equalsIgnoreCase("ie"))
		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			driver.manage().window().maximize();
		}
		
		driver.get(basURL);
		
		logger.info("demo 99  website ");
		
		
		
		
		
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
		logger.info(" browser close ");
	}
	
		public void captureScreen(WebDriver driver, String tname) throws IOException{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileUtils.copyFile(source, target);
	}
	
	
}
