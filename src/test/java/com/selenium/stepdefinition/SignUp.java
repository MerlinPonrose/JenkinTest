package com.selenium.stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import com.selenium.utilities.TestExecutor;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SignUp extends TestExecutor{
	
	@Given("User launch and Open {string}")
	public void user_launch_and_Open(String string) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\AprilSelenium\\exe\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get(string);
	}

	@When("User enter username {string}")
	public void user_enter_username(String string) {
		com.sendvalue(sign.email, string);
	    
	}

	@When("User enter password {string}")
	public void user_enter_password(String string) {
	   com.sendvalue(sign.password, string);
	}



}
