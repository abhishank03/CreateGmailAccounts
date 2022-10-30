package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SearchGoogle;

public class ZerodhaTraffic_Search {

	
	SearchGoogle searchgoogle;
	WebDriver driver;
	
	
	@When("I navigate to google search engine")
	public void i_navigate_to_google_search_engine() {
		
		driver = GmailAccountCreation.driver;
	    
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
	}
	
	
	
	@Given("I search given text {string}")
	public void i_search_given_text(String text) throws InterruptedException {
		
		searchgoogle =  new SearchGoogle(driver);
		
		Thread.sleep(4000);
		try {
			searchgoogle.textInSearchBox(text);
		}
		
	  catch (Exception e) {
		  System.out.println("exception: "+e);
	  }
		
		
		
		Thread.sleep(3000);
		searchgoogle.clickSearchButton();
	
		
		
		
		
	}
	
	
	@Then("I select netizensays")
	public void i_select_netizensays() throws InterruptedException {
	    
		Thread.sleep(3000);
		System.out.println("inside select netizens");
		searchgoogle.searchDesiredResult();
		
	}
	
	
}
