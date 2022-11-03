package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.CustomPrinter;
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
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());
		
	}

	@Given("I provide mandatory fields like {string},{string},{string}")
	public void i_provide_mandatory_fields_like(String username, String password, String repeatpassword) {
		
		
		protonSignup =  new ProtonSignupPage(driver);
		
		try {
			CustomPrinter.printValues("I provide Mandatory fields like username, pass, repass");
			Thread.sleep(2000);
			//protonSignup.provideMandatoryFields(username, password, repeatpassword);
			protonSignup.provideUsername(username);
			driver.switchTo().defaultContent();
			protonSignup.providePassword(password);
			protonSignup.provideRePassword(repeatpassword);
			CustomPrinter.printValues("fields provided");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 
	}

	@Then("I click on create account")
	public void i_click_on_create_account() {

	}


}
