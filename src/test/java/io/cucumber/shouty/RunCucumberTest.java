package io.cucumber.shouty;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:io/cucumber/shouty/hear_shouty.feature"})
public class RunCucumberTest {
}
