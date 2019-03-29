package com.sspart.gmail;

import org.openqa.selenium.By;

import com.sspart.util.DriverUtil;

public class Compose extends DriverUtil{
	
	public void composemail() {
		
		driver.findElement(By.xpath("//*[@id=\":ik\"]")).click();
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
        //enter reciepient mail id
        driver.findElement(By.xpath("//*[@name=\"to\"]")).sendKeys("anishithareddy@gmail.com");
	    //enter subject line
        driver.findElement(By.xpath("//*[@name=\"subjectbox\"]")).sendKeys("Selenium");
        //enter mail body
        driver.findElement(By.xpath("//*[@id=\":p5\"]")).sendKeys("Hi How are you");
        
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		  }
	}

}
