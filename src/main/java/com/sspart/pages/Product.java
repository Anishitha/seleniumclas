package com.sspart.pages;

import org.openqa.selenium.By;

import com.sspart.util.DriverUtil;

public class Product extends DriverUtil{
	public void switchToProduct(String productname) {
		for(String windowHandle : driver.getWindowHandles()) {
			driver.switchTo().window(windowHandle);
			if(driver.getTitle().contains(productname)) {
				return;
			}
		}
		
	}
	public void printPrice() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(driver.findElement(By.id(props.getProperty("amazon.dealprice"))).getText());
	}
	
	public void switchBack(String productname) {
		for(String windowHandle : driver.getWindowHandles()) {
			driver.switchTo().window(windowHandle);
			if(driver.getTitle().contains(productname)) {
				driver.close();
			}
		}
		for(String windowHandle : driver.getWindowHandles()) {
			driver.switchTo().window(windowHandle);

		}
	}	
}
