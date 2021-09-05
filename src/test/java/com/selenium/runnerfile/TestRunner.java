package com.selenium.runnerfile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Karen Amy\\eclipse-workspace\\BDDCucumber\\src\\test\\java\\com\\selenium\\feature",
				glue = "com.selenium.stepdefinition",
				plugin= {"pretty","html:test-output"},
				tags= {"@multipletestdata"})
public class TestRunner {

}
