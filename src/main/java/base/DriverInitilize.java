package base;


import java.io.FileInputStream;
import java.util.Properties;

import org.apache.logging.log4j.core.config.Property;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInitilize {
	
	public WebDriver driver;
	String frameworkPath = System.getProperty("user.dir");
	String propertyFilePath = frameworkPath + "\\config.properties";
	String chromeDriverPath = frameworkPath + "\\src\\main\\java\\drivers\\chromedriver.exe";
	public static String url;
	static int counter;
	
	public WebDriver initiateDriver() {
		
		
		try {
			FileInputStream fis = new FileInputStream(propertyFilePath);
			
			Properties prop = new Properties(); 
			prop.load(fis);
			
			String browser = prop.getProperty("browser");
			System.out.println("browser: "+browser);
			url = prop.getProperty("gURL");
			System.out.println("url: "+url);
			
			
			try {
				
				if(browser.trim().equalsIgnoreCase("chrome")) {
					System.out.println("chromeDriverPath-"+chromeDriverPath);
					System.setProperty("webdriver.chrome.driver", chromeDriverPath);
					if(driver == null && counter == 0) {
						driver = new ChromeDriver();
						counter++;
					}
					
					
				}
				
			}
			catch (Exception e) {
				System.out.println("exception: "+e);
				
			}
			
			
		}
		catch (Exception e) {
			System.out.println("File"+ "propertyFilePath "+  "Not found Exception: "+e);
		}
		
		System.out.println("returning driver");
		return driver;
		
	}

	
	

}

