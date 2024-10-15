package TestRunner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:\\Users\\sehka\\eclipse-workspace\\2024-03\\CucumberAutomation\\src\\test\\java\\features\\searchproduct.feature", // Path to the feature files
    glue = "stepDefinitions", // Package containing step definitions
    		// plugin = {"pretty", "html:target/cucumber-reports.html"}, // Generates HTML reports
    		   // monochrome = false,
    		   dryRun=false// Output is readable
   
)


public class JunitTestRunner {

}
