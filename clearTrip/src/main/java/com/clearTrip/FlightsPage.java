package com.clearTrip;

import org.openqa.selenium.By;

public class FlightsPage extends AbstractMain {

	public void departingFrom() {
		driver.findElement(By.id("FromTag")).sendKeys("Delhi");
	}

	public void arrivingTo() {
		driver.findElement(By.id("ToTag")).sendKeys("Mumbai");

	}

	public void departureDate() {
		driver.findElement(By.id("DepartDate")).sendKeys("Sat, 18 Jul, 2015");
	}

	public void clickOnSreachBtn() {
		driver.findElement(By.id("SearchBtn")).click();
	}

	public void oneWayTrip() {
		departingFrom();
		arrivingTo();
		departureDate();
	}

}
