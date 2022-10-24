package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/main/div[1]/div/div/div/div/div[1]/div[3]/div[1]/a/span[2]") 
	private WebElement button_CreateAccount;
	
	
	
	
	
	public void clickOnCreateAccount() {
		button_CreateAccount.click();
	}
	
	
	

}
