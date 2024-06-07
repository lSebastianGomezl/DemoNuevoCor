package co.com.konex.certification.login.backoffice.runners.gestionarcomercializador;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/gestionarcomercializador/acciones_f2.feature",
        tags = "",
        glue = "co.com.konex.certification.login.backoffice.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class AccionesRunnerGestionComF2 {
}
