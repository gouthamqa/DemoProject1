package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //path of feature file
        features = "src/test/java/Features/login.feature",
        //path of step definition file
        glue = "stepDefinations"
)
public class LoginRunner {
}
