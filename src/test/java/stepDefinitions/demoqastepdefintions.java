package stepDefinitions;

import utils.TestContextSetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demoqastepdefintions {

TestContextSetup testcontextsetup;
	
	public demoqastepdefintions(TestContextSetup testcontextsetup) {
		
		this.testcontextsetup=testcontextsetup;
	}
	
	
	@SuppressWarnings("deprecation")
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		testcontextsetup.driver = new FirefoxDriver();
		testcontextsetup.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		testcontextsetup.driver.get("https://www.google.com/search?q=facebook&rlz=1C1RXQR_enIN1114IN1114&oq=face&gs_lcrp=EgZjaHJvbWUqDAgAECMYJxiABBiKBTIMCAAQIxgnGIAEGIoFMhsIARAuGEMYgwEYxwEYsQMYyQMY0QMYgAQYigUyCQgCEEUYORiABDINCAMQABiDARixAxiABDIQCAQQABiDARixAxiABBiKBTINCAUQABiSAxiABBiKBTINCAYQABiSAxiABBiKBTIGCAcQRRg80gEHNzY4ajBqNKgCALACAA&sourceid=chrome&ie=UTF-8");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		testcontextsetup.driver.findElement(By.xpath("//h3[normalize-space()='Facebook - log in or sign up']")).click();
	}

	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_UserName_and_Password(String username, String password) throws Throwable {
		testcontextsetup.driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username); 	 
		testcontextsetup.driver.findElement(By.xpath("//div[@id='passContainer']")).sendKeys(password);
		testcontextsetup.driver.findElement(By.xpath("//button[@id='u_0_5_4u']")).click();
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login UnSuccess");
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		testcontextsetup.driver.findElement (By.xpath("//a[normalize-space()='Forgotten password?']")).click();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
		System.out.println("LogOut Successfully");
	}

}
