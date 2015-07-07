package shopping.ebay;

import org.junit.Test;

public class selectionPageTest extends AbstractTest {
 
	relativeCategoryPage rcp=new relativeCategoryPage();
	selectionPage sel=new selectionPage();
	selectingItem item=new selectingItem();
	resultsPage results=new resultsPage();
	addToCart cart=new addToCart();
	checkout co=new checkout();
	assertions a=new assertions();
	
	
	
	@Test
	public void buyingItemTest() throws InterruptedException
	{
		sel.selectCategory();
		sel.clickOnSearch();
		rcp.choose();
		item.scroll_down();
		results.clickOnItemLink();
		cart.addToCartButton();
		co.clickOnCheckOut();
	a.checking();
	}
}
