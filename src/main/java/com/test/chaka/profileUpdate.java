package com.test.chaka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class profileUpdate extends fundingprocess{
	
	
	@Test(priority=2)
	public void pupdate() {
		
		
		// Clicking the Account button
		String accntbtn = "/html/body/div[1]/header/nav/ul/li";
		WebElement accntbttn = driver.findElement(By.xpath(accntbtn));
		accntbttn.click();
		
		// Clicking on the Settings button
		String settings = "/html/body/div[1]/header/nav/ul/li/span/span/div/a[8]";		
		WebElement setting = driver.findElement(By.xpath(settings));		
		setting.click();
		
		//Entering First and Last name
		String namefield = "/html/body/div[1]/main/section/section/div/form[1]/section[1]/div/label/input";
		WebElement namefild = driver.findElement(By.xpath(namefield));
		namefild.sendKeys("Mubarak Arimiyah");
		
		// Clicking Submit button
		String submit = "/html/body/div[1]/main/section/section/div/form[1]/section[2]/button";
		WebElement submitbtn = driver.findElement(By.xpath(submit));
		submitbtn.click();
		
		
	}

}
