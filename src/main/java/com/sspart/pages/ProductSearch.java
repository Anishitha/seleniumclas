package com.sspart.pages;

import org.openqa.selenium.By;

import com.sspart.util.DriverUtil;

public class ProductSearch extends DriverUtil{
	////*[text='Apple iPhone X (64GB) - Silver']
	public boolean verifyProductSearchResult(String productname) {
		
		try {
			return driver.findElement(By.xpath("//*[text()='"+productname+"']")).isDisplayed();
		}catch (Exception e) {
			return false;
		}
	}
	public void selectProduct(String productname) {
		driver.findElement(By.xpath("//*[text()='"+productname+"']")).click();
	}
}
