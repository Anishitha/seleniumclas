package com.sspart.pages;

import org.openqa.selenium.By;

import com.sspart.util.DriverUtil;

public class Home extends DriverUtil {
	
	public void navigatetoHome() {
		initiateDriver();
		
		driver.get(props.getProperty("amazon.url"));
	}
	public void searchProduct(String query) {
		driver.findElement(By.id(props.getProperty("amazon.searchbox"))).sendKeys(query);
		driver.findElement(By.xpath(props.getProperty("amazon.searchbutton"))).click();
	}
}
