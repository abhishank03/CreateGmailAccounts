package base;


import java.io.FileInputStream;
import java.util.Properties;

import org.apache.logging.log4j.core.config.Property;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInitilize {
	
	WebDriver driver;
	String frameworkPath = System.getProperty("user.dir");
	String propertyFilePath = frameworkPath + "\\config.properties";
	String chromeDriverPath = frameworkPath + "\\src\\main\\java\\drivers\\chromedriver.exe";
	
	
	public WebDriver initiateDriver() {
		
		
		try {
			FileInputStream fis = new FileInputStream(propertyFilePath);
			
			Properties prop = new Properties(); 
			prop.load(fis);
			
			String browser = prop.getProperty("browser");
			
			
			try {
				
				if(browser.equalsIgnoreCase("chrome")) {
					
					System.setProperty("webdriver.chrome.driver", chromeDriverPath);
					driver = new ChromeDriver();
					
				}
				
			}
			catch (Exception e) {
				
			}
			
			
		}
		catch (Exception e) {
			System.out.println("File"+ "propertyFilePath "+  "Not found Exception: "+e);
		}
		
		return driver;
		
	}

	
	

}

