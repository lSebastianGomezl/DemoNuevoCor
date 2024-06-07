package co.com.konex.cetificacion.login.backoffice.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContenedorDeObjetosAccionesGE {
    public static final Target BTN_VER_DETALLES = Target.the("Boton para ver detalles").located(By.id("btnDetalle1"));
    public static final Target INPUT_NIT = Target.the("Caja de texto para Nit").located(By.id("filtroNitGrupoEmpresarial"));
    public static final Target BTN_LIMPIAR_MODAL = Target.the("Caja de texto para Nit").located(By.xpath("(//*[contains(text(),'Limpiar')])[2]"));
    public static final Target TD_NIT_BUSCADO = Target.the("Resultado de la busqueda por nit").locatedBy("//td[contains(text(),'{0}')]");
}
