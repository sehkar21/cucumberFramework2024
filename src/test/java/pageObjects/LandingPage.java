package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

	public WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By Search = By.xpath("//input[@type='search']");
	By productname = By.xpath("//h4[normalize-space()='Tomato - 1 Kg']");
	
	
	public void serachitem(String name)
	{
		driver.findElement(Search).sendKeys(name);
	}
	
	public String getproductName() {
		
		return driver.findElement(productname).getText();
	}
	
}
