package com.serenity.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@enter",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "com.serenity.stepDefinitions"
)
public class LoginRunner {
}
