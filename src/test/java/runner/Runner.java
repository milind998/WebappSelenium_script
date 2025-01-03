package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)				
@CucumberOptions(
		monochrome = false,
		dryRun = false,
		publish = true,
		features={"src/test/resources/com/features/1loginPage.feature",
				"src/test/resources/com/features/4usersPage.feature",
				"src/test/resources/com/features/3reportsPage.feature"},
		glue={"stepDefinition"},
		plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}


		)
public class Runner {
	//plugin = "html:target/cucumber"
	//"src/test/resources/com/features/2influencerPage.feature"
	//,"src/test/resources/com/features/3reportsPage.feature"
	//src/test/resources/com/features/4usersPage.feature
	//plugin= {"pretty","html:target/cucumber-html-report", "json:target/cucumber-json-report.json"}
}