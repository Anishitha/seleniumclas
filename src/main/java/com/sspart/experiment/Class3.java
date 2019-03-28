package com.sspart.experiment;

import org.openqa.selenium.By;

import com.sspart.util.DriverUtil;

public class Class3 extends DriverUtil {
	public void method3() {
		driver.findElement(By.xpath("Search box")).sendKeys("iPhone");
	}
}
