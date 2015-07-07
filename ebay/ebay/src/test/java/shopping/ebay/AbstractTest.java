package shopping.ebay;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;

public class AbstractTest {
	AbstractMain main = new AbstractMain();

	@Before

	public void start() throws IOException {
		main.openBrowser();
	}

	//@After
	//public void tearDown() {
	//	main.closeBrowser();
	//}

}
