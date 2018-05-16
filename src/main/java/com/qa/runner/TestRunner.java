package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/sonalikarde/eclipse-workspace/RS_Automation/src/main/java/pom/qa/features/RS.feature", glue = {
		"com/qa/stepDefinitions" },
		format = { "pretty", "html:test-output", "json:json-output/cucumber.json" },
		strict = true, monochrome = true, dryRun = false)

public class TestRunner {

}
