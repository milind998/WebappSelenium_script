package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)				
@CucumberOptions(
		monochrome = false,
		dryRun = false,
		features={"src/test/resources/com/features/1homePage.feature",
				"src/test/resources/com/features/2settings.feature"},
		glue={"stepDefination"},
		//plugin = "html:target/cucumber"
		plugin= {"pretty","html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		 )
public class Runner {
	

}
