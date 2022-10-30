package pageObjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchGoogle {
	
	
	
	public SearchGoogle(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(how = How.XPATH, using ="//*[@name='q']")
	private WebElement searchBox;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]") 
	private WebElement searchButton;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'iUh30 ')][contains(@class, 'qLRx3b ')]") 
	private List<WebElement> searchResults;
	
	
	
	public void textInSearchBox(String text) {
		
		searchBox.sendKeys(text);
		searchBox.sendKeys(Keys.TAB);
		
	}
	
	public void clickSearchButton() {
		
		searchButton.click();
		
	}
	
	public void searchDesiredResult() {
		
		
		for (int i =0; i<searchResults.size();i++) {
			
			System.out.println(searchResults.get(i).getText());
			
			if(searchResults.get(i).getText().contains("netizensays")) {
				searchResults.get(i).click();
			}
		}
		
	}

}
