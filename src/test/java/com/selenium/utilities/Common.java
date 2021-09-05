package com.selenium.utilities;

import org.junit.Assert;
import org.openqa.selenium.By;

public class Common extends TestExecutor{
	
	
	public static  void clickElementByXpath(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
	}
	
	
	public void clickElementById(String id)
	{
		driver.findElement(By.id(id)).click();
	}
	
	
	public void sendvalue(String xpath, String value)
	{
		driver.findElement(By.xpath(xpath)).click();
		driver.findElement(By.xpath(xpath)).clear();
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}
	
	
	public void verifytitle(String Expectedtitle)
	{
		String title = driver.getTitle();
		Assert.assertEquals(title, Expectedtitle);
				
	}

}
