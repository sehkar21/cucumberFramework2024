package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class flightbookingpage {

public WebDriver driver;
	
	public flightbookingpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By flightbooking = By.xpath("//a[normalize-space()='Flight Booking']");
	By departurecity = By.id("/html[1]/body[1]/form[1]/div[4]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[3]/div[1]/div[3]/div[1]/div[1]/span[1]");
	By departurecityname = By.xpath("//a[normalize-space()='Chennai (MAA)']");
	By arrivingcityname = By.xpath("//body[1]/form[1]/div[4]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[3]/div[1]/div[1]/ul[4]/li[12]/a[1]");
	
	public void flightbooking()
	{
		driver.findElement(flightbooking).click();
	}
	
	public void departurecity() {
		
		 driver.findElement(departurecity).click();
	}
	
	public void departurecityname()
	{
		driver.findElement(departurecityname).click();
	}
	
	public void arrivingcityname() {
		
		 driver.findElement(arrivingcityname).click();
	}
	
	
	
}
