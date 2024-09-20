package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)				
@CucumberOptions(
		monochrome = false,
		dryRun = false,
		features={"src/test/resources/com/features/01homePage.feature",
				//"src/test/resources/com/features/02mainsettings.feature", 
				//"src/test/resources/com/features/03promoCode.feature",
				//"src/test/resources/com/features/04transactions.feature",
				//"src/test/resources/com/features/05SuperAdmin.feature",
				"src/test/resources/com/features/06SKU.feature"},
		
		glue={"stepDefination"},
		//plugin = "html:target/cucumber"
		plugin= {"pretty","html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		 )
public class Runner {
	
}
