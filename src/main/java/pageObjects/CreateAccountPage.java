package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
	
	
	public CreateAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
		
	@FindBy(how = How.NAME, using = "firstName") 
	private WebElement text_FirstName;
	
	
	
	@FindBy(how = How.NAME, using = "lastName") 
	private WebElement text_LastName;
	
	
	@FindBy(how = How.NAME, using = "Username") 
	private WebElement text_Username;
	
	
	@FindBy(how = How.NAME, using = "Passwd") 
	private WebElement text_Passwd;
	
	
	@FindBy(how = How.NAME, using = "ConfirmPasswd") 
	private WebElement text_ConfirmPasswd;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"accountDetailsNext\"]/div/button") 
	private WebElement button_Next;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[2]/div[1]/div/div[2]/div[2]/div") 
	private WebElement validUsername;
	
	
	public void fillSignupDetails(String FirstName ,String LastName, String Username,String Passwd, String ConfirmPasswd ) {
		
		text_FirstName.sendKeys(FirstName);
		text_LastName.sendKeys(LastName);
		text_Username.sendKeys(Username);
		text_Passwd.sendKeys(Passwd);
		text_ConfirmPasswd.sendKeys(ConfirmPasswd);
		
	}
	
	public void clickNext() {
		
		button_Next.click();
		
	}
	
	public boolean validateUsername() throws InterruptedException {
		
		boolean isValid = false;
		Thread.sleep(3000);
		if(validUsername.isDisplayed()) {
			isValid = true;
		}
		
		return isValid;
	}
	
	public void clearDetails() {
		text_FirstName.clear();
		text_LastName.clear();
		text_Username.clear();
		text_Passwd.clear();
		text_ConfirmPasswd.clear();
	}

}
