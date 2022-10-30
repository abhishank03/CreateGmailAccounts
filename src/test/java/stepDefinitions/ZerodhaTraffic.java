package stepDefinitions;

import org.openqa.selenium.JavascriptExecutor;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ZerodhaTraffic {


	
	@When("I navigate to {string}")
	public void i_navigate_to(String bloggingLink) {
		
		System.out.println("bloggingLink: "+bloggingLink);
	  
		//driver.get(bloggingLink);
		GmailAccountCreation.driver.get(bloggingLink);
		System.out.println(GmailAccountCreation.driver.getTitle());
		
		
	}
	
	
	@When("I spend {string} on this blog")
	public void i_spend_on_this_blog(String amountTime) throws InterruptedException {
		
	//	int time = Integer.parseInt(amountTime);
	   
		Thread.sleep(3000);
		// Down casting driver to JavascriptExecutor
				JavascriptExecutor js = (JavascriptExecutor) GmailAccountCreation.driver;
				
				// It returns height of view part. You can say it as page height. When you click on page down key
				// Page scroll by one page. 
				long pageHeight= (long)js.executeScript("return window.innerHeight");
				System.out.println("Page height: "+pageHeight);
				
				// It is how much you can scroll. It is height if you scroll, you will reach to bottom of page.
				long scrollableHeight= (long)js.executeScript("return document.body.scrollHeight");
				System.out.println("Total scrollable height: "+scrollableHeight);
				
				// Finding number of pages. Adding 1 extra to consider decimal part.
				int numberOfPages=(int) (scrollableHeight/pageHeight)+1;
				
				System.out.println("Total pages: "+numberOfPages);
				

				// Now scrolling page by page
				for(int i=0;i<numberOfPages;i++)
				{
					js.executeScript("window.scrollBy(0,"+pageHeight+")");
					Thread.sleep(20000);
				}

		
	}

	
	@Then("I quit")
	public void i_quit() {
		
		GmailAccountCreation.driver.quit();
	    
	}
	
	
}
