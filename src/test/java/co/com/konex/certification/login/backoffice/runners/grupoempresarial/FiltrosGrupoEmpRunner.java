package co.com.konex.certification.login.backoffice.runners.grupoempresarial;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/grupoempresarial/filtros_grupo_empresarial.feature",
        tags = "",
        glue = "co.com.konex.certification.login.backoffice.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class FiltrosGrupoEmpRunner {
}
