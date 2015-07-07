package shopping.ebay;

import org.junit.Assert;
import org.openqa.selenium.By;


public class assertions extends AbstractMain{

	public void checking(){
		String expected_val = "Sign in to your account";
		String actual_val = driver.findElement(By.xpath("//div[@id='mainCnt']/div/div/h2")).getAttribute("value");
      try{
    	  
		Assert.assertEquals(expected_val, actual_val);
      }catch(Throwable t)
      {
    	  System.out.println("error");
      }
}
}
