package com.qa.pagelayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.Test_Base;

public class IMDB_Page extends Test_Base {
	
	public IMDB_Page ()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (xpath = "//a[contains(text(),'December 17, 2021 (United States)')]")
	private WebElement dateimdb ;
	
	@FindBy (xpath = "(//a[contains(text(),'India')])[1]")
	private WebElement countryimdb ;
	
	public String verify_IMDB_Release_Date ()
	{
		JavascriptExecutor jse = ((JavascriptExecutor)driver) ;
		jse.executeScript("scroll(0,6200)") ;
		String text_data1 = dateimdb.getText() ;
		System.out.println("IMDB : Release Date = "+text_data1);
		return text_data1 ;
	}
	
	public String verify_IMDB_County ()
	{
		JavascriptExecutor jse = ((JavascriptExecutor)driver) ;
		jse.executeScript("scroll(0,6200)") ;
		String text_data2 = countryimdb.getText();
		System.out.println("\n" + "IMDB : Country of Origin = " + text_data2);
		return text_data2 ;
	}

}
