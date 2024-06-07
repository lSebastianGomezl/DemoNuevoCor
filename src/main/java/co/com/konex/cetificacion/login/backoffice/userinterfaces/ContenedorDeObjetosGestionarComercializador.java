package co.com.konex.cetificacion.login.backoffice.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.xpath;

public class ContenedorDeObjetosGestionarComercializador {

    private ContenedorDeObjetosGestionarComercializador() {
    }

    public static final Target MD_ADMIN = Target.the("Modulo de Administración").locatedBy("//div[contains(text(),'Administración')]");
    public static final Target MENU_MULTINIVEL = Target.the("Menú Multinivel").locatedBy("//div[contains(text(),'Multinivel')]");
    public static final Target SUBMENU_GESTION_COMERCIALIZADOR = Target.the("Submenu gestión comercializador").locatedBy("//span[contains(text(),' Gestión Comercializadores')]");
    public static final Target TEXTO_INPUT_NIT = Target.the("Texto del input NIT").locatedBy("//span[contains(text(),'NIT')]");
    public static final Target TEXTO_INPUT_ASOCIAR_A_EMPRESA = Target.the("Texto de lista desplegable de empresas").locatedBy("//span[contains(text(),'Asociar a Empresa')]");
    public static final Target TEXTO_BTN_CREAR_COMERCIALIZADOR = Target.the("Texto boton crear comercializador").locatedBy("//label[contains(text(),'Crear Comercializador')]");
    public static final Target FILTRO_NIT = Target.the("Campo de filtro NIT").locatedBy("//input[@id='filtroNIT']");
    public static final Target FILTRO_NOMBRE_COMERCIALIZADOR = Target.the("Campo de filtro Nombre comercializador").locatedBy("//input[@id='filtroNombre']");
    public static final Target BTN_VER_FILTROS = Target.the("Botón para contraer o expandir los filtros").locatedBy("//button[@id='backoffice_seccionFiltros_boton_verFiltros']");
    public static final Target BTN_FILTRAR = Target.the("Botón para realizar filtrado").locatedBy("//button[@id='btnFiltar']");
    public static final Target BTN_LIMPIAR = Target.the("Botón limpiar Filtros").locatedBy("//button[@id='btnLimpiarFiltros']");
    public static final Target BTN_CREAR_COMERCIALIZADOR = Target.the("Botón para ingresar a Crear comercializador").locatedBy("//button[@id='backoffice_seccionFiltros_boton_artefacto']");
    public static final Target MSJ_REALIZAR_FILTRO = Target.the("Mensaje de la pantalla de filtros").locatedBy("//p[contains(text(),'Haz clic en el botón filtrar para ')]");
    public static final Target COMBOBOX_ASOCIAR_EMPRESA = Target.the("Lista para asociar comercializador a una empresa").locatedBy("//p-dropdown[@id='idEmpresaGestionComercializador']");
    public static final Target INPUT_NIT = Target.the("Campo para escribir el NIT de la comercializadora").locatedBy("//input[@id='nitGestionComercializador']");
    public static final Target INPUT_RAZON_SOCIAL = Target.the("Campo para escribir la razón social o nombre de la comercializadora").locatedBy("//input[@id='razonSocialGestionComercializador']");
    public static final Target COMBOBOX_PAIS = Target.the("Lista para seleccionar el país de la comercializadora").locatedBy("//p-dropdown[@id='paisCrearEditarComer']");
    public static final Target COMBOBOX_DEPARTAMENTO = Target.the("Lista para seleccionar el departamento de la comercializadora").locatedBy("//p-dropdown[@id='DEPARTAMENTOCrearEditarComer']");
    public static final Target COMBOBOX_REGION = Target.the("Lista para seleccionar la región de la comercializadora").locatedBy("//p-dropdown[@id='REGIONCrearEditarComer']");
    public static final Target COMBOBOX_CIUDAD = Target.the("Lista para seleccionar la ciudad de la comercializadora").locatedBy("//p-dropdown[@id='municipioCrearEditarComer']");
    public static final Target INPUT_DIRECCION = Target.the("Campo para escribir la dirección de la comercializadora").locatedBy("//input[@id='direccioGestionComercializador']");
    public static final Target INPUT_CORREO_ELECTRONICO = Target.the("Campo para escribir el correo electronico de la comercializadora").locatedBy("//input[@id='correoCrearEditarGc']");
    public static final Target INPUT_TELEFONO = Target.the("Campo para escribir el telefono de la comercializadora").locatedBy("//input[@id='telefonoGestionComercializador']");
    public static final Target INPUT_DOMINIO = Target.the("Campo para escribir el dominio de la comercializadora").locatedBy("//input[@id='dominioGestionComercializador']");
    public static final Target SWITCH_ESTADO = Target.the("Inputswitch para definir el estado de la comercializadora").locatedBy("//span[@class='p-inputswitch-slider']");
    public static final Target BTN_SALIR_CREAR_COMERCIALIZADORA = Target.the("Botón para salir del formulario crar comercializadora").locatedBy("//button[@title='Permite regresar a la lista de Comercializadores']");
    public static final Target BTN_CREAR_COMERCIALIZADORA = Target.the("Botón para crear comercializadora").locatedBy("//button[@id='btnEnviarFormularioCrearEditarComercializador']");
    public static final Target BTN_SI_CREAR_COMERCIALIZADOR = Target.the("Botón si para confirmar la creación de un comercializador").locatedBy("//button[@id='backoffice_ventanaConfirmacion_boton_si']");
    public static final Target MSJ_EXITOSO_CREAR_COMERCIALIZADOR = Target.the("Mensaje de éxito al crear un nuevo comercializador").locatedBy("//div[contains(text(),'Se ha creado exitosamente el registro con el código 48 - Comercializador Aguachica.')]");
    public static final Target MSJ_ERROR_AL_INGRESAR_NIT_EXISTENTENTE = Target.the("Mensaje de error al intentar crear un comercializador con un NIT ya existente en el sistema").locatedBy("//div[contains(text(),'Este NIT ya se encuentra creado para otro Comercializador')]");
    public static final Target BTN_NO_CREAR_COMERCIALIZADOR = Target.the("Botón al no crear un nuevo comercializador").locatedBy("//button[@id='backoffice_ventanaConfirmacion_boton_no']");
    public static final Target VENTANA_CONFIRMACION_CREAR = Target.the("Ventana de confirmación al crear comercializador").locatedBy("div[@class='p-dialog-header ng-tns-c42-123 ng-star-inserted']')]");
    public static final Target TD_ASOCIARA = Target.the("Columna para ver la empresa asociada").locatedBy("//th[contains(text(),'ASOCIADO A (EMPRESA)')]");
    public static final Target TD_NIT = Target.the("Columna para ver el nit de la comercializadora en la tabla de registros").locatedBy("//th[contains(text(),'NIT')]");
    public static final Target TD_CODIGO = Target.the("Columna para ver el código o razón social de la comercializadora en la tabla de registros").locatedBy("//th[contains(text(),'NOMBRE COMERCIALIZADOR')]");
    public static final Target TD_PAIS = Target.the("Columna para ver el pais de la comercializadora en la tabla de registros").locatedBy("//th[contains(text(),'PAÍS')]");
    public static final Target TD_DEPARTAMENTO = Target.the("Columna para ver el departamento de la comercializadora en la tabla de registros").locatedBy("//th[contains(text(),'DEPARTAMENTO')]");
    public static final Target TD_CIUDAD = Target.the("Columna para ver la ciudad de la comercializadora en la tabla de registros").locatedBy("//th[contains(text(),'CIUDAD')]");
    public static final Target TD_DIRECCION = Target.the("Columna para ver la direccion de la comercializadora en la tabla de registros").locatedBy("//th[contains(text(),'DIRECCIÓN')]");
    public static final Target TD_DOMINIO = Target.the("Columna para ver el dominio de la comercializadora en la tabla de registros").locatedBy("//th[contains(text(),'DOMINIO')]");
    public static final Target TD_ESTADO = Target.the("Columna para ver el estado de la comercializadora en la tabla de registros").locatedBy("//th[contains(text(),'ESTADO')]");
    public static final Target TD_ACCIONES = Target.the("Columna para ver los estados para la comercializadora en la tabla de registros").locatedBy("//th[contains(text(),'ACCIONES')]");
    public static final Target NIT_BUSCADO = Target.the("NIT del registro buscado").locatedBy("(//tr) //td[2]");
    public static final Target NOMBRE_BUSCAOD = Target.the("Nombre del registro buscado").locatedBy("(//tr) //td[3]");
    public static final Target MSJ_ERROR_FILTRO = Target.the("Mensaje erroneo al filtrar").locatedBy("(//*[contains(@class,'m-0')])[5]");
    public static final Target ICONO_ACTIVAR = Target.the("Icono para activar comercializador").locatedBy("(//i[@title='Activar Comercializador'])[2]");
    public static final Target BTN_SI_ACTIVAR = Target.the("Botón Si para activar un comercializador inactivo").locatedBy("//button[@id='backoffice_ventanaConfirmacion_boton_si']");
    public static final Target MSJ_EXITOSO_ACTIVAR_INACTIVAR = Target.the("Mensaje de exito al activar/inactivar un comercializador").locatedBy("");
    public static final Target MSJ_EXITOSO_ACTIVAR = Target.the("Mensaje de exito al activar un comercializador").locatedBy("//div[contains(text(),'Se ha activado exitosamente el registro con el código 48 - Comercializador Aguachica')]");
    public static final Target MSJ_EXITOSO_INACTIVAR = Target.the("Mensaje de exito al inactivar un comercializador").locatedBy("//div[contains(text(),'Se ha inactivado exitosamente el registro con el código 48 - Comercializador Aguachica')]");
    public static final Target BTN_NO_ACTIVAR = Target.the("Botón No para activar/inactivar un comercializador inactivo/activo").locatedBy("//button[@id='backoffice_ventanaConfirmacion_boton_no']");
    public static final Target VENTANA_CONFIRMACION = Target.the("Ventana de confirmación para activar/inactivar un comercializador").locatedBy("//*[@id=\"confApp\"]/div/div/div[2]/span");
    public static final Target ICONO_INACTIVAR = Target.the("Icono de inactivar un comercializador activo").locatedBy("(//i[@title='Cambiar Estado'])");
    public static final Target BTN_SI_INACTIVAR = Target.the("Botón si para inactivar un comercializador activo").locatedBy("//button[@id='backoffice_ventanaConfirmacion_boton_si']");
    public static final Target BTN_NO_INACTIVAR = Target.the("Botón No para inactivar un comercializador activo").locatedBy("//button[@id='backoffice_ventanaConfirmacion_boton_no']");
    public static final Target ICONO_EDITAR = Target.the("Icono para editar un comercializador").locatedBy("//*[@title=\"Editar\"]");
    public static final Target BTN_EDITAR_COMERCIALIZADOR = Target.the("Botón editar un comercializador").locatedBy("//button[@id='btnEnviarFormularioCrearEditarComercializador']");
    public static final Target BTN_SI_EDITAR = Target.the("Botón Si para editar un comercializador").locatedBy("//button[@id='backoffice_ventanaConfirmacion_boton_si']");
    public static final Target MSJ_EXITOSO_EDITAR = Target.the("Mensaje de éxito al editar un comercializador").locatedBy("//div[contains(text(),'Se ha editado exitosamente el registro con el código 48 - Comercializador Aguachica.')]");
    public static final Target BTN_NO_EDITAR = Target.the("Botón no editar un comercializador").locatedBy("//button[@id='backoffice_ventanaConfirmacion_boton_no']");
    public static final Target VENTANA_CONFIRMACION_EDITAR = Target.the("Ventana de editar comercializador").locatedBy("//div[@class='p-dialog-header ng-tns-c42-1 ng-star-inserted']");
    public static final Target BTN_SALIR_EDITAR = Target.the("Botón salir de ventana editar").locatedBy("//button[@id='btnClosePanelCrearEditarComercializador']");
    public static final Target BTN_SI_VENT_CONFIR = Target.the("Botón SI de ventana de confirmación").locatedBy("//button[@id='backoffice_ventanaConfirmacion_boton_si']");
    //Ajustes Actualizacion HU
    public static final Target TXT_MSJ_INICIO = Target.the("Mensaje pantalla de inicio Gestion Comercializador").locatedBy("//h3[contains(text(),'Gestión Comercializador')]");
    public static final Target TXT_MSJ_CONSULTA_INFO = Target.the("Mensaje pantalla para consultar la información").locatedBy("//p[contains(text(),'Haga clic en el botón consultar para cargar toda la información ')]");
    public static final Target TEXTO_BTN_FILTRAR = Target.the("Texto boton Consultar").locatedBy("//label[contains(text(),'Consultar')]");
    public static final Target TEXTO_BTN_LIMPIAR = Target.the("Texto boton Limpiar").locatedBy("//label[contains(text(),'Limpiar')]");
    public static final Target NIT_BUSCADO_ACTIVAR = Target.the("NIT del registro buscado").locatedBy("//td[contains(text(),'5545555555-8')]");
    public static final Target CAMPO_NIT_EDITAR = Target.the("NIT del registro").located(By.id("nitCrearEditarGd"));
    public static final Target INDICADOR_PAGINACION = Target.the("Columaas mostradas filtros").located(By.cssSelector("[styleclass='p-paginator-bottom']"));

    public static final Target ALERTA_CREACION_EXITOSA = Target.the("Alerta creacion exitosa").located(xpath("//div[contains(@class,'p-toast-detail')]"));
    public static final Target BTN_GUARDAR_COMERCIALIZADORA = Target.the("Botón guardar comercializadora").locatedBy("//button[@id='btnEnviarFormularioCrearEditarComercializador']");
    public static final Target TITULO_MODULO = Target.the("Titulo del modulo").located(By.className("card-panel-header__title"));
    public static final Target SELECT_BUSQUEDA = Target.the("Seleccionar elemento busqueda").locatedBy("[aria-label*='{0}']");
    public static final Target RESULTADO_CONSULTA = Target.the("Campo de alerta de la busqueda").locatedBy("(//tr)[{0}]//td[{1}]");
    public static final Target RESULTADO_CONSULTA_ACTIVA = Target.the("Campo de alerta de la busqueda").locatedBy("(//tr)[{0}]//td[{1}] //i");
    public static final Target NUMERO_PAGINADOR = Target.the("Elementos del paginador").locatedBy("//button[contains(@class,'p-paginator-element') and text()=' {0} ']");
    public static final Target SELECT_OPTION_EMPRESA_ALEATORIO_SPAN = Target.the("Seleccionar empresas por numero span").locatedBy("(//*[@role='option'])[{0}] //span");
    public static final Target SELECT_OPTION_PAIS_ALEATORIO = Target.the("Seleccionar paises por numero").locatedBy("(//*[@role='option'])[{0}]");

    // Alertas de los campos
    public static final Target ALERTA_ERROR_NIT = Target.the("Mensaje alerta campo serie").locatedBy("(//app-mensaje-error-input)[2]");
    public static final Target ALERTA_ERROR_RAZON_SOCIAL = Target.the("Mensaje alerta campo razón social").locatedBy("(//app-mensaje-error-input)[3]");
    public static final Target ALERTA_ERROR_DIRECCION = Target.the("Mensaje alerta campo direccion").locatedBy("(//app-mensaje-error-input)[8]");
    public static final Target ALERTA_ERROR_CORREO = Target.the("Mensaje alerta campo correo electronico").locatedBy("(//app-mensaje-error-input)[9]");
    public static final Target ALERTA_ERROR_TELEFONO = Target.the("Mensaje alerta campo telefono").locatedBy("(//app-mensaje-error-input)[10]");
    public static final Target ALERTA_ERROR_DOMINIO = Target.the("Mensaje alerta campo dominio").locatedBy("(//app-mensaje-error-input)[11]");

    //MODULOS DE ACCESO
    public static final Target MODULO_GESTION_COMERCIAL = Target.the("Modulo de gestion comercial").locatedBy("//*[contains(text(),' Gestión Comercial ')]");
    public static final Target SUB_MODULO_GESTION_POLITICA = Target.the("Submodulo de gestion politica").locatedBy("//span[contains(text(),'Gestión Política')]");
    public static final Target BTN_FILTRAR_GESTION_POLITICA = Target.the("Boton filtRar").locatedBy("//app-button[@inputid='btnFilter']");
    public static final Target BTN_FILTRAR_GESTION_EMPRESARIAL = Target.the("Boton filtRar").locatedBy("//app-button[@inputid='btnFiltrar']");
    public static final Target BTN_FILTRAR_JERARQUIA = Target.the("Boton consultar jerarquia").locatedBy("//app-button[@titulo='Permite consultar las jerarquias']//button[@id='btnFilter']");
    public static final Target BTN_CONFIGURACION_COLOMBIA = Target.the("Boton para parametrizar a colombia y sus regiones").locatedBy("(//i[@title='Configuración'])[6]");
    public static final Target BTN_CONFIGURACION_COSTA_MARFIL = Target.the("Boton para parametrizar a costa marfil y sus regiones").locatedBy("(//i[@title='Configuración'])[9]");
    public static final Target RESULTADO_CONSULTA_REGION = Target.the("Resultado consulta de colombia y sus regiones").locatedBy("(//*[@class='vertical-align-middle'])[{0}]");

}
