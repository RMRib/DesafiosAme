package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", tags = "@login", 
glue = "classpath:steps", monochrome = true, dryRun = false)
public class LoginRunner {

}
