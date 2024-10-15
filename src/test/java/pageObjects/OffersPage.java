package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {

public WebDriver driver;
	
	public OffersPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By Search = By.xpath("//input[@id='search-field']");
	By productname = By.cssSelector("tbody tr td:nth-child(1)");
	By Topdeals = By.linkText("Top Deals");
	
	public void serachitem_offerpage(String name)
	{
		driver.findElement(Search).sendKeys(name);
	}
	
	public String getproductName_offerpage() {
		
		return driver.findElement(productname).getText();
	}
	
	public void Topdealspage() 
	{
		driver.findElement(Topdeals).click();
	}
	
	
}
