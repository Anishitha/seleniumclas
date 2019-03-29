package com.sspart.gmail;

import org.openqa.selenium.By;

import com.sspart.util.DriverUtil;

public class Gmail extends DriverUtil {

	public void navigatetoGmail() {
		initiateDriver();
		
		driver.get("https://mail.google.com/mail/?tab=rm/");
	}
	
	public void login() {
		
		driver.findElement(By.id("identifierId")).sendKeys("kunduranishitha");
		driver.findElement(By.className("CwaK9")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@type=\"password\"]")).sendKeys("reddy8909");
		driver.findElement(By.className("CwaK9")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		
		}
	}
}
