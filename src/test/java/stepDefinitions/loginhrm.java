package stepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class loginhrm {

	
TestContextSetup testcontextsetup;
	
	public loginhrm(TestContextSetup testcontextsetup) {
		
		this.testcontextsetup=testcontextsetup;
	}
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() throws IOException, InterruptedException   {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\global.properties");
		Properties prop =new Properties();
		prop.load(fis);
		
		String url = prop.getProperty("hrmurl");
	    
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
		Thread.sleep(10000);		} 

		
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String user, String pwd) throws InterruptedException {

		WebElement username = testcontextsetup.driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys(user);
		
		WebElement password = testcontextsetup.driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys(pwd);
		
		WebElement loginbtn = testcontextsetup.driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		loginbtn.click();
		
		Thread.sleep(5000);
		
		
		
		
	}
	

	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {


		
		
	}

	
	
}
