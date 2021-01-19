package com.test.chaka;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class loginTest extends testBase2{
	
	@Test(priority=0)
public void signin() { 
		
		// Clicking the Login button
		String login = "//*[@id=\"header\"]/nav/ul/li[1]/a";
		driver.findElement(By.xpath(login)).click();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//Confirming page has loaded completely by checking for an element
		driver.findElement(By.xpath("/html/body/div[1]/main/div/form/h3")).isDisplayed();
		
		// Variable containing email and password to the site
		String etext = "palmerray91@gmail.com";
		String ptext = "Chakatest2";
		
		
		//Entering email
		WebElement emailfield = driver.findElement(By.name("email"));
		emailfield.sendKeys(etext);
		
		
		//Entering Password
		String pwrdfield = "//*[@id=\"app\"]/main/div/form/div[2]/label/input";
		driver.findElement(By.xpath(pwrdfield)).sendKeys(ptext);
		
		//Clicking the login button
		String buttonlogin = "//*[@id=\"app\"]/main/div/form/div[4]/div[1]/button";
		driver.findElement(By.xpath(buttonlogin)).click();
		
	}


}
