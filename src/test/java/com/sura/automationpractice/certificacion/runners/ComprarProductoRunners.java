package com.sura.automationpractice.certificacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = "com.sura.automationpractice.certificacion.stepdefinitions",
                 features = "src/test/resources/features/comprar_producto.feature",
                 snippets = SnippetType.CAMELCASE
)
public class ComprarProductoRunners {
}
