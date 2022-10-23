package stepDefinitions;

import org.openqa.selenium.WebDriver;

import base.DriverInitilize;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GmailAccountCreation extends DriverInitilize {
	
	
	WebDriver driver;
	
	
	
	@Given("I initialize chrome driver")
	public void i_initialize_chrome_driver() {
	   
		driver = initiateDriver();
		
	}

	
	@Given("I am navigating to gmail signup url")
	public void i_am_navigating_to_gmail_signup_url() {
	  
		System.out.println("*************************I am navigating to gmail signup url*************************");
		
	}
	
	
	@When("I fill required details to create account with {string} and {string}")
	public void i_fill_required_details_to_create_account_with_and(String string, String string2) {
		
		System.out.println("*************************I fill required details to create account with*************************");
		
		
		
		
	}

	@Then("I verify account is created")
	public void i_verify_account_is_created() {

		System.out.println("*************************I verify account is created*************************");
	}


}
