package com.clearTrip;

import org.openqa.selenium.By;

public class ResultsPage extends AbstractMain {

	public void bookFlight() {
		driver.findElement(
				By.xpath(".//*[@id='flightForm']/section[2]/div[4]/div/nav/ul/li[1]/table/tbody[2]/tr[2]/td[3]/button"))
				.click();
	}
}
