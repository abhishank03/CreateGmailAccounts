package stepDefinitions;

import org.openqa.selenium.WebDriver;

import base.DriverInitilize;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CreateAccountPage;
import pageObjects.LandingPage;

public class GmailAccountCreation extends DriverInitilize {
	
	WebDriver driver;
	
	CreateAccountPage createAccountPage;
	
	
	
	@Given("I initialize chrome driver")
	public void i_initialize_chrome_driver() {
		
		
		System.out.println("*************************I initialize chrome driver*************************");
	   
		driver = initiateDriver();
		
	}

	
	@Given("I am navigating to gmail signup url")
	public void i_am_navigating_to_gmail_signup_url() {
	  
		System.out.println("*************************I am navigating to gmail signup url*************************");
	
		
		driver.get(DriverInitilize.url);
		driver.manage().window().maximize();
	}
	
	@When("I click on create account button")
	public void i_click_on_create_account_button() {
		
		System.out.println("*************************I click on create account button*************************");
		LandingPage landingPage = new LandingPage(driver);
	//	landingPage.clickOnCreateAccount();
		
		
	   
	}

	@Then("I provide account creation related details with {string}  ,{string} , {string} ,{string} , {string}")
	public void i_provide_account_creation_related_details_with(String FirstName, String LastName, String Username, String Passwd, String ConfirmPasswd) throws InterruptedException {
	   
		System.out.println("*************************I provide account creation related details with*************************");
	    createAccountPage = new CreateAccountPage(driver);
		createAccountPage.fillSignupDetails( FirstName,  LastName,  Username,  Passwd,  ConfirmPasswd);
		createAccountPage.clickNext();

		boolean validemailid = createAccountPage.validateUsername();
		System.out.println("validEmailId-"+validemailid);
		while(validemailid) {
			System.out.println("inside valid emailid");
			Username= Username+"09";
			createAccountPage.clearDetails();
			createAccountPage.fillSignupDetails( FirstName,  LastName,  Username,  Passwd,  ConfirmPasswd);
			createAccountPage.clickNext();
		}
		
		
		
	}


}
