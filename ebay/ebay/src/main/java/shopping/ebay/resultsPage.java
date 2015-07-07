package shopping.ebay;


import org.openqa.selenium.By;

public class resultsPage extends AbstractMain { 

	public void clickOnItemLink() throws InterruptedException
	{
		//Thread.sleep(5000l);
		driver.findElement(By.xpath("//li[@id='item19fe7a17aa']/div/div/a/img")).click();
		//Thread.sleep(5000l);
		
	}
	
	
}
