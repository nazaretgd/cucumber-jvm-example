package com.github.ehdez73.cucumberjvmexample;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue= {"com.github.ehdez73.cucumberjvmexample.stepdefs"},
        features= "src/test/resources/features",
        plugin = {"pretty"})
public class RunCukesTest {
}
