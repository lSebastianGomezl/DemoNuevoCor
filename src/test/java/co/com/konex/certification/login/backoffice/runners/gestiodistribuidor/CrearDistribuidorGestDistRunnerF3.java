package co.com.konex.certification.login.backoffice.runners.gestiodistribuidor;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/gestiondistribuidor/crear_distribuidor_f3.feature",
        tags = "",
        glue = "co.com.konex.certification.login.backoffice.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class CrearDistribuidorGestDistRunnerF3 {
}
