package com.selenium.pages;

import org.junit.Assert;

import com.selenium.utilities.Common;
import com.selenium.utilities.TestExecutor;

public class GoogleHomePage extends TestExecutor{
	
	public static String searchbox = "//input[@name='q']";
	public static String gmaillink = "//a[text()='Gmail']";
	
	
	
	
	public void clickSearchBox()
	{
		Common.clickElementByXpath(searchbox);
		
	}
	
	public void clickGmail()
	{
		Common.clickElementByXpath(gmaillink);
	
	}
	

}
