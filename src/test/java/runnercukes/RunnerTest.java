package runnercukes;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
//import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
				glue="stepdefinitions",
				dryRun=false,
				monochrome=true,
				snippets=SnippetType.CAMELCASE
				)


public class RunnerTest {

}
