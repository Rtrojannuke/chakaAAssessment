package com.test.chaka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testBase {
	
	static WebDriver driver;
	// String browser;
	static String projectrail = System.getProperty("user.dir");

	
	
@BeforeTest()
public void beforerunning() {
	
	System.setProperty("webdriver.chrome.driver", projectrail+"//bdriver//chromedriver");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://chaka.ng/");	
	driver.getTitle();	
	
	ChromeOptions options  = new ChromeOptions();
	options.addArguments("--disable-popup-blocking");
}

	
	

}
