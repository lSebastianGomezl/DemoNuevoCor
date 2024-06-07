package co.com.konex.cetificacion.login.backoffice.util;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class PlandePremios extends PageObject {
    public void ClickJs(String jsPath) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript(jsPath + ".click()");
    }
    public static Target LOTERIA(String valor) {
        String dato = "//span[contains(text(),'";
        String dato2 = "')]";
        String datoFinal = dato + valor + dato2;
        return Target.the("Lotería").located(By.xpath(datoFinal));
    }
}
