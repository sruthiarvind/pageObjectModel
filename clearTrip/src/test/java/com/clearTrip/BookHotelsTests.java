package com.clearTrip;

import org.junit.Test;

public class BookHotelsTests extends AbstractTest {
	Hotelspage hp=new Hotelspage();
	ResultsPage results=new ResultsPage();
	
	@Test
	public void bookingHotels()
	{
		hp.hotelPage();
		hp.hotels();
		hp.clickOnSearchHotels();
		results.selectRoom();
	}

}
