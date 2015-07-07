package shopping.ebay;

import org.openqa.selenium.By;

public class relativeCategoryPage extends AbstractMain{
	
	public void choose()
	{
		driver.findElement(By.xpath("//*[@id='headpanel']/div[1]/div[1]/div/ul/li[6]/a")).click();
	}

}
