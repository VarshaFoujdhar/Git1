package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features="src/test/java/featureFiles",
			
	        tags="@regression3",
			glue= {"StepDefinition"},
			dryRun=false,
			monochrome=true,
			plugin= {"pretty","html:target/HtmlReport/index.html",
	           "json:target/Cucumberreport/cucumber.json",
	         //before you execute always do maven clean
	        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
	}
)


public class TestRunner 
{

}
