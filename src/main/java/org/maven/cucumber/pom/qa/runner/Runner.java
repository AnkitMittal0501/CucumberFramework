package org.maven.cucumber.pom.qa.runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "C:\\Users\\My Pc\\eclipse-workspace\\org.maven.cucumber.pom\\src\\main\\java\\org\\maven\\cucumber\\pom\\qa\\feature\\login.feature", 
glue = {"org/maven/cucumber/pom/qa/stepdef" },
dryRun=false,
monochrome=true

)
/*@RunWith(Suite.class)
@Suite.SuiteClasses({
	
})*/

public class Runner{

}
