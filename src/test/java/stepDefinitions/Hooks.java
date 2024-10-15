package stepDefinitions;



import io.cucumber.java.After;
import utils.TestContextSetup;

public class Hooks {

	TestContextSetup testcontextsetup;
	
	public Hooks(TestContextSetup testcontextsetup) 
	{
		this.testcontextsetup =testcontextsetup;
		
	}
	
	@After
	public void afterscenario() {
		
		testcontextsetup.driver.quit();
	}
	
}
