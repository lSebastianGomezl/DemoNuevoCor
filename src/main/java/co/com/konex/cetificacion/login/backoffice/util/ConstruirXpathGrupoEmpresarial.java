package co.com.konex.cetificacion.login.backoffice.util;

import co.com.konex.cetificacion.login.backoffice.models.grupoempresarial.TablaGrupoEmpresarial;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class ConstruirXpathGrupoEmpresarial extends PageObject {

    private TablaGrupoEmpresarial tablaGrupoEmpresarial;

    public void ClickJs(String jsPath) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript(jsPath + ".click()");
    }

    public static Target PAIS(String valor) {
        String dato = "//li[@aria-label='";
        String dato2 = "']";
        String datoFinal = dato + valor + dato2;
        return Target.the("Nombre de País").located(By.xpath(datoFinal));
    }

    public static Target DEPARTAMENTO(String valor) {
        String dato = "//li[@aria-label='";
        String dato2 = "']";
        String datoFinal = dato + valor + dato2;
        return Target.the("Nombre de Departamento").located(By.xpath(datoFinal));
    }
    public static Target CIUDAD(String valor) {
        String dato = "//li[@aria-label='";
        String dato2 = "']";
        String datoFinal = dato + valor + dato2;
        return Target.the("Nombre de ciudad").located(By.xpath(datoFinal));
    }



}
