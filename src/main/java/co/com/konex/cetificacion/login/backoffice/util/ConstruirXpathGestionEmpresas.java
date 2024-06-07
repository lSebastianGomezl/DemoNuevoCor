package co.com.konex.cetificacion.login.backoffice.util;

import co.com.konex.cetificacion.login.backoffice.models.gestionempresa.TablaDeDatosCrearEmpresa;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class ConstruirXpathGestionEmpresas extends PageObject {

    private TablaDeDatosCrearEmpresa tablaDeDatosCrearEmpresa;

    public void ClickJs(String jsPath) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript(jsPath + ".click()");
    }
    public static Target GRUPO_EMPRESARIAL(String valor) {
        String dato = "//li[@aria-label='";
        String dato2 = "']";
        String datoFinal = dato + valor + dato2;
        return Target.the("Nombre de grupo empresarial").located(By.xpath(datoFinal));
    }

    public static Target PAIS(String valor) {
        String dato = "//li[@aria-label='";
        String dato2 = "']";
        String datoFinal = dato + valor + dato2;
        return Target.the("Nombre de país").located(By.xpath(datoFinal));
    }

    public static Target DEPARTAMENTO(String valor) {
        String dato = "//li[@aria-label='";
        String dato2 = "']";
        String datoFinal = dato + valor + dato2;
        return Target.the("Nombre de departamento").located(By.xpath(datoFinal));
    }
    public static Target CIUDAD(String valor) {
        String dato = "//li[@aria-label='";
        String dato2 = "']";
        String datoFinal = dato + valor + dato2;
        return Target.the("Nombre de ciudad").located(By.xpath(datoFinal));
    }
    public static Target TIPO_DE_PAGO(String valor) {
        String dato = "//li[@aria-label='";
        String dato2 = "']";
        String datoFinal = dato + valor + dato2;
        return Target.the("Tipo de pago").located(By.xpath(datoFinal));
    }

    public static Target USUARIO(String valor) {
        String dato = "//li[@aria-label='";
        String dato2 = "']";
        String datoFinal = dato + valor + dato2;
        return Target.the("Nombre de Usuario").located(By.xpath(datoFinal));
    }
    public static Target ROL(String valor) {
        String dato = "//li[@aria-label='";
        String dato2 = "']";
        String datoFinal = dato + valor + dato2;
        return Target.the("Rol").located(By.xpath(datoFinal));
    }
    public static Target COMERCIALIZADOR(String valor) {
        String dato = "//li[@aria-label='";
        String dato2 = "']";
        String datoFinal = dato + valor + dato2;
        return Target.the("Comercializador").located(By.xpath(datoFinal));
    }
    public static Target DISTRIBUIDOR(String valor) {
        String dato = "//li[@aria-label='";
        String dato2 = "']";
        String datoFinal = dato + valor + dato2;
        return Target.the("Distribuidor").located(By.xpath(datoFinal));
    }
    public static Target TIPODOCUMENTO(String valor) {
        String dato = "//li[@aria-label='";
        String dato2 = "']";
        String datoFinal = dato + valor + dato2;
        return Target.the("Tipo Documento").located(By.xpath(datoFinal));
    }
}
