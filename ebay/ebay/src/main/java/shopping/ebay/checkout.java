package shopping.ebay;

import org.openqa.selenium.By;

public class checkout extends AbstractMain {
	public void clickOnCheckOut()
   {
		driver.findElement(By.id("ptcBtnRight")).click();
	
	}
	

}
