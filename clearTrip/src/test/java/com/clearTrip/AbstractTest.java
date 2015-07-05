package com.clearTrip;

import org.junit.After;
import org.junit.Before;

public class AbstractTest {
	AbstractMain main=new AbstractMain();

	@Before
	public void setUp(){
		main.openBrowser();
	}
	@After 
	public void tearDown(){
		main.closeBrowser();
	}
}
