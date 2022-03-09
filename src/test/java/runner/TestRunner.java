package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import stepDefinitions.StepDefinitions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/features/ValidatingPlace.feature"
		,glue={"stepDefinitions"}, 
		plugin = {"json:target/cucumber.json"}
		
		)






public class TestRunner {
	
	
	          
	

}
