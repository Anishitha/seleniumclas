package com.sspart.Seleniumclas;

import com.sspart.util.DriverUtil;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SeleniumStepDef extends DriverUtil{
	
	static WebDriver driver = null;
	
	@Given("^I am in given class$")
	 public void i_am_in_given_class() throws Throwable {
	     System.out.println("I am in given class");
	     initiateDriver();
	 }
	 

	@Given("^i am in given selenium$")
	public void i_am_in_given_selenium() throws Throwable {
		System.out.println("i am in given selenium");
		driver.get(props.getProperty("guru99.click here")); 
	}

	@Then("^i am in then selenium$")
	public void i_am_in_then_selenium() throws Throwable {
		System.out.println("i am in then selenium");
		String currentWindowHandle = driver.getWindowHandle();

		driver.findElement(By.linkText(props.getProperty("guru99.popup.url"))).click();
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		Set<String> WindowHandles = driver.getWindowHandles();
		
		for(String eachHandle : WindowHandles) {
			
			driver.switchTo().window(eachHandle);
			
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			boolean bool = false;			
			try {
				
				bool = driver.findElement(By.xpath("//*[@name=\"emailid\"]")).isDisplayed();
			
			}catch (Exception ignore) {
				
			}
		
		if(bool) {
			
			driver.close();
		}
		
	driver.switchTo().window(currentWindowHandle);
	
	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	  }
	}
	}

	@When("^i am in when selenium$")
	public void i_am_in_when_selenium() throws Throwable {
	    System.out.println("i am in when selenium");
	}

	@And("^i am in and selenium$")
	public void i_am_in_and_selenium() throws Throwable {
		System.out.println("i am in and selenium");
	}

	@But("^i am in but selenium$")
	public void i_am_in_but_selenium() throws Throwable {
		System.out.println("i am in but selenium");
	}

}
