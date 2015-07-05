package com.clearTrip;

import org.openqa.selenium.By;

public class ItineraryPage extends AbstractMain {

	public void selectMeal(){
		driver.findElement(By.id("beforeMeals")).click();
	}
}
