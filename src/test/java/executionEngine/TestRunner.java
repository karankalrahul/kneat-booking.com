package executionEngine;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber"},
		features = {"src/test/java/features"},
		glue={"steps"},
		monochrome = true
	)

public class TestRunner {


}
