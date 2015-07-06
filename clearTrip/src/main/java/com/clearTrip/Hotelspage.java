package com.clearTrip;
import org.openqa.selenium.By;



public class Hotelspage  extends AbstractMain{
	 public void hotelPage(){
		 driver.findElement(By.linkText("Hotels")).click();
	 }
 
	 public void whereTextBox(){
		 driver.findElement(By.xpath("//input[@id='Tags']")).sendKeys("New Delhi");
		 driver.findElement(By.linkText("New Delhi Delhi, India")).click();
		 
		 
	 }
	public void check_In()
	{
		driver.findElement(By.xpath("//input[@id='CheckInDate']")).sendKeys("Wed, 8 Jul, 2015");
		
	}
	public void check_out(){
		driver.findElement(By.xpath("//input[@id='CheckOutDate']")).sendKeys("Wed, 15 Jul, 2015");
		
	}
	public void clickOnSearchHotels(){
		driver.findElement(By.xpath("//input[@id='SearchHotelsButton']")).click();
	}
	public void hotels()
	{
		whereTextBox();
		check_In();
		check_out();
		
	}
}
