package in.amazon.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = "src\\test\\resources\\features\\",
		glue = "in\\amazon\\stepDefinition",
		monochrome = true
		
		)

public class TestRunner {

}
