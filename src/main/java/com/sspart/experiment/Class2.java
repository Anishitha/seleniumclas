package com.sspart.experiment;

import org.openqa.selenium.By;

import com.sspart.util.DriverUtil;

public class Class2 extends DriverUtil {
	public void method2() {
		driver.findElement(By.xpath("Amazon Pay")).click();
	}
}
