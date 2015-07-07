package shopping.ebay;

import org.junit.Test;

public class selectionPageTest extends AbstractTest {
 
	relativeCategoryPage rcp=new relativeCategoryPage();
	selectionPage sel=new selectionPage();
	
	@Test
	public void buyingItemTest()
	{
		sel.selectCategory();
		sel.clickOnSearch();
		rcp.choose();
	}
}