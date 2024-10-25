package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import pageObjects.flightbookingpage;
import utils.TestContextSetup;

public class flightbookingstepdefinition {

	
TestContextSetup testcontextsetup;
	
	public flightbookingstepdefinition(TestContextSetup testcontextsetup) {
		
		this.testcontextsetup=testcontextsetup;
	}
	
	@Given("I redirect to the flight booking page from the homepage")
	public void i_redirect_to_the_flight_booking_page_from_the_homepage() throws IOException {

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
		
          flightbookingpage fb = new flightbookingpage(testcontextsetup.driver);
          fb.flightbooking();
          
		
		
	}

	@Given("I select the departure city and arriving city")
	public void i_select_the_departure_city_and_arriving_city() throws InterruptedException {
		 flightbookingpage fb = new flightbookingpage(testcontextsetup.driver);
		 Thread.sleep(5000);
		  fb.departurecity();
		  fb.departurecityname();
		  fb.arrivingcityname();
	}
	
}
