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
	
	
	public void fillSignupDetails(String FirstName ,String LastName, String Username,String Passwd, String ConfirmPasswd ) throws InterruptedException {
		
		text_FirstName.sendKeys(FirstName);
		Thread.sleep(3000);
		text_LastName.sendKeys(LastName);
		Thread.sleep(3000);
		text_Username.sendKeys(Username);
		System.out.println(Username);
		Thread.sleep(3000);
		text_Passwd.sendKeys(Passwd);
		Thread.sleep(300);
		text_ConfirmPasswd.sendKeys(ConfirmPasswd);
		Thread.sleep(3000);
		
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
	
	public void clearDetails() throws InterruptedException {
		text_FirstName.clear();
		Thread.sleep(3000);
		text_LastName.clear();
		Thread.sleep(3000);
		text_Username.clear();
		Thread.sleep(3000);
		text_Passwd.clear();
		Thread.sleep(3000);
		text_ConfirmPasswd.clear();
	}

}
