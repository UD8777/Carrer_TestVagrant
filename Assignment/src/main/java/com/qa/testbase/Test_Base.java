package com.qa.testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.qa.pagelayer.IMDB_Page;
import com.qa.pagelayer.WIKI_Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Base {
	
	public static WebDriver driver ;
	public static IMDB_Page country ;
	public static WIKI_Page r_date ;
	
	protected static String url1 = "https://www.imdb.com/title/tt9389998/" ;
	protected static String url2 = "https://en.wikipedia.org/wiki/Pushpa:_The_Rise" ;
	
	@BeforeClass
	public void start ()
	{
		System.out.println("\nAutomation Framework started....\n");
	}
	
	@AfterClass
	public void stop ()
	{
		System.out.println("\nAutomation Framework stopped.\n");
	}
	
	@BeforeMethod
	public void setupbrowser () 
	{
		 String browser = "chrome" ;
		
		if (browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver () ;
		}
		
		else if (browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver () ;
		}
		
		else if (browser.equalsIgnoreCase("firefox"))
		{
			driver = WebDriverManager.firefoxdriver().create();
		}
		
		else 
		{
			System.out.println("Enter Valid Browser Details");
		}
		
		driver.get(url1);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)) ;
			 
		 country = new IMDB_Page () ;
		 r_date = new WIKI_Page () ;
	}
	
	
	@AfterMethod
	public void tearDown ()
	{
		 driver.quit();
	}

}
