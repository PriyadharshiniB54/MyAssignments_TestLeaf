package runner;

import base.ProjectSpecificMethodSalesForce;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src/test/java/feature/SalesForceEditAccount.feature", glue = "stepDefinition", publish = true, monochrome = true)

public class SalesforceAccountEditRunner extends ProjectSpecificMethodSalesForce {

}
