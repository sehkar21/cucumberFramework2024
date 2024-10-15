package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.LandingPage;
import utils.TestContextSetup;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LandingPageStepDefinition {

	
	TestContextSetup testcontextsetup;
	
	public LandingPageStepDefinition(TestContextSetup testcontextsetup) {
		
		this.testcontextsetup=testcontextsetup;
	}
	
	@Given("user is on Greencart Landing page")
	public void user_is_on_greencart_landing_page() throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\global.properties");
		Properties prop =new Properties();
		prop.load(fis);
		
		String url = prop.getProperty("QaURL");
	    
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
		System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"CucumberAutomation\\Driver\\chromedriver.exe");
		testcontextsetup.driver = new ChromeDriver();
		testcontextsetup.driver.get(url);	
		testcontextsetup.driver.manage().window().maximize();
		}
		if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
		System.setProperty("WebDriver.gecko.driver",System.getProperty("user.dir")+"CucumberAutomation\\Driver\\geckodriver.exe");
		testcontextsetup.driver = new FirefoxDriver();
		testcontextsetup.driver.get(url);	
		testcontextsetup.driver.manage().window().maximize();
		} 
	}

	@When("user serached with shortname {string} and extracted actual name of product")
	public void user_serached_with_shortname_and_extracted_actual_name_of_product(String Shortname) {
	   
		LandingPage landingpage = new LandingPage(testcontextsetup.driver);
		landingpage.serachitem(Shortname);
		
		//testcontextsetup.driver.findElement(Search).sendKeys(Shortname);
		testcontextsetup.productname = landingpage.getproductName().split("-")[0].trim();
		System.out.println(testcontextsetup.productname + " is extarcted from Homepage");
		
	}
 
	
	
	
	
}
