package com.selenium.stepdefinition;

import com.selenium.pages.GoogleHomePage;
import com.selenium.utilities.TestExecutor;

import cucumber.api.java.Before;

public class Gmail extends TestExecutor{
	
	
@Before(order=1)
	public void testdisplay()
	{
		hmpg.clickSearchBox();
	}
	
	
	
}
