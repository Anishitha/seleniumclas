package com.sspart.gmail;

import org.openqa.selenium.By;

import com.sspart.util.DriverUtil;

public class Send extends DriverUtil{
	
	public void sendmail() {
		
		driver.findElement(By.xpath("//*[@id=\":nq\"]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Email sent successfully");
		
	}
	

}
