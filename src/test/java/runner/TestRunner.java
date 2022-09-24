package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
			features = "./Features", 
			//tags = {"@001, @002, @003"},
			tags = {"@test"},
			glue={"stepdef"}, 
			monochrome=true, 
			plugin = { "pretty", "html:target/Cucumber-html-report", "usage:target/cucumber-usage.json", "junit:target/" + "Testing.xml" }
		)
public class TestRunner {
	
}
