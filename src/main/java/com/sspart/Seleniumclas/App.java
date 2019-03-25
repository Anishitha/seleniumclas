package com.sspart.Seleniumclas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Hello world!
 *
 */
public class App 
{
	
	 static WebDriver driver = null;
	 
	 @Given("^I am in background given$")
	 public void i_am_in_background_given() throws Throwable {
	     System.out.println("I am in background given");
	     if (driver == null) {
	    	 System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
	    	 driver = new ChromeDriver();
	     }
	 }
	
	@Given("^i am in given step$")
	public void i_a_in_given_steps() throws Throwable {
	    System.out.println("i am in given step");
	    driver.get("https://www.amazon.in");
	}
	@Then("^i am in then step$")
	public void i_am_in_Then_step() throws Throwable {
		System.out.println("i am in then step");
	}

	@When("^i am in when step$")
	public void i_am_in_When_step() throws Throwable {
		System.out.println("i am in when step");
	}

	@And("^i am in and step$")
	public void i_am_in_And_step() throws Throwable {
		System.out.println("i am in and step");
	}

	@But("^i am in but step$")
	public void i_am_in_But_step() throws Throwable {
		System.out.println("i am in but step");
		driver.quit();
	}

}
