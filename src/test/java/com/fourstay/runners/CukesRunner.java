package com.fourstay.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "html:target/cucumber-reports", features = "src/test/resources/features", glue = "com/fourstay/step_definitions", tags = "@Staytest_125", dryRun = true

// please dont ruine this!

)
public class CukesRunner {

}
