package org.tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//New Change
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/cucumber",
                 glue = "src/test/java/org.tests/CatTest.java")

public class RunCucumberTest {

}
