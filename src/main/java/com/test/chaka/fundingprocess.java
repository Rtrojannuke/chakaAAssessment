package com.test.chaka;

import org.openqa.selenium.Alert;
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
		
		//Entering Amount to fund into Account 
		String amountbox = "/html/body/div[1]/div[2]/div/div[2]/div/div[3]/div[2]/div[2]/div/label/input";
		WebElement amnttf = driver.findElement(By.xpath(amountbox));
		amnttf.sendKeys("5000");
		
		//Clicking the continue button
		String cntnue = "/html/body/div[1]/div[2]/div/div[2]/div/div[3]/div[2]/div[2]/button";
		WebElement contnue = driver.findElement(By.xpath(cntnue));
		contnue.click();
		
		//Clicking the preferred payment method
		String pPymntMeth = "/html/body/div[1]/div[2]/div/div[2]/div/div[3]/div[2]/div[2]/button[2]";
		WebElement pPymntMtd = driver.findElement(By.xpath(pPymntMeth));
		pPymntMtd.click();
		
		//Page Confirmation
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[3]/div[2]/div[1]/p[1]")).isDisplayed();
		
		//Since the selected payment method is bank transfer, therefore the pop-up(payment transfer pop-up) will be closed
		String cancelicon = "/html/body/div[1]/div[2]/div/div[2]/div/div[1]/a[2]";
		WebElement cancelbtn = driver.findElement(By.xpath(cancelicon));
		cancelbtn.click();
		
		
	}
	

}
