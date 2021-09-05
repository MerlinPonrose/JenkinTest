package com.selenium.stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import com.selenium.pages.GoogleHomePage;
import com.selenium.utilities.Common;
import com.selenium.utilities.TestExecutor;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Google extends TestExecutor{
	
	@Given("user launch browser and open URL {string} using selenium")
	public void user_launch_browser_and_open_URL_using_selenium(String string) {
		System.setProperty("webdriver.chrome.driver", "e:\\Karen Amy\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get(string);
	}

	
	@Given("user launch browser using selenium")
	public void user_lauch_browser()
	{
		System.setProperty("webdriver.chrome.driver", "e:\\Karen Amy\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@When("User Open the URL {string} in selenium")
	public void user_Open_the_URL_in_selenium(String string) {
	  driver.get(string);
	}


	@When("User click on searchbox")
	public void user_click_on_searchbox() {
		System.setProperty("webdriver.chrome.driver", "e:\\Karen Amy\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		hmpg.clickSearchBox();
	    
	}

	@Then("User verigy page title is {string}")
	public void user_verigy_page_title_is(String string) {
		com.verifytitle(string);
	}

	@When("User click on Gmail link")
	public void user_click_on_Gmail_link() {
	  com.clickElementByXpath(hmpg.gmaillink);
	}

	@Then("User verify page title is {string}")
	public void user_verify_page_title_is(String string) {
		
		com.verifytitle(string);
	}

	@Then("I verify the page is correct")
	public void i_verify_the_page_is_correct() {
	   
	}



}
