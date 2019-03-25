package com.sspart.util;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtil extends ResourceUtil{
	
	public static WebDriver driver = null;
	
	public void initiateDriver() {
		
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			try {
				initiateLocators();
				}catch (IOException e) {
					e.printStackTrace();
				}
			
		}
	}
	
	public void quitDriver() {
		driver.quit();
	}
	

}
