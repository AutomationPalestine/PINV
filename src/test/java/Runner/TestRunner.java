package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions( 
		features="src/test/resources/Features"
		,glue= {"StepDefination"}
		,monochrome=true
		,dryRun=false	
// 		,tags=  " @TC_09_01_AddUserScenario"
		,plugin = {"pretty", "html:target/cucumber-html-report",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

		)

public class TestRunner {

}
