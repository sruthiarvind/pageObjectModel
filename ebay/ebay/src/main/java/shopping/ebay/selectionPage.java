package shopping.ebay;

import org.openqa.selenium.By;

public class selectionPage extends AbstractMain {
	
	public void selectCategory()
	{
		driver.findElement(By.xpath("//select[@id='gh-cat']")).sendKeys("books");
	}
    
	public void clickOnSearch(){
		driver.findElement(By.id("gh-btn")).click();
	}
}
