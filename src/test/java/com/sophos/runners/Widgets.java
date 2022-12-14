package com.sophos.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com/sophos/stepdefinitions",
        features = "src/test/resources/com.sophos/features/widgets.feature",
        tags = "@Punto2",
        snippets = CucumberOptions.SnippetType.CAMELCASE

)

public class Widgets {
}
