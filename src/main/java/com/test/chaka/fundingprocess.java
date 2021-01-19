package com.test.chaka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class fundingprocess extends loginTest {
	
@Test(priority =1)	
	public void fundaccnt() {
		
		// clicking the Fund Portfolio
		String funditbtn = "/html/body/div[1]/main/section/section/section[2]/section/button";
		WebElement fundbtn = driver.findElement(By.xpath(funditbtn));
		fundbtn.click();
		
		
		// Clicking the Fund your local wallet button
		String fundlclw = "/html/body/div[1]/div[2]/div/div[2]/div/div[3]/div[2]/div[2]/button[1]";
		WebElement fundLclWalt = driver.findElement(By.xpath(fundlclw));
		fundLclWalt.click();
	}
	

}
