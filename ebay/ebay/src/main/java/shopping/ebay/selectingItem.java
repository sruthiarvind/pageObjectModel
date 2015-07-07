package shopping.ebay;

import org.openqa.selenium.By;


public class selectingItem extends AbstractMain {
	
	
	public void scroll_down() throws InterruptedException{
	
		while(true){
			
			try{
				
			driver.findElement(By.linkText("See all items in Cookbooks")).click();
			Thread.sleep(5000l);
			
			}catch(Throwable t)
			{
				System.out.println("expanded everything");
				break;
			}
			
		}
	}

}
