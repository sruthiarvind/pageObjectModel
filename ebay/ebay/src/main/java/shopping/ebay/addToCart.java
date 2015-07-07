package shopping.ebay;

import org.openqa.selenium.By;

public class addToCart extends AbstractMain {
	public void addToCartButton()
	{
		driver.findElement(By.id("isCartBtn_btn")).click();
	}


}
