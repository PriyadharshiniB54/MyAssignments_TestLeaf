package runner;

import base.ProjectSpecificMethodSalesForce;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src/test/java/feature/SalesforceAccountCreation.feature", glue = "stepDefinition", publish = true, monochrome = true)

public class SalesforceAccountCreateMultipleDataRunner extends ProjectSpecificMethodSalesForce {

}
