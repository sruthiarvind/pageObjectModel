package com.clearTrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbstractMain {
	WebDriver driver ;
	
	public void openBrowser(){
		 driver =new FirefoxDriver();
		
	}
	public void closeBrowser(){
		driver.close();
		driver.quit();
	}
}
