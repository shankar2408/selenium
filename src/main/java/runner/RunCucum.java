package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/features/Login.feature", glue="steps", monochrome=true, tags="@smoke" )
public class RunCucum {
	

}