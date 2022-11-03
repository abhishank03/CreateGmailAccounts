package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.CustomPrinter;

public class ProtonSignupPage {
	
	
	WebDriverWait wait;
	//WebDriver driver;
	public ProtonSignupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		 wait = new WebDriverWait(driver, 30);
		// driver = tempdriver;
	}
	
	
	

		
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[1]/input") 
	private WebElement text_email;
	
	@FindBy(how = How.ID, using = "password") 
	private WebElement text_pswrd;
	
	@FindBy(how = How.ID, using = "repeat-password") 
	private WebElement text_repswrd;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div[1]/div/main/div[2]/form/button") 
	private WebElement text_createButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id='checkbox']")
	private WebElement tick_checkbox;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id='displayName']")
	private WebElement text_displayName;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/main/div[2]/form/button")
	private WebElement button_displayNext;
	
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/main/div[2]/form/button[2]")
	private WebElement MaybeLater;
	
	
	@FindBy(how = How.ID, using = "save-email")
	private WebElement tick_RecoveryEmail;
	
	@FindBy(how = How.ID, using = "recovery-email")
	private WebElement text_RecoveryEmail;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div[1]/div/main/div[2]/form/iframe")
	private WebElement frame;
	
	
	
	
	
	
	
	public void provideUsername(String email ) throws InterruptedException {
		
		
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
		
		text_email.click();
		text_email.sendKeys(email);
		CustomPrinter.printValues(email);
	}
	
	public void providePassword(String password) {
		//driver.switchTo().defaultContent();
		
		text_pswrd.sendKeys(password);
		CustomPrinter.printValues(password);
		
	}
		
	
	public void provideRePassword(String repassword) throws InterruptedException {
		text_repswrd.sendKeys(repassword);
		CustomPrinter.printValues(repassword);
		
		
		Thread.sleep(1000);
		
		text_createButton.click();
		Thread.sleep(4000);
	}
		
	
	
	

}
