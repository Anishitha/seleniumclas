package com.sspart.Seleniumclas;

import com.sspart.gmail.Compose;
import com.sspart.gmail.Gmail;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import net.bytebuddy.asm.Advice.Enter;

public class GmailLoginStepDef {
	
	Gmail gmail = new Gmail();
	Compose composemail = new Compose();

	@Then("^I will navigate to Gmail home page$")
	public void i_will_navigate_to_Gmail_home_page() throws Throwable {
		
		gmail.navigatetoGmail();
    
	}

	@Then("^I will Login to Gmail$")
	public void i_will_Login_to_Gmail() throws Throwable {
	    gmail.login();
	}

	@Then("^I will Composemail$")
	public void i_will_Composemail() throws Throwable {
		composemail.composemail();
		
	}

	@Then("^I will sendmail$")
	public void i_will_sendmail() throws Throwable {
		
	}

}
