package co.com.konex.cetificacion.login.backoffice.util;

import co.com.konex.cetificacion.login.backoffice.models.gestionarcomercializador.TblCrearComerci;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class MetodosFuncionalesGestionComercializador extends PageObject {

    private TblCrearComerci tblCrearComerci;

    public void ClickJs(String jsPath) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript(jsPath + ".click()");
    }

    public static Target EMPRESA(String empresa) {
        String datoEmpresa = "//span[contains(text(),'";
        String dato2Empresa = "')]";
        String datoFinalEmpresa = datoEmpresa + empresa + dato2Empresa;
        return Target.the("empresa").located(By.xpath(datoFinalEmpresa));
    }

    public static Target PAIS(String pais) {
        String datoPais = "//span[contains(text(),'";
        String dato2Pais = "')]";
        String datoFinalPais = datoPais + pais + dato2Pais;
        return Target.the("pais").located(By.xpath(datoFinalPais));
    }

    public static Target DEPARTAMENTO(String departamento) {
        String datoDepartamento = "//span[contains(text(),'";
        String dato2Departamento = "')]";
        String datoFinalDepartamento = datoDepartamento + departamento + dato2Departamento;
        return Target.the("departamento").located(By.xpath(datoFinalDepartamento));
    }

    public static Target CIUDAD(String ciudad) {
        String datoCiudad = "//span[contains(text(),'";
        String dato2Ciudad = "')]";
        String datoFinalCiudad = datoCiudad + ciudad + dato2Ciudad;
        return Target.the("ciudad").located(By.xpath(datoFinalCiudad));
    }
}
