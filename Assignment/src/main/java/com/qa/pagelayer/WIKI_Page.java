package com.qa.pagelayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.Test_Base;

public class WIKI_Page extends Test_Base {
	
	public WIKI_Page ()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath = "//li[contains(text(),'December')]")
	private WebElement dt ;

	@FindBy (xpath = "//td[contains(text(),'India')]")
	private WebElement con ;
	
	public String verify_Wiki_Release_Date ()
	{
		driver.navigate().to(url2);
		JavascriptExecutor j = ((JavascriptExecutor)driver) ;
		j.executeScript("scroll (0,700)");	
		String text_data3 = dt.getText();
		System.out.println("\n" + "WIKI : Release Date = " + text_data3);
		return text_data3 ;
	}
	
	public String verify_wiki_county ()
	{
		driver.navigate().to(url2);
		JavascriptExecutor j = ((JavascriptExecutor)driver) ;
		j.executeScript("scroll (0,700)");
		String text_data4 = con.getText() ;
		System.out.println("\n" + "WIKI : Country = " + text_data4);
		return text_data4;
	}
	
}
