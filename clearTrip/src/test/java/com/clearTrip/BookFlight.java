package com.clearTrip;

import org.junit.Test;

public class BookFlight extends AbstractTest{
	FlightsPage flight=new FlightsPage();
	ResultsPage results=new ResultsPage();
	ItineraryPage itinerary=new ItineraryPage();
	
	@Test 
	public void oneWayBookingTest(){
		flight.oneWayTrip();
		flight.clickOnSreachBtn();
		results.bookFlight();
		itinerary.selectMeal();
	}

}
