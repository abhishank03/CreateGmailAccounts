package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.ProtonSignupPage;

public class ProtonEmailCreation {
	
	WebDriver driver;
	ProtonSignupPage protonSignup;
	
	
	@Given("I am navigating to proton signup url")
	public void i_am_navigating_to_proton_signup_url() {
		
		driver = GmailAccountCreation.driver;
		
		driver.get("https://account.proton.me/signup?plan=free&billing=12&minimumCycle=12&currency=EUR&language=en");
		driver.manage().window().maximize();
	  
	}

	@Given("I provide mandatory fields like {string},{string},{string}")
	public void i_provide_mandatory_fields_like(String username, String password, String repeatpassword) {
		
		
		protonSignup =  new ProtonSignupPage(driver);
		
		try {
			Thread.sleep(4000);
			protonSignup.provideMandatoryFields(username, password, repeatpassword);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 
	}

	@Then("I click on create account")
	public void i_click_on_create_account() {

	}


}
