package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		glue = "stepsDefinitions",
		tags = "@VerificaDoacao",
		plugin = {
				"pretty",
		"html:target/cucumber-reports",
		"junit:target/cucumber-reports/cucumber.xml",
		"json:target/cucumber-reports/cucumber.json"
		}
		,
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		strict = true,
		dryRun = false
		)
public class RunnerCucumber {

}
