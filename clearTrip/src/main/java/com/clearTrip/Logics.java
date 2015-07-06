package com.clearTrip;

public class Logics extends AbstractMain {
	String winHandleBefore;

	public void switchToNewWindow() {
		winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public void closeNewWindow() {
		driver.close();
		driver.switchTo().window(winHandleBefore);
	}
}
