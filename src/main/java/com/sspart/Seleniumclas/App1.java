package com.sspart.Seleniumclas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class App1 {
	static WebDriver driver = null;
	 
		@Given("^i am in given step of APP(\\d+)$")
		public void i_am_in_given_step_of_APP(int arg1) throws Throwable {
			System.out.println("i am in given step of APP(\\d+)");
			if (driver == null) {
				System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
				driver = new ChromeDriver();
			}
		}
		@Then("^i am in then step of APP(\\d+)$")
		public void i_am_in_then_step_of_APP(int arg1) throws Throwable {
			
			driver.get("https://www.amazon.in");
		}
		@When("^i am in when step of APP(\\d+)$")
		public void i_am_in_when_step_of_APP(int arg1) throws Throwable {
			
			WebElement searchElement = driver.findElement(By.id("twotabsearchtextbox"));	
			searchElement.sendKeys("iPhone");
			driver.findElement(By.className("Amazon Pay")).click();;
		}

	@And("^i am in and step of APP(\\d+)$")
	public void i_am_in_and_step_of_APP(int arg1) throws Throwable {
		
		driver.findElement(By.linkText("Click Here")).click();
	}

	@But("^i am in but step of APP(\\d+)$")
	public void i_am_in_but_step_of_APP(int arg1) throws Throwable {
	
		Select s = new Select(driver.findElement(By.xpath("//*[@title=\"Search in\"]")));
		s.selectByVisibleText("Electronics");
	}		
}



