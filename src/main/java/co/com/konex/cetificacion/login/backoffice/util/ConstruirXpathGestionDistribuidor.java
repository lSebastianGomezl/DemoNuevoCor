package co.com.konex.cetificacion.login.backoffice.util;

import co.com.konex.cetificacion.login.backoffice.models.gestiondistribuidor.TblGestionDistribuidor;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class ConstruirXpathGestionDistribuidor extends PageObject{
    private TblGestionDistribuidor tblGestionDistribuidor;

    public void ClickJs(String jsPath) {
            JavascriptExecutor js = (JavascriptExecutor) getDriver();
            js.executeScript(jsPath + ".click()");
    }
    //public static Target ASOCIAR_A_EMPRESA(String valor) {
    //        String dato = "//li[@aria-label='";
    //        String dato2 = "']";
    //        String datoFinal = dato + valor + dato2;
    //        return Target.the("Nombre de empresa").located(By.xpath(datoFinal));
    //    JavascriptExecutor js = (JavascriptExecutor) getDriver();
    //    js.executeScript(jsPath + ".click()");
    //}
    public static Target ASOCIAR_A_EMPRESA(String valor) {
        String dato = "//li[@aria-label='";
        String dato2 = "']";
        String datoFinal = dato + valor + dato2;
        return Target.the("Nombre de empresa").located(By.xpath(datoFinal));
    }

    public static Target ASOCIAR_A_COMERCIALIZADOR(String valor) {
        String dato = "//li[@aria-label='";
        String dato2 = "']";
        String datoFinal = dato + valor + dato2;
        return Target.the("Nombre de comercializador").located(By.xpath(datoFinal));
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
        return Target.the("Nombre de Departamento").located(By.xpath(datoFinal));
    }
    public static Target MUNICIPIO(String valor) {
        String dato = "//li[@aria-label='";
        String dato2 = "']";
        String datoFinal = dato + valor + dato2;
        return Target.the("Nombre de municipio").located(By.xpath(datoFinal));
    }


    public static Target CIUDAD(String valor) {
        String dato = "//li[@aria-label='";
        String dato2 = "']";
        String datoFinal = dato + valor + dato2;
        return Target.the("Nombre de ciudad").located(By.xpath(datoFinal));
    }

}

