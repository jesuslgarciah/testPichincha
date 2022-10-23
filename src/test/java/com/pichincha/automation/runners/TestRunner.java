package com.pichincha.automation.runners;


import com.pichincha.automation.utils.ClassType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/automationPracticeExample.feature",
        glue = "com.pichincha.automation.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class TestRunner {
    public TestRunner(){throw new IllegalStateException(ClassType.RUNNER_CLASS);}
}
