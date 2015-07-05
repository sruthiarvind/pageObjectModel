package com.clearTrip;

import java.io.IOException;

import org.junit.Before;

public class AbstractTest {
	AbstractMain main = new AbstractMain();

	@Before
	public void setUp() throws IOException {
		main.openBrowser();
	}

	// @After
	public void tearDown() {
		main.closeBrowser();
	}
}
