package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import junit.framework.Assert;
import pageObjects.OffersPage;
import utils.TestContextSetup;

@SuppressWarnings("deprecation")
public class OfferPageStepDefinition {
	
	TestContextSetup testcontextsetup;

	public OfferPageStepDefinition(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup =testcontextsetup;
	}
	
	
	@SuppressWarnings("deprecation")
	@Then("user searched for {string} shortname in offers page to check if product exist with same name")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist(String Shortname) throws InterruptedException {
		         OffersPage offerpage = new OffersPage(testcontextsetup.driver);
		         offerpage.Topdealspage();   // opens a new tab
				
				//switching to new tab
				Set<String> s1 = testcontextsetup.driver.getWindowHandles();
				Iterator<String> i1 = s1.iterator();
				String parentwindow = i1.next();
				String childwindow = i1.next();
				testcontextsetup.driver.switchTo().window(childwindow);
				
				//accessing elements in the new tab
				Thread.sleep(2000);
				offerpage.serachitem_offerpage(Shortname);
				
				Thread.sleep(2000);
				testcontextsetup.OfferspageProductname = offerpage.getproductName_offerpage();
				
				 Assert.assertEquals(testcontextsetup.OfferspageProductname, testcontextsetup.productname);
				 
				
		
	}

	
}
