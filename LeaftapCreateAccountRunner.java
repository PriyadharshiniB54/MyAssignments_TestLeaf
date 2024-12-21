package runner;

import base.ProjectSpecificMethodLeaftapApp;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/java/feature/LeaftapCreateAccount.feature",
	    glue = {"stepDefinition", "hooks"},
	    publish = true,
	    monochrome = true
	)
	public class LeaftapCreateAccountRunner extends ProjectSpecificMethodLeaftapApp {
	}