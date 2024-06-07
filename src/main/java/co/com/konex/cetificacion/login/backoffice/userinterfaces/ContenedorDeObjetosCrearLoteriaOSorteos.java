package co.com.konex.cetificacion.login.backoffice.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContenedorDeObjetosCrearLoteriaOSorteos {
    public static final Target INPUT_CREAR_CODIGO = Target.the("Caja de texto para código").located(By.id("escrutinioLoterias_crearLoteria_inputFormulario_codigoLoteria"));
    public static final Target INPUT_CREAR_NOMBRE_LARGO = Target.the("Caja de texto para nombre largo").located(By.id("escrutinioLoterias_crearLoteria_inputFormulario_nombreLargoLoteria"));
    public static final Target INPUT_CREAR_NOMBRE_CORTO = Target.the("Caja de texto para nombre corto").located(By.id("escrutinioLoterias_crearLoteria_inputFormulario_nombreCortoLoteria"));
    public static final Target INPUT_CREAR_TELEFONO = Target.the("Caja de texto para telefono").located(By.id("escrutinioLoterias_crearLoteria_inputFormulario_telefonoLoteria"));
    public static final Target BTN_EXAMINAR_CARGAR_IMAGEN = Target.the("Botón para cargar imagen").located(By.xpath("//*[text()='Examinar']"));
    public static final Target BTN_GUARDAR_CARGAR_IMAGEN = Target.the("Botón para guardar imagen").located(By.xpath("//*[text()='Guardar']"));
    public static final Target INPUT_CREAR_CARGAR_IMAGEN = Target.the("Input para cargar imagen").located(By.xpath("//*[@type='file']"));
    public static final Target SELECT_IMAGEN = Target.the("Select para cargar imagen").located(By.cssSelector("[optionlabel='imageName']"));
    public static final Target SELECT_IMAGEN_OPCION = Target.the("Select para cargar imagen que desee").locatedBy("(//ul //*[@role='option'])[{0}]");
    public static final Target INPUT_CREAR_URL_CORREO_LOTERIA = Target.the("Caja de texto para URL o correo de la lotería").located(By.id("escrutinioLoterias_crearLoteria_inputFormulario_UrlLoteria"));
    public static final Target INPUT_CREAR_CODIGO_SUPER_SALUD = Target.the("Caja de texto para codigo super salud").located(By.id("escrutinioLoterias_crearLoteria_inputFormulario_codigoSupersalud"));
    public static final Target CHECK_TIPO_SORTEO = Target.the("CheckBox para el tipo sorteo").locatedBy("//label[text()='{0}']");
    public static final Target INPUT_HORA_CIERRE_VENTA = Target.the("Caja de texto para Hora de cierre de venta lotería y sorteo").located(By.id("escrutinioLoterias_crearLoteria_calendarFormulario_horaCierre"));
    public static final Target INPUT_HORA_TRASMISION_SORTEO = Target.the("Caja de texto para Hora de trasmision de  sorteo").located(By.id("escrutinioLoterias_crearLoteria_calendarFormulario_horaTransmision"));
    public static final Target SELECT_DIAS_JUEGO = Target.the("Select para días de Jueego").located(By.cssSelector("[labelcontenedor*='Días de juego']"));
    public static final Target SELECT_DIAS_JUEGO_OPCION = Target.the("Select opcion para días de Jueego").locatedBy("[aria-label='{0}']");
    public static final Target CHECK_ESTADO = Target.the("Botón para dar el estado de la loteria").located(By.cssSelector(".p-inputswitch-slider"));
    public static final Target BTN_GUARDAR_LOTERIA = Target.the("Botón guardar loteria").located(By.xpath("(//*[@id='escrutinioLoterias_crearLoteria_button_guardar'])[2]"));
    public static final Target BTN_CONFIRMAR_SI = Target.the("Botón SI").located(By.id("backoffice_ventanaConfirmacion_boton_si"));
    public static final Target BTN_CONFIRMAR_NO = Target.the("Botón NO").located(By.id("backoffice_ventanaConfirmacion_boton_no"));
    public static final Target MENSAJE_ERROR_ABAJO = Target.the("Indicador de error").located(By.xpath("//*[contains(@class,'p-toast-detail')]"));
    public static final Target BTN_VOLVER = Target.the("Boton para volver a la pantalla filtros").located(By.id("escrutinioLoterias_crearLoteria_button_volver"));
    public static final Target MENSAJE_DEBAJO_DEL_CAMPO = Target.the("Boton para volver a la pantalla filtros").located(By.xpath("//*[@class='ng-star-inserted visible'] //p"));

    public static final Target BOTON_MAS = Target.the("Botón más").located(By.className("rounded-button"));
    public static final Target BOTON_SIG = Target.the("Botón más").located(By.id("loteria_plan_premio_stepPlanPremios_siguiente"));
}
