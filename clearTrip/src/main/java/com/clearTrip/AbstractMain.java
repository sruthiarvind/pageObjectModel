package com.clearTrip;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbstractMain {
	static WebDriver driver;

	public void openBrowser() throws IOException {
	
		FileInputStream fs = new FileInputStream("C:/Users/arvindkumar/frameworks/clearTrip/src/test/resouces/config.properties");
		Properties prop = new Properties();
		prop.load(fs);
		if(prop.get("Browser").equals("firefox")){
			driver = new FirefoxDriver();
		}
		if(prop.get("Browser").equals("chrome")){
			driver = new ChromeDriver();
		}
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
}
